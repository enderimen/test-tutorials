package customer;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 7.12.2018
 * Time: 15:29
 * Project Name: unit-test-1
 */
public class InformationService {

    public void newMailSend( Customer customer ) {
        System.out.println( "New mail sent!" );
    }

    public void weeklyMailSender() {
        throw new MailServerUnavailableException( "Mail server error" );
    }

}
