package batterfeed.ProcessingCharacterStrings.GetBytesDemo;

public class GetBytesDemo {
    public static void main(String args[]){
        String s = "Это демонстрация методав getBytes().";
        int start = 4;
        int end = 8;
        byte buf[] = new byte[end - start];
        s.getBytes(start, end, buf, 0);

        for(int i = 0; i < buf.length; i++){
            System.out.print(buf[i] + " ");
        }
    }
}
