import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

/**
 * Created by gbalasubramanian on 22/10/17.
 */
public class HistoryItemTest {
    HistoryItem historyItem;

    @BeforeClass
    public static void SetupClass() {
    }

    @Before
    public void Setup() {
        historyItem = new HistoryItem(1, 100, "add", 100);
    }

    @Test
    @Category(AddCategory.class)
    public void TestInitialVaule() {
        assertEquals(100, historyItem.getAmount());
    }
}
