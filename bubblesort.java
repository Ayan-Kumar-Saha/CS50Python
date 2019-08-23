import java.util.*;

class bubblesort{
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = inp.nextInt();

        int[] num = new int[n];

        takeinput(num, n);

        System.out.print("Before sorting: ");
        printarray(num, n);

        bubble(num, n);

        System.out.print("After sorting: ");
        printarray(num, n);

        inp.close();
    }

    public static void takeinput(int num[],int n) {

        java.util.Scanner inp = new Scanner(System.in);

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++) {
            num[i] = inp.nextInt();
        }
        inp.close();
    }

    public static void bubble(int num[],int n) {

        int flag;

        for(int i=0;i<n;i++) {
            flag = 0;

            for(int j=0 ; j<n-i-1; j++) {
                if ( num[j] > num[j+1] ) {
                    flag = 1;
                    swap(num,j,j+1);
                }
            }
            if (flag==0)
                break;
        }
    }

    public static void swap(int num[], int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void printarray(int num[], int n) {
        for(int i=0; i<n; i++) {
            System.out.print(num[i]+" ");
        }
    }
}