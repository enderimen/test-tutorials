package mock;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 11.12.2018
 * Time: 09:02
 * Project Name: unit-test-1
 */
public interface DummyCustomerService {

    public void addCustomer(String customerName);
    public void removeCustomer(String customerName);
    public void updateCustomer(String customerName);
    public String getName(String name);
}
