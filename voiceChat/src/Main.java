import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Thread server = new Server(6066);
            server.start();
        }catch (Exception e){
            e.printStackTrace();
        }
        Client client = new Client("localhost", 6066);

    }
}
