import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asem on 26/01/2022.
 */
public class E2_1 {

    public static void main(String[] args) {
        Stacks<Integer> S =new Stacks(5);
        Scanner in =new Scanner(System.in);
        System.out.println("input elements ");
        for (int i = 0; i <5; i++) {
            S.push(in.nextInt());

        }
        transfer(S);
    }



    public static void transfer (Stacks a){
        Stacks T =new Stacks(a.x.length);
        for (int i = 0; i <a.x.length ; i++) {
           T.push(a.pop());
        }
        System.out.println(Arrays.toString(T.x));
    }
}
