import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RomanNumeralsGeneratorTest {
    @Test
    public void shouldReturnIFor1(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(1), equalTo("I"));
    }

    @Test
    public void shouldReturnIIFor2(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(2), equalTo("II"));
    }

    @Test
    public void shouldReturnIIIFor3(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(3), equalTo("III"));
    }

    @Test
    public void shouldReturnIVFor4(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(4),equalTo("IV"));
    }

    @Test
    public void shouldReturnEmptyStringForInvalidInput(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(0), equalTo(""));
        assertThat(rng.romanNumeralRepresentationOf(-1), equalTo(""));
    }

    @Test
    public void shouldReturnVFor5(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(5), equalTo("V"));
    }

    @Test
    public void shouldReturnVIFor6(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(6), equalTo("VI"));
    }

    @Test
    public void shouldReturnVIIFor7(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(7), equalTo("VII"));
    }

    @Test
    public void shouldReturnVIIIFor8(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(8), equalTo("VIII"));
    }

    @Test
    public void shouldReturnIXFor9(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(9), equalTo("IX"));
    }

    @Test
    public void shouldReturnXFor10(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(10), equalTo("X"));
    }

    @Ignore
    public void shouldReturnCorrectNumeralsForThe10s(){
        RomanNumeralsGenerator rng = new RomanNumeralsGenerator();
        assertThat(rng.romanNumeralRepresentationOf(11), equalTo("XI"));
        assertThat(rng.romanNumeralRepresentationOf(12), equalTo("XII"));
        assertThat(rng.romanNumeralRepresentationOf(13), equalTo("XIII"));
        assertThat(rng.romanNumeralRepresentationOf(14), equalTo("XIV"));
        assertThat(rng.romanNumeralRepresentationOf(15), equalTo("XV"));
        assertThat(rng.romanNumeralRepresentationOf(16), equalTo("XVI"));
        assertThat(rng.romanNumeralRepresentationOf(17), equalTo("XVII"));
        assertThat(rng.romanNumeralRepresentationOf(18), equalTo("XVIII"));
        assertThat(rng.romanNumeralRepresentationOf(19), equalTo("XIX"));
    }


}
