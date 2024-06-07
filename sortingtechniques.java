import java.util.Scanner;
public class sortingtechniques {
//    public static void selectionsort(int[] arr,int n){
//        int mini;
//        for(int i=0;i<n-1;i++){
//            mini = i;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]<arr[mini]){
//                    mini = j;
//                }
//            }
//            int temp = arr[mini];
//            arr[mini]=arr[i];
//            arr[i]=temp;
//        }
//    }
//    public static void bubblesort(int[] arr,int n){
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//    }
    public static void insertionsort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 &&  arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        selection sort
//        selectionsort(arr,n);
//        bubblesort(arr,n);
        insertionsort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
