package Tests;

public class MessageUtil {
    private String message;
    private int a;


    public MessageUtil(String message, int a) {
        this.message = message;
        this.a = a;
    }

    public String printMessage() {
        System.out.println(this.message);
        return this.message;
    }

    public int multipleNumber(){
        a *= 3;
        System.out.println(a);
        return a;
    }

}


