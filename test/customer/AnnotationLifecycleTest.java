package customer;

import org.junit.*;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 7.12.2018
 * Time: 18:38
 * Project Name: unit-test-1
 */
public class AnnotationLifecycleTest {


    @Before
    public void beforeTest() {
        System.out.println( "Test @Before ran" );
    }

    @Test
    public void testHelloWorld() {
        System.out.println( "Test Hello Wold" );
    }

    @After
    public void afterTest() {
        System.out.println( "Test @After ran" );
    }

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println( "Test @BeforeClass ran" );
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println( "Test @AfterClass ran" );
    }

}
