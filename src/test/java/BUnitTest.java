import org.testng.annotations.Test;

public class BUnitTest extends BaseTest{
    @Test
    public void archTest1() {
        System.out.println("BUnitTest1 executed..." + counter);
    }

    @Test
    public void archTest2() {
        System.out.println("BUnitTest2 executed..." + counter);
    }
}
