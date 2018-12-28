package mock;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 11.12.2018
 * Time: 08:59
 * Project Name: unit-test-1
 */
public class BehaviorTest {

    @Test
    public void testBehavior() throws Exception {

        DummyCustomerService customerService = mock( DummyCustomerService.class );
        customerService.addCustomer( "Istanbul" );
        customerService.addCustomer( "Izmir" );

        verify( customerService ).addCustomer( "Istanbul" );
        verify( customerService ).addCustomer( "Izmir" );

    }

    @Test
    public void testHowManyTimesWasCalled() throws Exception {

        DummyCustomerService customerService = mock( DummyCustomerService.class );
        customerService.addCustomer( "Istanbul" );
        customerService.addCustomer( "Istanbul" );
        customerService.addCustomer( "Izmir" );
        customerService.addCustomer( "Izmir" );
        customerService.addCustomer( "Izmir" );

        verify( customerService, times( 2 ) ).addCustomer( "Istanbul" );
        verify( customerService, times( 3 ) ).addCustomer( "Izmir" );

    }

    @Test
    public void testHowManyTimesWasNotCalled() throws Exception {

        DummyCustomerService customerService = mock( DummyCustomerService.class );

        verify( customerService, never() ).removeCustomer( anyString() );
        verify( customerService, never() ).updateCustomer( anyString() );
    }

    @Test
    public void testAtLeastTwoTimeWasCalled() throws Exception {

        DummyCustomerService customerService = mock( DummyCustomerService.class );

        verify( customerService, atLeast( 1 ) ).addCustomer( "Istanbul" );
        verify( customerService, atLeast( 2 ) ).addCustomer( "Izmir" );
    }

    @Test
    public void testInTurnCalled() throws Exception {

        DummyCustomerService customerService = mock( DummyCustomerService.class );

        InOrder inOrder = inOrder( customerService );

        customerService.addCustomer( "Istanbul" );
        customerService.addCustomer( "Izmir" );

        inOrder.verify( customerService ).addCustomer( "Istanbul" ); // 1 - 2
        inOrder.verify( customerService ).addCustomer( "Izmir" );    // 2 - 1
    }

}
