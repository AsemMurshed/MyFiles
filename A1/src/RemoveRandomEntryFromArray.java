import java.util.Random;
import java.util.Arrays;
/**
 * Created by asem on 26/01/2022.
 */
public class RemoveRandomEntryFromArray {

/*
E1_3:

Write a Java method that repeatedly selects
and removes a random entry from an array until
the array holds no more entries.
*
* */
    static int []x ;

    public RemoveRandomEntryFromArray(int[] x) {
        this.x = x;
    }
    public  void removeRandomEntryFromArray(){
        int ElementsCounter;
        ElementsCounter = x.length;
        if (ElementsCounter==0)
            System.out.println("Array is empty");
        while (ElementsCounter >0) {
            int random=randomNum(x.length);
            if (x[random-1]!=-1)
            {
                x[random-1]=-1;
                ElementsCounter--;
            }
            System.out.println(Arrays.toString(x)+"\n");
        }
    }

    public static int randomNum(int max){
        Random random=new Random();
        return random.nextInt(max-1+ 1) +1;
    }


    public static void main(String[] args) {
        int []a={19,14,22,100,1,64};
        RemoveRandomEntryFromArray R = new RemoveRandomEntryFromArray(a);
        R.removeRandomEntryFromArray();

    }


    }


