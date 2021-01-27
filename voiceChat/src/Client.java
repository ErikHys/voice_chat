import java.net.*;
import java.io.*;

public class Client {

    public Client(String serverName, int port){
        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from client!");

            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server: " + in.readUTF());
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
