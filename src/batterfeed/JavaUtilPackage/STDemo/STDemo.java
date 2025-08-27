package batterfeed.JavaUtilPackage.STDemo;

import java.util.StringTokenizer;

public class STDemo {
    static String in =
            "Название=Java. Полное руководство;" +
            "Автор=Шилдт;" +
            "Издательство=McGraw-Hill;" +
            "Авторское право=2014";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
