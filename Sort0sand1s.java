import java.util.Scanner;
public class Sort0sand1s {
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
//    static void sortzerosandones(int[] arr, int n){
//        int left=0;int right=n-1;
//        while(left<right){
//            if(arr[left]==1 && arr[right]==0){
//                swap(arr,left,right);
//                left++;
//                right--;
//            }
//            if(arr[left]==0){
//                left++;
//            }
//            if(arr[right]==1){
//                right--;
//            }
//        }
//
//    }
    static void reverse(int[] arr,int n){
        int left=0,right=n-1;
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    static int[] sortsquares(int[] arr,int n){
        int left =0,right=n-1;
        int[] ans = new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
//    static void sortnumparity(int[] arr,int n){
//        int left =0,right=n-1;
//        while(left < right){
//            if(arr[left]%2==1 && arr[right]%2==0){
//                swap(arr,left,right);
//                left++;
//                right--;
//            }
//            if(arr[left]%2==0){
//                left++;
//            }
//            if(arr[right]%2==1){
//                right--;
//            }
//        }
//    }
    static void println(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original Array: ");
        println(arr,n);

//        sortzerosandones(arr,n);
//        sortnumparity(arr,n);
        int[] res = sortsquares(arr,n);
        reverse(res,n);
        System.out.println("after sorting");
        println(res,n);
    }
}
