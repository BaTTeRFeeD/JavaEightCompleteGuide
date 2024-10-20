package batterfeed.IOBases;

import java.io.*;

public class ShowFile{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        int i;
        
        System.out.print("Введите имя файла:");
        fileName = br.readLine();
        System.out.println();
        
        try(FileInputStream fin = new FileInputStream(fileName)){
            do{
                i = fin.read();
                if(i != -1) System.out.print((char)i);
            }while(i != -1);
        } catch (FileNotFoundException e){
            System.out.println("Невозможно открыть файл.");
        } catch(IOException e){
            System.out.println("Ошибка ввода-вывода.");
        }
        System.out.println();
    }
    
}