import java.util.Scanner;

public class binarysearch {
    public static int binsearch(int[] arr,int n,int tar){
        int s = 0,e=n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==tar){
                return mid;
            }else if(arr[mid]<tar){
                s=mid+1;
            }else if(arr[mid]>tar){
                e=mid-1;
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
        int ind = binsearch(arr,n,target);
        if(ind == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at location " + (ind+1));
        }

    }
}
