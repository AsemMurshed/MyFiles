import java.util.Arrays;

/**
 * Created by asem on 24/01/2022.
 */
public class ReverseUsingStack {
    public static void main(String[] args) {
        int[]a={11,12,13,45,65};
        ArrayStack<Integer>s=new ArrayStack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
           s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();
        }
        System.out.println("after reverse using stack");
        System.out.println(Arrays.toString(a));
    }
}
