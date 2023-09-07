public class CaesarCode {
    public static void main(String[] args) {
        String test = "TESTINGXYZ";
        char[] output; // creates array
        output = new char[test.length()]; // 

        for (int i = 0; i < test.length(); i++) {
            output[i] = (char) (((int) test.charAt(i) - 'A' + 3) % 26 + 'A');
            }
        System.out.println(new String(output));
    }
}
