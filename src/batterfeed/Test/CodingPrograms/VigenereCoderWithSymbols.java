package batterfeed.Test.CodingPrograms;

public final class VigenereCoderWithSymbols {
    private static final String ENG_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
//        String text = "T RMLF NATH XHGA IDPHMVQZ NGG MZEK W PHIEW GTXZ LHU PR BGVZJZH";
//        String key =  "love you to the moon and back";MSNEIXJYCDEMVPAWTXJVZF

//        String text =
//                "BSRPGHIJODSAQVJHZRBEGJFJSIAYTKZPGQRPSLWCEGUM." +
//                "FPXZYWJQPGYGSKXZVZKTRXZKZASJCJYRUSIWJRNMCJYMTRXGVWVPCDCLVYVVFAJ." +
//                "WYKYVZWCEGUSEWJRCDCEGZMEFPZPGMFS." +
//                "RRYMRRHYEOPLHYPRPQSJF." +
//                "MGSMJMFYQMBF.";

//        String text = "NZFZZCFZJZOVEEIWNMGPDFFICTSL";
        String text = "RMCSQI,XHVTV,PTIRVZQPFBXIG,RSRZRHCCNTVMRMCQBVZZVSJZZIQIZSOYIVVKQWBITSLWGRKVME!";

        String key =  "forever";

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
            //int resNum = srcNum - keyNum < 0 ? srcNum - keyNum + 26 : srcNum - keyNum;
            int resNum;
            if((srcNum - keyNum) < 0){
                resNum = srcNum - keyNum;
                do{
                    resNum += 26;
                } while (resNum < 26);
                resNum -= 26;
            } else{
                resNum = srcNum - keyNum;
                if(resNum > 25){
                    do{
                        resNum -= 26;
                    } while (resNum >= 0);
                    resNum += 26;
                }
            }
            result += ENG_LETTERS.charAt(resNum);
        }
        return result;
    }

}