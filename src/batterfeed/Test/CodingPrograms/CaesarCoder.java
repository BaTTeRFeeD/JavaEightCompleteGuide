package batterfeed.Test.CodingPrograms;

public class CaesarCoder {
    private static final String ENG_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encode(String input, int shift){
        if(shift < 0 || shift > 26) return null;
        String output = "";
        String inputStr = input.toUpperCase();

        for(int i = 0; i < inputStr.length(); i++){
            int ch = ENG_LETTERS.indexOf(inputStr.charAt(i));
            if(ch == -1){
                output += inputStr.charAt(i);
                continue;
            }
            int newCh = (ch + shift) > (ENG_LETTERS.length() - 1) ? ch + shift - ENG_LETTERS.length() : ch + shift;
            output += ENG_LETTERS.charAt(newCh);
        }
        return output;
    }

    public static String decode(String input, int shift){
        if(shift < 0 || shift > 26) return null;
        String output = "";
        String inputStr = input.toUpperCase();
        for(int i = 0; i < inputStr.length(); i++){
            int ch = ENG_LETTERS.indexOf(inputStr.charAt(i));
            if(ch == -1){
                output += inputStr.charAt(i);
                continue;
            }
            int newCh = (ch - shift) < 0 ? (ch - shift + ENG_LETTERS.length()) : ch - shift;
            output += ENG_LETTERS.charAt(newCh);
        }
        return output;
    }
}