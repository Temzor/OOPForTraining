import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void findErrorNums1() {
        int[] input = new int[]{1, 2, 2, 4};
        int[] result = Solution.findErrorNums(input);
        int[] expected = {2, 3};
        Assert.assertEquals(expected, result);

    }
}