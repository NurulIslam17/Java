
package socketprogramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class twoWayServer 
{
    public static void main(String arg[]) throws IOException
           
    {
        ServerSocket handshake = new ServerSocket(5556);
        System.out.println("Server handshake port : "+handshake.getLocalPort());
        
        Socket serverSocket = handshake.accept();
        System.out.println("Server ready to talk with client port : "+serverSocket.getPort());
        System.out.println("Server side communication port : "+serverSocket.getLocalPort());
         
        //serverSocket is used to read so DataInputStream class is used to read the message
        DataInputStream messageIn = new DataInputStream(serverSocket.getInputStream());
        DataOutputStream messageOut = new DataOutputStream(serverSocket.getOutputStream());
        String inLine= "";
        String outLine= "";
        BufferedReader buffReader=null;
         
        while(!inLine.equals("end"))
       {
            // Reading for server side
            inLine=messageIn.readUTF();
            System.out.println("CLIENT MESSAGE : "+inLine);
            
            // writtinf for server side
            InputStreamReader in=new InputStreamReader(System.in);
            buffReader= new BufferedReader(in);
            outLine=buffReader.readLine();
            messageOut.writeUTF(outLine);
       }    
        messageIn.close();
        messageOut.close();
        handshake.close();
        serverSocket.close(); 
        buffReader.close();  
    }
}
