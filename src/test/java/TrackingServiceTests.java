import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

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

}
