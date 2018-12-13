package customer;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 7.12.2018
 * Time: 15:21
 * Project Name: unit-test-1
 */
public class CustomerService {

    private CustomerRepository customerRepository;
    private InformationService informationService;

    public void saveCustomer(Customer customer) {
        customerRepository.saveCustomer( customer );
        informationService.newMailSend( customer );
    }

    public void deleteCustomer(Integer customerId) {
        customerRepository.deleteCustomer( customerId );
    }

    public void setCustomerRepository( CustomerRepository customerRepository ) {
        this.customerRepository = customerRepository;
    }

    public void setInformationService( InformationService informationService ) {
        this.informationService = informationService;
    }
}
