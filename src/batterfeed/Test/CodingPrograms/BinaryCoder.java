package batterfeed.Test.CodingPrograms;

public class BinaryCoder {
    public static void main(String[] args) {
        System.out.println(decode(new String[]{"01101000", "01100101", "01101100", "01101100", "01101011", "01110101", "01101111", "01110010", "01101100", "01100101"}));
    }

    public static String[] encode(String text, char c){
        String[] result = new String[text.length()];
        for(int i = 0; i < text.length(); i++){
            int ch = (int)text.charAt(i);
            String str = Integer.toBinaryString(ch);
            while(str.length() < 8) str = "0" + str;
            String formattedStr = str.substring(0, 4) + c + str.substring(4, 8);
            result[i] = formattedStr;
        }
        return result;
    }

    public static String[] encode(String text){
        String[] result = new String[text.length()];
        for(int i = 0; i < text.length(); i++){
            int ch = (int)text.charAt(i);
            String str = Integer.toBinaryString(ch);
            while(str.length() < 8) str = "0" + str;
            result[i] = str;
        }
        return result;
    }

    public static String decode(String[] bytes){
        String result = "";
        for(int i = 0; i < bytes.length; i++){
            String byteStr = "";
            for(int j = 0; j < bytes[i].length(); j++) if(Character.isDigit(bytes[i].charAt(j))) byteStr += bytes[i].charAt(j);
            char ch = (char)Integer.parseInt(byteStr, 2);
            result += ch;
        }
        return result;
    }
}
