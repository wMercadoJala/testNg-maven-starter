package samples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test()
    public void first(){
        System.out.println("web");
        Assert.assertEquals("2", "2");
    }
}
