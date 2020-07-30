import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem04Test {

    Problem04 problem04 = new Problem04();
    @Test
    public void Problem04test(){
        Integer[] given = {10, 3, 5, 6, 2};
        Integer[] expected = {180, 600, 360, 300, 900};
        Integer[] outcome = problem04.problem04(given);

        assertEquals(expected,outcome);
    }

    @Test
    public void Problem04test1(){
        Integer[] given = {12,20};
        Integer[] expected = {20,12};
        Integer[] outcome = problem04.problem04(given);

        assertEquals(expected,outcome);
    }

}
