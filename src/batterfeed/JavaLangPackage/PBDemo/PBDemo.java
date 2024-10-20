package batterfeed.JavaLangPackage.PBDemo;

public class PBDemo {
    public static void main(String[] args){
        try{
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "test");
            proc.start();
        } catch (Exception e){
            System.out.println("Ошибка запуска Notepad.");
        }
    }
}
