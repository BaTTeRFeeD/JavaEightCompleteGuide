package batterfeed.Test.CodingPrograms;

import java.util.Arrays;

public class CodersTest {
    public static void main(String[] args) {
        String[] strs = {"49", "27", "6D", "20", "69", "6E", "20", "6C", "6F", "76", "65", "20", "77", "69", "74", "68", "20", "56", "69", "6B", "61"};
        String[] strs1 = {"49", "20", "61", "64", "6f", "72", "65", "20", "6d", "79", "20", "53", "74", "65", "70", "61"};

        System.out.println(HexCoder.decode(
                strs1
        ));

        System.out.println();

        System.out.println(
                CaesarCoder.decode("YVH SROXFKLORV! DKDKD WYRM VKLIU WCHCDUBD JRWRY, SULQLPDM UDERWX!", 3));

        //for(String el : HexCoder.encode("Stepa<3Vika")) System.out.print(el + " ");
        //for(String el : HexCoder.encode("128sqrt(e980)")) System.out.print(el + " "); =0
        //for(String el : HexCoder.encode("In love with Vika")) System.out.print(el + " ");
        //for(String el : HexCoder.encode("I want to marry Victoria")) System.out.print(el + " ");
    }
}
