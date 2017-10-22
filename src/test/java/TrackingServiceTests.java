import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
//import static org.junit.matchers.JUnitMatchers.*;

/**
 * Created by gbalasubramanian on 22/10/17.
 */
public class TrackingServiceTests {

    TrackingService trackingService;

    @Before
    public void SetupTrackingService(){
        trackingService = new TrackingService();
        trackingService.addProtein(10);
    }

    @Test
    public void NewTrackingServiceTotalIsZero() {
        assertEquals(10, trackingService.getTotal());
//        trackingService.addProtein(100);
//        assertEquals("Inital total is not zero",0, trackingService.getTotal());
    }

    @Test
    @Category(AddCategory.class)
    public void WhenAddingProteinTotalIncreases(){
        //TrackingService trackingService = new TrackingService();
        trackingService.addProtein(30);
        assertEquals("Protein not added", 40, trackingService.getTotal());
    }

    @Test
    public void WhenRemoveProteinTheTotalMatches(){
        System.out.println("Protein in hand:" +trackingService.getTotal());
        trackingService.removeProtein(10);
        assertThat(trackingService.getTotal(),is(0));
        assertThat(trackingService.getTotal(),allOf(is(0),instanceOf(Integer.class)));
        assertEquals("Protein not removed properly", 0,trackingService.getTotal());
    }

    @After
    public void WhenTearDown(){
        trackingService = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void CheckifIllegalArgumentExceptionisTrownOnSettingNegativeGoal(){
        trackingService.setGoal(-1);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(20);

    @Test
    public void CheckifIllegalArgumentExceptionisTrownOnSettingNegativeGoalThrown(){
        expectedException.expect(InvalidArgumentException.class);
        expectedException.expectMessage(containsString("Value cannot be less than zero."));
        expectedException.expectMessage("Value cannot be less than zero.");
        trackingService.setGoal(-1);
    }

    @Test
    public void TimeoutTest(){
        for(int i =0;i<10000000;i++){
            trackingService.addProtein(1);
        }
    }
}
