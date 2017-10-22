import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fax6 on 22/10/17.
 */
@RunWith(Parameterized.class)
public class ParameterizedTests {

    private static TrackingService trackingService = new TrackingService();
    private final int input;
    private final int expectedValues;


    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 5},
                {5, 10},
                {-12, 0},
                {50, 50},
                {1, 51}
        });
    }

    public ParameterizedTests(int input, int expectedValues) {

        this.input = input;
        this.expectedValues = expectedValues;
    }

    @Test
    public void ExecuteParameterizedTests() {
        System.out.println("Current Input: "+ input);
        if (input > 0) {
            trackingService.addProtein(input);
        } else {
//            System.out.println(trackingService.getTotal());
            trackingService.removeProtein(Math.abs(input));

        }

        assertEquals(expectedValues,trackingService.getTotal());
    }
}