import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        
        takeInput();
       
    }

    public static void takeInput() 
    {

        int firstAngle, secondAngle, thirdAngle;

        System.out.print("Enter the three angles of the triangle: ");
        Scanner inp = new Scanner(System.in);

        firstAngle = inp.nextInt();
        secondAngle = inp.nextInt();
        thirdAngle = inp.nextInt();

        checkTriangle(firstAngle, secondAngle, thirdAngle);

        inp.close();
    }

    public static void checkTriangle (int a, int b, int c) {

        int flag = checkRight(a, b, c);

        if (flag == 1) {
            System.out.print("It is Right Triangle");
        } else if (flag == 2) {
            System.out.print("It is Acute Triangle");
        } else {
            System.out.print("It is Obtuse Triangle");
        }
    }

    public static int checkRight (int a, int b, int c) {

        int res = (a==90 || b==90 || c==90) ? 1 : checkAcute(a,b,c) ;
        return res;
    }

    public static int checkAcute (int a, int b, int c) {

        int res = (a<90 && b<90 && c<90) ? 2 : checkObtuse(a,b,c) ;
        return res;
    }

    public static int checkObtuse(int a, int b, int c) {

        int res = (a>90 || b>90 || c>90) ? 3 : 4 ;
        return res;
    }
}

