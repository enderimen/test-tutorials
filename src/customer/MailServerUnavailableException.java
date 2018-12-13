package customer;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 10.12.2018
 * Time: 10:28
 * Project Name: unit-test-1
 */
public class MailServerUnavailableException extends RuntimeException {

    public MailServerUnavailableException( String mail_server_error ) {
        super(mail_server_error);
    }
}
