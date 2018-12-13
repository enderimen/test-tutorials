package mock;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 11.12.2018
 * Time: 09:33
 * Project Name: unit-test-1
 */
public class WhenThenTest {

    @Test
    public void testWhenThen() throws Exception {

        DummyCustomerService customerService = mock( DummyCustomerService.class );
        String name = customerService.getName( "Ender" );

        when( customerService.getName( eq( "Ender" ) ) ).thenReturn( "Customer Ender" );
        when( customerService.getName( eq( "Ender" ) ) ).thenThrow( new RuntimeException(  ));

    }

    @Test
    public void testVoidMethodThen() throws Exception {

        DummyCustomerService customerService = mock( DummyCustomerService.class );
        String name = customerService.getName( "Ender" );

        doNothing().when( customerService ).addCustomer( anyString() );

    }

}
