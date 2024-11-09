package batterfeed.Test.CodingPrograms;

public final class VigenereCoderWithSymbols {
    private static final String ENG_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        String text = "YCDCAMIXHCENXRSRFRGC";
        String key = "forever";

        //String resultText = encode(text, key);
        String resultText = decode(text, key);

        System.out.println("RESULT: " + resultText);
    }

    public static String encode(String inputStr, String keyStr){
        String
                text=inputStr.toUpperCase(),
                key=keyStr.toUpperCase(),
                keyString="",
                result="";
        do{
            keyString += key;
        } while(keyString.length() < text.length());
        keyString = keyString.substring(0, text.length()).toUpperCase();
        for(int i = 0; i < text.length(); i++){
            int srcNum = ENG_LETTERS.indexOf(text.charAt(i));
            int keyNum = ENG_LETTERS.indexOf(keyString.charAt(i));
            if(srcNum == -1){
                result += text.charAt(i);
                continue;
            }
            int resNum = srcNum + keyNum > 25 ? srcNum + keyNum - 26 : srcNum + keyNum;
            result += ENG_LETTERS.charAt(resNum);
        }

        return result;
    }

    public static String decode(String inputStr, String keyStr){
        String
                text=inputStr.toUpperCase(),
                key=keyStr.toUpperCase(),
                keyString="",
                result="";
        do{
            keyString += key;
        } while(keyString.length() < text.length());
        keyString = keyString.substring(0, text.length()).toUpperCase();
        for(int i = 0; i < text.length(); i++){
            int srcNum = ENG_LETTERS.indexOf(text.charAt(i));
            int keyNum = ENG_LETTERS.indexOf(keyString.charAt(i));
            if(srcNum == -1){
                result += text.charAt(i);
                continue;
            }
            int resNum = srcNum - keyNum < 0 ? srcNum - keyNum + 26 : srcNum - keyNum;
            result += ENG_LETTERS.charAt(resNum);
        }
        return result;
    }

}