import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;


public class passwordvalidationTest {


    @Test
    void passwordValidationTest_whenPasswordLongerThan8Symbols_thenReturnTrue() {
        //given
        String password8Letters = "deadcellsenjoyer";

        //when
        boolean actual = passwordvalidation.passwordIs8letters(password8Letters);

        //then
        assertTrue(actual);

    }
    @Test
    void passwordContainsNumberTest_whenpasswordContainsNumber_theReturnTrue() {
        //given
        String passwordWithNumber = "riskofrain2enjoyer";

        //when
        boolean actual = passwordvalidation.passwordIs8letters(passwordWithNumber);

        //then
        assertTrue(actual);
    }

    @Test
    void  passwordHasCapital
}
