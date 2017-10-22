import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by gbalasubramanian on 22/10/17.
 */
@RunWith(Theories.class)
public class TrackingServiceTheories {

    @DataPoints
    public static int[] data() {
        return new int[]{1, 3, 2, 5, -4, 10};
    }

    @Theory
    public void PositivieValuesShouldResultInPositiveTotals(int value) {
        TrackingService trackingService = new TrackingService();
        trackingService.addProtein(value);
        Assume.assumeTrue(value > 0);
        assertThat(trackingService.getTotal(), greaterThan(0));
    }
}
