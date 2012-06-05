public class RomanNumeralsGenerator {
    public String romanNumeralRepresentationOf(int number) {
        String numeral = "";

        if(number > 0 && number < 4){
            String roman_base = "I";
            int arabic_base = 1;
            int isToAppend = number - arabic_base;

            numeral = appendRomanIs(roman_base, isToAppend);
        }

        if(number == 4){
            return "IV";
        }

        if(number == 5){
            return "V";
        }

        if(number > 5 && number < 9){
            String roman_base ="V";
            int arabic_base = 5;
            int isToAppend = number - arabic_base;

            numeral = appendRomanIs(roman_base, isToAppend);
        }

        if(number == 9){
            return "IX";
        }

        if(number == 10){
            return "X";
        }

        if(number > 10 && number <20){
            String roman_base = "X";
            int arabic_base = 10;
            int isToAppend = number - arabic_base;

            numeral = appendRomanIs(roman_base, isToAppend);
        }

        return numeral;
    }

    private String appendRomanIs(String roman_base, int numberToAppend) {
        for(int i = 0; i < numberToAppend; i++){
            roman_base += "I";
        }

        return roman_base;
    }
}
