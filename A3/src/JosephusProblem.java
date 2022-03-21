import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int c=in.nextInt();
        josephus(c);
    }



    public static void josephus(int count){
        CicleQueue<Integer>q=new CicleQueue<Integer>(count) ;
        for (int i = 1; i <=count ; i++) {
            q.enqueue(i);
        }

        while (q.size()>1) {
            for (int i = 1; i <=2 ; i++) {
                int temp=q.dequeue();
                if (i==2){
                    System.out.println(temp+"is killed");
                    break;
                }
                q.enqueue(temp);
            }
        }
        System.out.println("the winner : "+q.dequeue());

    }
}
