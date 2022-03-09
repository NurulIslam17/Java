
package socketprogramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class client_oneWay
{
    public static void main(String arg[]) throws IOException
    {
        Socket clientSocket = new Socket("localhost",5056);
        //getPort() is used to show remote port of clientSocket
        System.out.println("Client connected with server at server's port : "+clientSocket.getPort());
        // server' s side port for getlocalport()
        System.out.println("Client side  port : "+clientSocket.getLocalPort());
        
        // is used to connect socket to write something
        
        DataOutputStream messageOut = new DataOutputStream(clientSocket.getOutputStream());
        String outLine= "";
        
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader buffReader= new BufferedReader(in);
        
        outLine=buffReader.readLine();
        messageOut.writeUTF(outLine);
        
        messageOut.close();
        buffReader.close();
        clientSocket.close();
   
    }    
}
