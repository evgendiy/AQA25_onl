import org.testng.annotations.Test;

public class AUnitTest extends BaseTest {
    @Test
    public void archTest1() {
        System.out.println("AUnitTest1 executed..." + counter);
    }

    @Test
    public void archTest2() {
        System.out.println("AUnitTest2 executed..." + counter);
    }
}
