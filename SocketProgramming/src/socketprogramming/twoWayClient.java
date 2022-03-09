

package socketprogramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class twoWayClient
{
    public static void main(String arg[]) throws IOException
    {
        Socket clientSocket = new Socket("localhost",5556);
        //getPort() is used to show remote port of clientSocket
        System.out.println("Client connected with server at server's port : "+clientSocket.getPort());
        // server' s side port for getlocalport()
        System.out.println("Client side  port : "+clientSocket.getLocalPort());
        
        // is used to connect socket to write and reading something at a time 
        DataInputStream messageIn = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream messageOut = new DataOutputStream(clientSocket.getOutputStream());
        String outLine= "";
        String inLine= "";
        BufferedReader buffReader=null;
        
        while(!inLine.equals("end"))
        {
             //writting part of client
        InputStreamReader in=new InputStreamReader(System.in);
        buffReader= new BufferedReader(in);
        outLine=buffReader.readLine();
        messageOut.writeUTF(outLine);
        
        // Reading pardt of client
        inLine=messageIn.readUTF();
        System.out.println("SERVER MESSAGE: "+inLine);  
        }
   
        messageOut.close();
        buffReader.close();
        clientSocket.close();
        buffReader.close();
    }    
    
}
