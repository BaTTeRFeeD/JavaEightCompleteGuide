package batterfeed.IOBases;
import java.io.*;

public class TinyEdit {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String strs[] = new String [100];
        
        System.out.println("Введите строки текста.");
        System.out.println("Введите \"стоп\" для завершения.");
        
        for(int i=0; i<100; i++){
            strs[i] = br.readLine();
            if(strs[i].equals("стоп")) break;
        }
        
        System.out.println();
        
        for(int i=0; i<100; i++){
            if(strs[i].equals("стоп")) break;
            System.out.println(strs[i]);
        }
    }
    
}