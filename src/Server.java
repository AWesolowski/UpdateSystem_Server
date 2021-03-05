import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

    static final int PORT = 1234;





    public static void main(String[] args)
    {
        ServerSocket serverSocket;
        Socket socket;

        try
        {
            serverSocket = new ServerSocket(PORT);
            socket = serverSocket.accept();

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());










            // close everything
            inputStream.close();
            outputStream.close();
            socket.close();
            serverSocket.close();

            System.out.println("bye bye");
        }
        catch (IOException e)
        {
            System.err.println("Server exeption : " + e);
        }

    }
}
