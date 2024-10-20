package batterfeed.JavaLangPackage.IsDemo;

public class IsDemo {
    public static void main(String args[]){
        char[] a = {'a', 'b', '5', '?', 'A', ' '};
        for(int i=0; i<a.length; i++){
            if(Character.isDigit(a[i]))
                System.out.println(a[i] + " - цифра.");
            if(Character.isLetter(a[i]))
                System.out.println(a[i] + " - буква.");
            if(Character.isWhitespace(a[i]))
                System.out.println(a[i] + " - пробельный символ.");
            if(Character.isUpperCase(a[i]))
                System.out.println(a[i] + " - прописная буква.");
            if(Character.isLowerCase(a[i]))
                System.out.println(a[i] + " - строчная буква.");
        }
    }
}
