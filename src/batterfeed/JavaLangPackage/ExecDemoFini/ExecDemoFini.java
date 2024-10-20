package batterfeed.JavaLangPackage.ExecDemoFini;

public class ExecDemoFini {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try{
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e){
            System.out.println("Ошибка запуска Notepad.");
        }

        System.out.println("Notepad возвратил " + p.exitValue());
    }
}
