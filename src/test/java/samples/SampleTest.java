package samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by trierra on 7/23/15.
 */
    public class SampleTest {
    @Test()
    public void second(){
        System.out.println("web");
        Assert.assertEquals("2", "2");
    }
}
