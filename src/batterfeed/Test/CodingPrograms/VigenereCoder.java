package batterfeed.Test.CodingPrograms;

public final class VigenereCoder {
    private static final String ENG_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        String text = "program";
        String key = "key";

        String encodedText = encode(text, key);
        String decodedText = decode(encodedText, key);

        System.out.println("ENCODE: " + encodedText);
        System.out.println("DECODE: " + decodedText);
    }

    public static final String encode(String inputStr, String keyStr){
        String
                text=makeStringCorrect(inputStr),
                key=makeStringCorrect(keyStr),
                keyString="",
                result="";
        do{
            keyString += key;
        } while(keyString.length() < text.length());
        keyString = keyString.substring(0, text.length()).toUpperCase();
        for(int i = 0; i < text.length(); i++){
            int srcNum = ENG_LETTERS.indexOf(text.charAt(i));
            int keyNum = ENG_LETTERS.indexOf(keyString.charAt(i));
            int resNum = srcNum + keyNum > 25 ? srcNum + keyNum - 26 : srcNum + keyNum;
            result += ENG_LETTERS.charAt(resNum);
        }

        return result;
    }

    public static final String decode(String inputStr, String keyStr){
        String
                text=makeStringCorrect(inputStr),
                key = makeStringCorrect(keyStr),
                keyString="",
                result="";
        do{
            keyString += key;
        } while(keyString.length() < text.length());
        keyString = keyString.substring(0, text.length()).toUpperCase();
        for(int i = 0; i < text.length(); i++){
            int srcNum = ENG_LETTERS.indexOf(text.charAt(i));
            int keyNum = ENG_LETTERS.indexOf(keyString.charAt(i));
            int resNum = srcNum - keyNum < 0 ? srcNum - keyNum + 26 : srcNum - keyNum;
            result += ENG_LETTERS.charAt(resNum);
        }
        return result;
    }

    private static final String makeStringCorrect(String input){
        String result = "";
        for(int i = 0; i < input.length(); i++){
            result += ENG_LETTERS.indexOf(input.toUpperCase().charAt(i)) >= 0 ? input.charAt(i) : "";
        }
        return result.toUpperCase();
    }

}