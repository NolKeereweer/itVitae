public class ExerciseSeven {
    public static void main(String[] args) {
        String wordString = "Seven";

        byte wholeNumberSmall = 77;
        short wholeNumberMedium = 7777;
        int wholeNumberLarge = 777777777;
        long wholeNumberVeryLarge = 7777777777777L;
        float fractionalNumberMedium = 7.77777F;
        double fractionalNumberLarge = 7.777777777;
        boolean trueOrFalse = true;
        char singleCharacter = 55;

        System.out.println("We've got strings: " + wordString + "\nAnd 8 more datatypes, those 8 are primitive");
        System.out.println("They're the bytes: " + wholeNumberSmall +
            "\nshorts: " + wholeNumberMedium + "\nintegers: " + wholeNumberLarge +
            "\nlongs: " + wholeNumberVeryLarge + "\nfloats: " + fractionalNumberMedium +
            "\ndouble: " + fractionalNumberLarge +
            "\nbooleans, these can only be true or false: " + trueOrFalse +
            "\nand chars: " + singleCharacter);
    }
}