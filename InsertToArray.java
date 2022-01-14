import java.util.Scanner;

/**
 * Created by asem on 10/01/2022.
 */
public class InsertToArray {
    public static void main(String[] args) {
        int[] a =new int[6];
        InsertToArray.insert(a);
        InsertToArray.print(a);
    }



   public static void insert (int[] a){
       Scanner in = new Scanner(System.in);
       for (int i = 0; i <6 ; i++) {
           a[i]=in.nextInt();
       }
   }


    public static void print (int [] a){
        for (int i = 0; i <6 ; i++) {
            System.out.println(a[i]);
        }
    }


}
