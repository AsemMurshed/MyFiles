import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asem on 26/01/2022.
 */
public class E2_2 {
    public static void main(String[] args) {
        Stacks <Integer>a= new Stacks(5);
        Scanner in =new Scanner(System.in);
        System.out.println("input elements ");
        for (int i = 0; i <5; i++) {
            a.push(in.nextInt());

        }
        recursive(a);
        System.out.println(Arrays.toString(a.x));
    }

    public static void recursive(Stacks a)   {
        System.out.println(a.top());
       if (a.isEmpty()==false){
        a.pop();
        recursive(a);}
    }
}
