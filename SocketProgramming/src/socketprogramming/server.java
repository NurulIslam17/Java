package socketprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String arg[]) throws IOException {
        ServerSocket handshake = new ServerSocket(5056);
        System.out.println("Server handshake port : " + handshake.getLocalPort());

        Socket serverSocket = handshake.accept();
        System.out.println("Server ready to talk with client port : " + serverSocket.getPort());
        System.out.println("Server side communication port : " + serverSocket.getLocalPort());

        //serverSocket is used to read so DataInputStream class is used to read the message
        DataInputStream messageIn = new DataInputStream(serverSocket.getInputStream());
        String inLine = "";

        inLine = messageIn.readUTF();
        System.out.println("Information from Client : " + inLine);

        messageIn.close();
        handshake.close();
        serverSocket.close();
    }

}
