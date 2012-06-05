import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RomanNumeralGeneratorTest {
    @Test
    public void shouldReturnCorrectRomanNumeralsForSingleDigits(){
        RomanNumeralGenerator rn = new RomanNumeralGenerator();
        assertThat(rn.romanNumeralRepresentationOf(1), equalTo("I"));
        assertThat(rn.romanNumeralRepresentationOf(2), equalTo("II"));
        assertThat(rn.romanNumeralRepresentationOf(3), equalTo("III"));
        assertThat(rn.romanNumeralRepresentationOf(4), equalTo("IV"));
        assertThat(rn.romanNumeralRepresentationOf(5), equalTo("V"));
        assertThat(rn.romanNumeralRepresentationOf(6), equalTo("VI"));
        assertThat(rn.romanNumeralRepresentationOf(7), equalTo("VII"));
        assertThat(rn.romanNumeralRepresentationOf(8), equalTo("VIII"));
        assertThat(rn.romanNumeralRepresentationOf(9), equalTo("IX"));
        assertThat(rn.romanNumeralRepresentationOf(10), equalTo("X"));
    }

    @Test
    public void shouldReturnCorrectNumeralsForThe10s(){
        RomanNumeralGenerator rn = new RomanNumeralGenerator();
        assertThat(rn.romanNumeralRepresentationOf(11), equalTo("XI"));
        assertThat(rn.romanNumeralRepresentationOf(12), equalTo("XII"));
        assertThat(rn.romanNumeralRepresentationOf(13), equalTo("XIII"));
        assertThat(rn.romanNumeralRepresentationOf(14), equalTo("XIV"));
        assertThat(rn.romanNumeralRepresentationOf(15), equalTo("XV"));
        assertThat(rn.romanNumeralRepresentationOf(16), equalTo("XVI"));
        assertThat(rn.romanNumeralRepresentationOf(17), equalTo("XVII"));
        assertThat(rn.romanNumeralRepresentationOf(18), equalTo("XVIII"));
        assertThat(rn.romanNumeralRepresentationOf(19), equalTo("XIX"));
    }

    @Test
    public void shouldReturnCorrectNumeralsForSomeNumbersFrom20to100(){
        RomanNumeralGenerator rn = new RomanNumeralGenerator();
        assertThat(rn.romanNumeralRepresentationOf(20), equalTo("XX"));
        assertThat(rn.romanNumeralRepresentationOf(24), equalTo("XXIV"));
        assertThat(rn.romanNumeralRepresentationOf(40), equalTo("XL"));
        assertThat(rn.romanNumeralRepresentationOf(46), equalTo("XLVI"));
        assertThat(rn.romanNumeralRepresentationOf(49), equalTo("XLIX"));
        assertThat(rn.romanNumeralRepresentationOf(50), equalTo("L"));
        assertThat(rn.romanNumeralRepresentationOf(51), equalTo("LI"));
        assertThat(rn.romanNumeralRepresentationOf(90), equalTo("XC"));
        assertThat(rn.romanNumeralRepresentationOf(99), equalTo("XCIX"));
    }

    @Test
    public void shouldReturnEmptyStringForInvalidInput(){
        RomanNumeralGenerator rn = new RomanNumeralGenerator();
        assertThat(rn.romanNumeralRepresentationOf(0), equalTo(""));
        assertThat(rn.romanNumeralRepresentationOf(-1), equalTo(""));
    }
}
