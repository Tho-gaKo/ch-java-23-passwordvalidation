import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;


public class passwordvalidationTest {


    @Test
    void passwordValidationTest_whenPasswordLongerThan8Symbols_thenReturnTrue() {
        //given
        String password8Letters = "deadcellsenjoyer";
        int blau = 39;

        //when
        boolean actual = passwordvalidation.passwordIs8letters(blau);

        //then
        assertTrue(actual);

    }
    @Test
    void passwordContainsNumberTest_whenpasswordContainsNumber_theReturnTrue() {
        //given
        String passwordWithNumber = "riskofrain2enjoyer";
        int blau = 39;
        //when
        boolean actual = passwordvalidation.passwordIs8letters(blau);

        //then
        assertTrue(actual);
    }

    @Test
    void  passwordHasCapital_whenPasswordHasCapitalLetter_theReturnTrue() {
        //given
        String passwordHasCapitalLetter = "AVERAGESKULENJOYER";
        int blau = 39;

        //when
        boolean actual = passwordvalidation.passwordIs8letters(blau);


        //then
        assertTrue(actual);

    }

    @Test
    void passwordHasLowercaaseLetter_whenpasswordHasLowercaseLetter_thenReturnTrue() {
        //given
        String passwordHasLowercaseLetter  = "thebindingofisaac";
        int blau = 39;
        //when
        boolean actual = passwordvalidation.passwordIs8letters(blau);

        //then
        assertTrue(actual);
    }

    @Test
    void passwordHasSpecialCharacters_whenPasswordHasSpecialCharacter_theReturnTrue() {
        //given
        String passwordHasSpecialCharacters = "TheTalesOfMaj*Eyal";
        int blau = 39;

        //when
        boolean actual = passwordvalidation.specialChrPassword(passwordHasSpecialCharacters);

        //then
        assertTrue(actual);

    }

}
