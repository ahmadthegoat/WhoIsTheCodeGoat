import org.junit.Assert;
import org.junit.Test;

public class Problem02Test{
    Problem02 problem02 = new Problem02();
    @Test
    public void problem02Test(){
        int given = 3;
        int expectedsum = 15;
        int testsum = 0;
        int[][] testarray = problem02.squarebuilder(given);
        for (int row = 0; row < given; row++) {
            for (int col = 0; col < given; col++){
            testsum += (testarray[row][col]);
            }
        }
        testsum /= given;
        Assert.assertEquals(expectedsum,testsum);
    }
    @Test
    public void problem02Test1(){
        int given = 5;
        int expectedsum = 65;
        int testsum = 0;
        int[][] testarray = problem02.squarebuilder(given);
        for (int row = 0; row < given; row++) {
            for (int col = 0; col < given; col++){
                testsum += (testarray[row][col]);
            }
        }
        testsum /= given;
        Assert.assertEquals(expectedsum,testsum);
    }
    @Test
    public void problem02Test2(){
        int given = 7;
        int expectedsum = 175;
        int testsum = 0;
        int[][] testarray = problem02.squarebuilder(given);
        for (int row = 0; row < given; row++) {
            for (int col = 0; col < given; col++){
                testsum += (testarray[row][col]);
            }
        }
        testsum /= given;
        Assert.assertEquals(expectedsum,testsum);
    }
}