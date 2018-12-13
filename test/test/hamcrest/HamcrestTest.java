package test.hamcrest;

import org.junit.Assert;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 10.12.2018
 * Time: 11:13
 * Project Name: unit-test-1
 */
public class HamcrestTest {

    @Test
    public void pairingTest() {

        String text = "Ender";

        // with JUnit
        assertEquals( "Ender", text);

        // with Hamcrest
        assertThat( text, is(equalTo("Ender")) );
        assertThat( text, is(nullValue()) );
        assertThat( text, is(containsString("er")) );
        assertThat( text, is(anyOf(containsString( "End" ),containsString( "er" ))) );
    }

    @Test
    public void citiesList() {
        List<String> cities = new ArrayList<String>( Arrays.asList("Istanbul", "Ankara", "Bursa"));

        assertThat( cities, hasItem( "Istanbul" ) ); // has a Istanbul
        assertThat( cities, hasItems( "Ankara", "Bursa") ); // have Istanbul and Bursa
        assertThat( cities, allOf( hasItem( "Istanbul" ) , not( hasItem( "Izmir" ) ))); // has Istanbul but hasn't Izmir
        assertThat( cities, either( hasItem( "Istanbul" )).or(not( hasItem( "Izmir" ) ))); // has Istanbul or hasn't Izmir

    }
}
