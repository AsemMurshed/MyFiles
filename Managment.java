import java.util.Scanner;

/**
 * Created by asem on 10/01/2022.
 */
public class Managment {
    public static void main(String[] args) {
        Student [] team = new Student[3];
        /*
        Student s1 = new Student("ahmed",1);
        team[0]=s1;

        Student s2 = new Student("asem",2);
        team[1]=s2;

        Student s3 = new Student("ali",3);
        team[2]=s3;
*/
        for (int i = 0; i <team.length ; i++) {
            Scanner in = new Scanner(System.in);
            Student s = new Student(in.next(),in.nextInt());
            team[i]=s;

        }

        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());

        }
    }
}
