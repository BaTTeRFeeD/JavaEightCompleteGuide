package batterfeed.Test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args){
        int[] arr1 = {1,4,5,2,3,9,8,11,0,12,14,15};
        int[] arr2 = {1,4,3,2};
        int[] arr3 = {1,4};

        System.out.println(compress(arr1));
        System.out.println(compress(arr2));
        System.out.println(compress(arr3));
    }

    public static String compress(int[] array){
        String result = "";
        int condition = 0;

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            if(array[i] <= condition) continue;

            result += Integer.toString(array[i]);

            int count = 0;

            for(int j = i + 1; j < array.length; j++){
                if(array[j] - array[j-1] == 1) count++;
                else break;
            }

            if(count == 0){
                result += ",";
            }
            else{
                result += "-" + Integer.toString(array[i+count]) + ",";
                condition = array[i+count];
            }

        }

        return result.substring(0, result.length()-1);
    }
}
