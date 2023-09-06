public class ExerciseSix {
	public static void main(String[] args) {
	    String wordString = "Six";
		
		byte wholeNumberSmall = 66;
                short wholeNumberMedium = 6666;
		int wholeNumberLarge = 6666666;
		long wholeNumberVeryLarge = 6666666666666L;
		float fractionalNumberMedium = 6.66666F;
		double fractionalNumberLarge = 6.666666666;
		boolean trueOrFalse = true;
		char singleCharacter = 54;
		
		System.out.println("We've got strings: " + wordString + "\nAnd 8 more datatypes, those 8 are primitive");
                System.out.println("They're the bytes: " + wholeNumberSmall +
                    "\nshorts: " + wholeNumberMedium + "\nintegers: " + wholeNumberLarge +
                    "\nlongs: " + wholeNumberVeryLarge + "\nfloats: " + fractionalNumberMedium +
                    "\ndouble: " + fractionalNumberLarge +
                    "\nbooleans, these can only be true or false: " + trueOrFalse +
                    "\nand chars: " + singleCharacter);
    }
}
