import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(Listener.class)
public class BaseTest {

    public Calculator calculator;

    @BeforeSuite
    public void beforeSuit(){
        calculator = new Calculator();
        System.out.print("**************calculator is initialized**************");
    }

}
