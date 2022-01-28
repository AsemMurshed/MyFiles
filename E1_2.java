import java.util.Arrays;

/**
 * Created by asem on 26/01/2022.
 */
public class E1_2 {

    public static void copyArray (int [] a){
       int [] backupArray=new int [a.length];
        for (int i = 0; i <a.length ; i++) {
            backupArray[i]=a[i];
        }
        System.out.println(Arrays.toString(backupArray));
    }


    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        copyArray(a);
    }
}
