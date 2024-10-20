package batterfeed.Test.CodingPrograms;

import java.io.*;

public class EncodingTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text="", enc="", encodedStr="";
        int shift = 0;
        String[] encodedStrs = new String[]{};


        try{
            System.out.println("Enter the text...");
            text = br.readLine();

            System.out.println("Enter the shift for Caesar's Cipher...");
            shift = Integer.parseInt(br.readLine());

            System.out.print("Choose the encoding: binary or hex \n(b/h) ");
            enc = br.readLine();
            if(!enc.trim().toLowerCase().equals("b") && !enc.trim().toLowerCase().equals("h"))
                enc = "b";

        } catch(IOException e){
            System.out.println("IO exception!");
        } catch(NumberFormatException e){
            System.out.println("Number format exception!");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        try{
            encodedStr = CaesarCoder.encode(text, shift);
            Thread.sleep(500);

            System.out.println("CAESAR'S ENCODING...\n");

            Thread.sleep(1000);

            System.out.println(encodedStr + "\n");

            Thread.sleep(1000);

            switch(enc){
                case "b":
                    encodedStrs = BinaryCoder.encode(encodedStr, ' ');
                    System.out.print("BINARY ENCODING...\n");
                    break;
                case "h":
                    encodedStrs = HexCoder.encode(encodedStr);
                    System.out.print("HEXADECIMAL ENCODING...\n");
                    break;
            }

            Thread.sleep(1000);

            for(String el : encodedStrs){
                System.out.println(el);
                //Thread.sleep(200);
            }


        }catch(InterruptedException e){
            System.out.print("The thread was interrupted!");
        }

        System.out.print("\nSAVE RESULT TO .TXT FILE?\n(y/n) ");
        if(br.readLine().equals("y")){
            System.out.println("\nPLEASE WAIT...");
            try(FileOutputStream fout = new FileOutputStream("E:\\Files\\result_code.txt")){
                for(int i = 0; i < encodedStrs.length; i++){
                    for(int j = 0; j < encodedStrs[i].length(); j++){
                        fout.write(encodedStrs[i].charAt(j));
                    }
                    fout.write('\n');
                }
                System.out.println("\nFILE SAVED TO \"E:\\Files\\result_code.txt\"");
            }catch (IOException e){
                System.out.println("IO exception!");
            }
        }
    }
}
