package batterfeed.ProcessingCharacterStrings.SetCharAtDemo;

public class SetCharAtDemo {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("буфер до = " + sb);
        System.out.println("до вызова charAt(1) = " + sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("буфер после = " + sb);
        System.out.println("после вызовы charAt(1) = " + sb.charAt(1));
    }
}
