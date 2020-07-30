import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem01Test {

    Problem01 problem01 = new Problem01();
    @Test
    public void problem01test(){

        String expected = "2 3 5 7 ";
        Integer placenumber = 10;
        String given = problem01.problem01(placenumber);

        assertEquals(expected,given);
    }

    @Test
    public void problem01test1(){

        String expected = "2 3 5 7 11 13 17 19 ";
        Integer placenumber = 20;
        String given = problem01.problem01(placenumber);

        assertEquals(expected,given);
    }
}
