package customer;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 7.12.2018
 * Time: 15:25
 * Project Name: unit-test-1
 */
public class CustomerRepository {

    public void saveCustomer(Customer customer) {
        System.out.println( "Customer saved!" );
    }

    public void deleteCustomer(Integer customerId) {
        System.out.println( "Customer deleted!" );
    }

    public Customer findCustomer(Integer customerId) {
        System.out.println( "Customer found!" );
        return null;
    }
}
