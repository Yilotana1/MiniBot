package Tests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit2 extends TestCase {

    protected int value1;
    protected int value2;


    @Before
    public void setUp() {
        this.value1 = 5;
        this.value2 = 3;
    }

    @Test
    public void testAdd() {
        System.out.println(value1);
        System.out.println(value2);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("hello world");
    }
}
