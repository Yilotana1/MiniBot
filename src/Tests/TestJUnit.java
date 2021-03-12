package Tests;

import Tests.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

public class TestJUnit {

    int a = 1;
    String message = "Hello world!";


    @Test
    public void testPrintMessage() {
        MessageUtil util = new MessageUtil(message, a);
        message = "Hello word";
        Assert.assertEquals(message, util.printMessage());
    }
}
