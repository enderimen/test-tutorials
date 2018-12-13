package ignore;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 10.12.2018
 * Time: 10:57
 * Project Name: unit-test-1
 */
public class IgnoreTest {

    @Test
    public void testHello() {
        System.out.println( "Hello test" );
    }

    @Test
    @Ignore
    public void testHelloIgnore() {
        System.out.println( "Hello ignore test" );
    }
}
