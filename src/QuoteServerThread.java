import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.logging.Logger;

public class QuoteServerThread extends Thread {

    protected DatagramSocket socket = null;
    protected BufferedReader in = null;
    protected boolean moreQuotes = true;
    private final static Logger LOGGER = Logger.getLogger(QuoteServerThread.class.getName());

    public QuoteServerThread() throws IOException {
        this("QuoteServerThread");
    }

    public QuoteServerThread(String name) throws IOException {
        super(name);
        socket = new DatagramSocket(53);

        try {
            in = new BufferedReader(new FileReader("one-liners.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Could not open quote file. Serving time instead.");
        }
    }

    public void run() {

        while (true) {
            try {
                byte[] query = new byte[512];

                // receive DNS query
                DatagramPacket packet = new DatagramPacket(query, query.length);
                socket.receive(packet);

                LOGGER.info(packet.getAddress().toString());
                test(query);

            } catch (IOException e) {
                System.out.println("failed");
                e.printStackTrace();
                moreQuotes = false;
            }
        }
    }
    private void test(byte[] hexString) {
        for (byte x: hexString) {
            System.out.print(x + " ");
        }
    }
}