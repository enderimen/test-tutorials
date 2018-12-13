package customer;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 10.12.2018
 * Time: 10:31
 * Project Name: unit-test-1
 */
public class MailServerUnavailableExceptionTest {

    // There are three different error capture test methods in the following scenarios.
    InformationService informationService = new InformationService();

    // first test method
    @Test
    public void testTryCatchException() {
        try {

            informationService.weeklyMailSender();

        }catch (Exception ex){
            assertTrue( ex instanceof MailServerUnavailableException );
            assertEquals( "Mail server error",  ex.getMessage() );
        }
    }


    // second test method
    @Test(expected = MailServerUnavailableException.class)
    public void testExpectedException() throws Exception{

        informationService.weeklyMailSender();
    }

    // we are catch the error for define variable from Exception Type
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // third test method
    @Test
    public void testRuleException() {

        thrown.expect( MailServerUnavailableException.class );
        thrown.expectMessage( "Mail server error" );
        informationService.weeklyMailSender();
    }
}
