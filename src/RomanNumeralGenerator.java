public class RomanNumeralGenerator {

    public String romanNumeralRepresentationOf(int number) {
        String numeral = "";

        while(number >= 100){
            numeral += "C";
            number -= 100;
        }

        while(number >= 90){
            numeral += "XC";
            number -= 90;
        }

        while(number >= 50){
            numeral += "L";
            number -= 50;
        }

        while(number >= 40){
            numeral += "XL";
            number -= 40;
        }

        while(number >= 10){
            numeral += "X";
            number -= 10;
        }

        while(number >= 9){
            numeral += "IX";
            number -= 9;
        }

        while(number >= 5){
            numeral += "V";
            number -= 5;
        }

        while(number >= 4){
            numeral += "IV";
            number -= 4;
        }

        while(number >= 1){
            numeral += "I";
            number -= 1;
        }

        return numeral;
    }
}
