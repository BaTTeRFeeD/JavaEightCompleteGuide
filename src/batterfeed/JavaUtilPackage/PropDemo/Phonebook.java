package batterfeed.JavaUtilPackage.PropDemo;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try{
            fin = new FileInputStream("src/batterfeed/JavaUtilPackage/PropDemo/phonebook.dat");
        } catch (FileNotFoundException e){
            // игнориваться отсутствующий файл
        }

        try {
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e){
            System.out.println("Ошибка чтения файла.");
        }

        do{
            System.out.print("Введите имя('выход' для завершения): ");

            name = br.readLine();
            if(name.equals("выход")) continue;
            System.out.print("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("выход"));

        if(changed){
            FileOutputStream fout = new FileOutputStream("src/batterfeed/JavaUtilPackage/PropDemo/phonebook.dat");
            ht.store(fout, "Phone Book");
            fout.close();
        }

        do{
            System.out.print("Введите имя для поиска('выход' для завершения): ");
            name = br.readLine();
            if(name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
