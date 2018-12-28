package suit;

import customer.AnnotationLifecycleTest;
import customer.CustomerRepositoryStubTest;
import customer.CustomerServiceTest;
import customer.MailServerUnavailableException;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 10.12.2018
 * Time: 10:50
 * Project Name: unit-test-1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AnnotationLifecycleTest.class,
        MailServerUnavailableException.class,
        CustomerServiceTest.class,
        CustomerRepositoryStubTest.class,
})

public class SuitTest {

}
