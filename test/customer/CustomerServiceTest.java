package customer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.mock.*;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertNull;


/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 7.12.2018
 * Time: 15:33
 * Project Name: unit-test-1
 */

public class CustomerServiceTest {

    CustomerService customerService;
    CustomerRepository customerRepository;
    InformationService informationService;

    @Before
    public void setUp() throws Exception {

        customerService = new CustomerService();

        customerRepository = Mockito.mock( CustomerRepository.class );
        informationService = Mockito.mock( InformationService.class );

        customerService.setCustomerRepository( customerRepository );
        customerService.setInformationService( informationService );

    }

    @Test
    public void testCustomerSave() {

        Customer customer = new Customer( 123 );

        customerService.saveCustomer( customer );

        Mockito.verify( customerRepository ).saveCustomer( customer );
        Mockito.verify( informationService ).newMailSend( customer );

        /* or  */

        assertNull( customerRepository.findCustomer( customer.getId() ) );
    }

    @Test
    @Ignore("this method will be used later")
    public void testCustomerSaveStub() {


        /*Note: Unlike mock, Stub's operation logic is created with the new keyword instead of creating
        the object with mock. AssertTrue (class_name.method_name.containsValue (current_value))
        when using that object; We can use.
        */

        CustomerRepositoryStubTest customerRepository = new CustomerRepositoryStubTest();

        Customer customer = new Customer( 123 );

        customerService.saveCustomer( customer );

        assertTrue( customerRepository.getCustomerList().containsValue( customer ) );
    }

    @Test
    public void testCustomerDelete() {

        // validation control
        customerService.saveCustomer( new Customer( 123 ) );

        customerService.deleteCustomer( 123 );

        // if customer then null
        assertNull( customerRepository.findCustomer( 123 ) );
    }
}
