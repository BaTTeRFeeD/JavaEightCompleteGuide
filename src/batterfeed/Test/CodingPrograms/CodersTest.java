package batterfeed.Test.CodingPrograms;

public class CodersTest {
    public static void main(String[] args) {
        String[] strs = {
                "41F",
                "420",
                "418",
                "412",
                "415",
                "422"
        };
        System.out.println(HexCoder.decode(strs));
    }
}
