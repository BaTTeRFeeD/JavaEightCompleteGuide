package batterfeed.IOBases;

import java.io.*;

public class BRReadLines {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'Стоп' для завершения.");
        
        do{
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
    }
    
}