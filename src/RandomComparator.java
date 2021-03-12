import java.util.Comparator;
import java.util.Random;

public class RandomComparator implements Comparator<String> {

    public int randomFunction() {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        randomNum = switch (randomNum) {
            case 0 -> 0;
            case 1 -> 1;
            case 2 -> -1;
            default -> 0;
        };
        return randomNum;
    }

    @Override
    public int compare(String o1, String o2) {
        return randomFunction();
    }
}