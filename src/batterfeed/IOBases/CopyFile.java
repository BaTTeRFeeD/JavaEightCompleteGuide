package batterfeed.IOBases;

import java.io.*;

public class CopyFile {
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String ffn = "", sfn = "";
        
        try{
            System.out.print("Введите имя исходого файла:");
            ffn = br.readLine();
            System.out.print("Введите имя файла-копии:");
            sfn = br.readLine();
            if(ffn.equals("") || sfn.equals("")){
                System.out.println("Имя файла не может быть пустым.");
                return;
            }
        } catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();
        }
        
        try(FileInputStream fin = new FileInputStream(ffn);
            FileOutputStream fout = new FileOutputStream(sfn)){
            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();
        } 
        System.out.println("Файл успешно скопирован.");
    }
}