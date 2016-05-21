package org.swissbytes.katanumberstoword;


import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sb_dojo
 */
public class ConverterTest {
    
    private Map digits = new HashMap<Integer,String>(){{
        put(1,"one");
        put(2,"two");
        put(3,"three");
        put(4,"four");
        put(5,"five");
        put(6,"six");
        put(7,"seven");
        put(8,"eight");
        put(9,"nine");
        put(0,"zero");
    }};
    
    @Test
    public void testConvertOneDigitToWord() {
        Converter converter = new Converter();
        assertEquals(1, converter.getNumber("one"));
    }
    
    @Test
    public void testConvertWordsToSingleDigit() {
        Converter converter = new Converter();
        assertEquals(1, converter.getNumber("one"));
        assertEquals(2, converter.getNumber("two"));
        assertEquals(3, converter.getNumber("three"));
        assertEquals(4, converter.getNumber("four"));
        assertEquals(5, converter.getNumber("five"));
        assertEquals(6, converter.getNumber("six"));
        assertEquals(7, converter.getNumber("seven"));
        assertEquals(8, converter.getNumber("eight"));
        assertEquals(9, converter.getNumber("nine"));
        assertEquals(0, converter.getNumber("zero"));
    }
    
    @Test
    public void testConvertMixedCasesWordsToSingleDigit() {
        Converter converter = new Converter();
        assertEquals(1, converter.getNumber("oNe"));
        assertEquals(2, converter.getNumber("Two"));
        assertEquals(3, converter.getNumber("three"));
        assertEquals(4, converter.getNumber("FOUR"));
        assertEquals(5, converter.getNumber("fIve"));
        assertEquals(6, converter.getNumber("sIX"));
        assertEquals(7, converter.getNumber("SEven"));
        assertEquals(8, converter.getNumber("eight"));
        assertEquals(9, converter.getNumber("NINE"));
        assertEquals(0, converter.getNumber("zeRO"));
    }
    
    @Test
    public void testConvertWordsWithSpacesToSingleDigit() {
        Converter converter = new Converter();
        assertEquals(1, converter.getNumber("   oNe"));
        assertEquals(2, converter.getNumber("Two  "));
        assertEquals(3, converter.getNumber("   three "));
        assertEquals(4, converter.getNumber("FOUR  "));
        assertEquals(5, converter.getNumber("  fIve"));
        assertEquals(6, converter.getNumber("sIX  "));
        assertEquals(7, converter.getNumber(" SEven  "));
        assertEquals(8, converter.getNumber("eight  "));
        assertEquals(9, converter.getNumber("  NINE"));
        assertEquals(0, converter.getNumber(" zeRO"));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testConvertInvalidWordsToSingleDigit() {
        Converter converter = new Converter();
        assertEquals(1, converter.getNumber("pepepe"));
    }
    
    @Test
    public void testConvertOneWordToDigit() {
        Converter converter = new Converter();
        assertEquals("one", converter.getWord(1));
    }
    
    @Test
    public void testSeventeenToWord(){
        Converter converter = new Converter();
        assertEquals("seventeen", converter.getWord(17));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDigitToWord(){
        Converter converter = new Converter();
        converter.getWord(-1);
    }

}
