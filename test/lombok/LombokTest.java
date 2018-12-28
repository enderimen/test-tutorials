package lombok;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 10.12.2018
 * Time: 14:23
 * Project Name: unit-test-1
 */
public class LombokTest {

    @Test
    public void testLombok() throws Exception {

        LombokModel lombok = LombokModel.builder().name( "lombok-deneme" ).build();

        System.out.println( "Name: " + lombok.getName() );
        System.out.println( "HashCode: " + lombok.hashCode() );
        System.out.println( "ToString: " + lombok.toString() );
        System.out.println( "Equals: " + lombok.equals( "lombok" ) );

    }
}