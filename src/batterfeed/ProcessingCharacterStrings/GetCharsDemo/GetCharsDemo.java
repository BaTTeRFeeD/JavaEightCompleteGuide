package batterfeed.ProcessingCharacterStrings.GetCharsDemo;

public class GetCharsDemo {
    public static void main(String args[]){
        String s = "Это демонстрация методав getChars().";
        int start = 4;
        int end = 8;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
