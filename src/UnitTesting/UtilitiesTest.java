package UnitTesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
private Utilities util;

@Before
public void setUp(){
    util = new Utilities();

}

    @Test
    public void everyNthChar() throws Exception {
       // fail("This test has not been implemented");//To let this method fail
        char[] output = util.everyNthChar(new char[]{'h','e','l','l','o'},2);
        assertArrayEquals(new char[]{'e','l'},output);
        char[] output2 = util.everyNthChar(new char[]{'j','i','m','m','y'},6);
        assertArrayEquals(new char[] {'j','i','m','m','y'}, output2);
    }

    @Test
    public void removePair()throws Exception {
       // fail("This test has not been implemented");

        assertEquals("ABCDEF",util.removePair("AABCDDEFF"));
        assertEquals("ABCABDEF",util.removePair("ABCCAABDEEF"));
        assertEquals("ABCE",util.removePair("AABBCCEE"));
       assertNull("Did not get null returned when argument passed was null",util.removePair(null));
        assertEquals("A",util.removePair("A"));
        assertEquals("",util.removePair(""));
    }

    @Test
    public void converter() throws Exception {
        //fail("This test has not been implemented");

        int convert1 = util.converter(10,5);

        assertEquals(300,convert1);


    }

    @Test(expected = ArithmeticException.class)
    public void conveter_arithmeticException()throws Exception{
        util.converter(10, 0);

    }

    @Test
    public void nullIfOddLength() throws Exception{
       // fail("This test has not been implemented");

        String testEven = util.nullIfOddLength("Osei");
        assertEquals("Osei",testEven);

        String testOdd = util.nullIfOddLength("Jimmy");
        assertEquals(null,testOdd);

        //simple test
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}