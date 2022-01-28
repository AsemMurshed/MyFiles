import java.util.Arrays;

/**
 * Created by asem on 26/01/2022.
 */
public class E1_1 {



     public static int[] reverseArrayByAnotherArray (int [] a){
         int [] b =new int[a.length];

         for (int i = a.length-1, j=0; i >=0 ; i--,j++) {
             b[j]=a[i];
         }

         return b;
     }


    public static void main(String[] args) {
        int [] x= {16,12,33,101,63};
        System.out.print(Arrays.toString(x));
        reverseArrayByAnotherArray(x);
        System.out.print("\nafter reverse = "+Arrays.toString(reverseArrayByAnotherArray(x)));
    }
}
