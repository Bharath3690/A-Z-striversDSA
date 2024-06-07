import java.util.Scanner;

public class arrayrotation {
    public static void reverse(int[] arr,int s,int e){
//        int s = 0,e=n-1;
       while(s<e){
           int temp = arr[s];
           arr[s]=arr[e];
           arr[e]=temp;
           s++;
           e--;
       }
    }
    public static void rotateleft(int[] arr,int n,int step){
        reverse(arr,0,step-1);
        reverse(arr,step,n-1);
        reverse(arr,0,n-1);

    }
    public static void rotateright(int[] arr,int n,int step){
        reverse(arr,0,n-1);
        reverse(arr,0,step-1);
        reverse(arr,step,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        reverse(arr,n);
        int step = sc.nextInt();
//        rotateleft(arr,n,step);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
        rotateright(arr,n,step);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
