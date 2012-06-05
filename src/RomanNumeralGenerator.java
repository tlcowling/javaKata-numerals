public class RomanNumeralGenerator {

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

        if(number > 10 && number <14){
            String roman_base = "X";
            int arabic_base = 10;
            int isToAppend = number - arabic_base;

            numeral = appendRomanIs(roman_base, isToAppend);
        }

        if(number == 14){
            return "XIV";
        }

        if(number == 15){
            return "XV";
        }

        if(number > 15 && number < 19){
            String roman_base = "XV";
            int arabic_base = 15;
            int isToAppend = number-arabic_base;

            numeral = appendRomanIs(roman_base, isToAppend);
        }

        if(number == 19){return "XIX";}
        if(number == 20){return "XX";}

        return numeral;
    }

    private String appendRomanIs(String roman_base, int numberToAppend) {
        for(int i = 0; i < numberToAppend; i++){
            roman_base += "I";
        }

        return roman_base;
    }
}
