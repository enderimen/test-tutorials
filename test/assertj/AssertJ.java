package assertj;

import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 10.12.2018
 * Time: 16:24
 * Project Name: unit-test-1
 */
public class AssertJ {

    List<String> citiesOfTurkeyList = new ArrayList<String>( Arrays.asList("Istanbul", "Bursa", "Hakkari", "Manisa") );
    List<String> citiesOfFranceList = new ArrayList<String>( Arrays.asList("Paris", "Lyon", "Nice", "Marsilya") );

    List<String> mixCitiesList = new ArrayList<String>( Arrays.asList("Paris", "Lyon", "Nice","Istanbul", "Manisa") );

    @Test
    public void testStrings() throws Exception {

        String text = "Istanbul";

        assertThat(text)
                .isEqualTo( "Istanbul" )    // at least one "istanbul"
                .startsWith( "Ist" )        // may be start "Ist"
                .endsWith( "bul" )          // may be end "bul"
                .contains( "tan" )          // is there a one "tan" in inside
                .isNotEmpty()               // not empty
                .isNotNull()                // not null
                .doesNotContain( "İzmit" )  // not "İzmir"
                .containsOnlyOnce( "tan" )  // at least one "tan"
                .describedAs( "Error message changed!" ); // error message customized

        assertThat(citiesOfFranceList).have( citiesOfTurkeyList() ); // is there any city name inside of citiesOfTurkeyList in citiesOfFranceList
    }

    @Test
    public void testAssertjCondition() throws Exception {


        /* below code
        *  is there two city name inside citiesOfTurkeyList and three city name inside citiesOfFranceList
        * */
        assertThat( mixCitiesList )
                .haveExactly( 2, citiesOfTurkeyList() )
                .haveExactly( 3, citiesOfFranceList() );
    }

    private Condition<? super String> citiesOfTurkeyList() {
        return new Condition<String>(  ){
            @Override
            public boolean matches( String city ) {
                return citiesOfTurkeyList.contains( city ); // is there
            }
        };
    }

    private Condition<? super String> citiesOfFranceList() {
        return new Condition<String>(  ){
            @Override
            public boolean matches( String city ) {
                return citiesOfFranceList.contains( city ); // is there
            }
        };
    }
}
