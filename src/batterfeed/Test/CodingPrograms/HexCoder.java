package batterfeed.Test.CodingPrograms;

import java.util.Arrays;

public class HexCoder {
    public static void main(String[] args) {
        String input = "RM LZEIY SIGSELG XJ PTI JJVVASI";
        Arrays.stream(encode(input))
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(decode("54 20 52 4d 4c 46 20 4e 41 54 48 20 58 48 47 41 20 49 44 50 48 4d 56 51 5a 20 4e 47 47 20 4d 5a 45 4b 20 57 20 50 48 49 45 57 20 47 54 58 5a 20 4c 48 55 20 50 52 20 42 47 56 5a 4a 5a 48".split(" ")));
    }

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
