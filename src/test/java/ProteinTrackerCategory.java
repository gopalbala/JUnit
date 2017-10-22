import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by gbalasubramanian on 22/10/17.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(AddCategory.class)
@Suite.SuiteClasses({HistoryItemTest.class,TrackingServiceTests.class})
public class ProteinTrackerCategory {
}
