import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ConsoleRequester {


    // 00 - stop all work with console
    // 01 - work with learning
    // 10 - work with speaking


    public void start(HashMap<String, ArrayList<String>> db) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Если вы хотите выбрать режим learning нажмите 01, если хотите начать speaking нажмите 10, " +
                "чтобы остановать работу целиком нажмите 00");
        int functionId;
        functionId = scan.nextInt();

        while (true) {

            if (functionId == 00) {
                System.out.println("Work is done");
                break;
            }

            if (functionId == 01) {
                functionId = learning(db, scan);
            }

            if (functionId == 10) {
                functionId = speaking(db, scan);
            }
        }


    }


    public int checkCode(String nextLine) {
        int code;
        try {
            code = Integer.parseInt(nextLine);
        } catch (NumberFormatException e) {
            return -1;
        }
        return code;
    }


    private int learning(HashMap<String, ArrayList<String>> db, Scanner scan) {

        String question;
        String answer;
        ArrayList<String> arr;
        ArrayList<String> answers;

        while (true) {
            System.out.println("Put your question down into the next line");
            question = scan.nextLine();

            int code = checkCode(question);
            if (code != -1) {
                return code;
            }
            System.out.println("Put your answer down into the next line");
            answer = scan.nextLine();

            if (db.containsKey(question)) {
                answers = db.get(question);
                answers.add(answer);
                answers.sort(new RandomComparator());

            } else {
                arr = new ArrayList<>();
                arr.add(answer);
                db.put(question, arr);
            }
        }
    }


    private int speaking(HashMap<String, ArrayList<String>> db, Scanner scan) {

        String question;
        ArrayList<String> arr;
        int midIndex;
        String answer;

        while (true) {
            question = scan.nextLine();

            int code = checkCode(question);
            if (code != -1) {
                return code;
            }
            arr = db.get(question);
            midIndex = (arr.size() - 1) / 2;
            answer = arr.get(midIndex);
            System.out.println(answer);
        }

    }
}

