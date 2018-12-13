package customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 7.12.2018
 * Time: 16:40
 * Project Name: unit-test-1
 */

public class CustomerRepositoryStubTest extends CustomerRepository {

    private Map<Integer, Customer> customerList = new HashMap<Integer, Customer>( );

    @Override
    public void saveCustomer( Customer customer ) {
        customerList.put( customer.getId(), customer );
    }

    @Override
    public void deleteCustomer( Integer customerId ) {
        customerList.remove( customerId );
    }

    @Override
    public Customer findCustomer( Integer customerId ) {
        return customerList.get( customerId );
    }

    public Map<Integer, Customer> getCustomerList() {
        return customerList;
    }
}
