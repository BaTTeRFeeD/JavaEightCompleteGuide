package batterfeed.Test.CodingPrograms;

public class HexCoder {
    public static String[] encode(String text){
        String[] result = new String[text.length()];
        for(int i = 0; i < text.length(); i++){
            int ch = (int)text.charAt(i);
            result[i] = Integer.toHexString(ch).toUpperCase();
        }
        return result;
    }

    public static String decode(String[] bytes){
        String result = "";
        for(int i = 0; i < bytes.length; i++){
            String byteStr = "";
            for(int j = 0; j < bytes[i].length(); j++) byteStr += bytes[i].charAt(j);
            char ch = (char)Integer.parseInt(byteStr, 16);
            result += ch;
        }
        return result;
    }
}
