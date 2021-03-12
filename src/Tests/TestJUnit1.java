package Tests;

import org.junit.Assert;
import org.junit.Test;

public class TestJUnit1 {



    @Test
    public void addTest(){
        int num = 5;
        String str = "Test is working fine";
        String temp = null;

        Assert.assertFalse(num > 6);

        Assert.assertEquals("Test is working fine", str);

        Assert.assertNotNull(temp);

    }


}
