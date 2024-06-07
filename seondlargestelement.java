import java.sql.SQLOutput;
import java.util.Scanner;
public class seondlargestelement {
    static void secondmax(int[] arr,int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=max && arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        secondmax(arr,n);
    }
}
