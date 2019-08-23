// CS50 Week 1 Assignment Randomized quick sort using encapsulation
import java.util.*;
import java.lang.*;
class randomquick{
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the no. of elements: ");
        int n = inp.nextInt();

        inp.close();

        int[] num = new int[n];

        takeinput(num);

        System.out.print("Before Sorting: ");
        printarray(num);

        quicksort(num, 0, n-1);

        System.out.print("After Sorting: ");
        printarray(num);
        
    }

    public static void printarray(int num[]) {

        int n = num.length;

        for(int i=0; i<n; i++) {
            System.out.print(num[i]+" ");
        }
    }

    public static void takeinput(int num[]) {

        Scanner inp = new Scanner(System.in);

        int n = num.length;

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            num[i] = inp.nextInt();
        }
        
        inp.close();

    }

    public static void quicksort(int num[], int low, int high) {
        if (low < high) {

            int pi = partition(num,low,high);
            quicksort(num,low,pi-1);
            quicksort(num,low,pi);

        }
    }

    public static int partition(int num[], int low, int high) {

        if (low < high) {
            int i = (int) (Math.random() * ((high - low) + 1)) + low;
            swap(num,i,high);

            int pivot = partition(num, low, high);
            quicksort(num, low, pivot - 1);
            quicksort(num, pivot, high);

        }
        
        
    }

    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}