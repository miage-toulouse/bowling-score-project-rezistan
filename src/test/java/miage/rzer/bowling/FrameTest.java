package miage.rzer.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrameTest {

    @Test
    public void getSommeTest() {
        //given: un Frame valide
        Frame frame = new Frame(5, 4, null);
        //when: on calcule la somme
        int somme = frame.getSomme();
        //then: somme <= 10
        assertTrue(somme <= 10);
    }

    @Test
    public void isValidTest() {
        //given: un Frame valide
        Frame frame = new Frame(10, null);
        //when: on teste la validité
        boolean val = frame.isValid();
        //then: c vrai
        assertTrue(val);

        //given: un Frame valide
        frame = new Frame(3, 7, null);
        //when: on teste la validité
        val = frame.isValid();
        //then: c vrai
        assertTrue(val);
    }


    @Test
    public void isNotValidTest() {
        //given: un Frame valide
        Frame frame = new Frame(1, null);
        //when: on teste la validité
        boolean val = frame.isValid();
        //then: c vrai
        assertFalse(val);

        //given: un Frame valide
        frame = new Frame(4, 7, null);
        //when: on teste la validité
        val = frame.isValid();
        //then: c vrai
        assertFalse(val);

        //given: un Frame valide
        frame = new Frame(null, 7, null);
        //when: on teste la validité
        val = frame.isValid();
        //then: c vrai
        assertFalse(val);
    }

}