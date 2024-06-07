import java.util.Scanner;

public class linsearch {
    public static int linearsear(int[] arr, int n,int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ind = linearsear(arr,n,target);
        if(ind==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index and location"+ind+" "+(ind+1));
        }

    }
}
