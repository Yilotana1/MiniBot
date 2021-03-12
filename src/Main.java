import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> db = new HashMap<>();
        ConsoleRequester requester = new ConsoleRequester();
        requester.start(db);
        System.out.println(db.toString());

    }
}


