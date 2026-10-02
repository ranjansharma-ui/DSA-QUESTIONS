package Arrays;

public class Q_1 {
    static int [] SwapArray(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
        return arr;



    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,8,3};

        int [] swapArr = SwapArray(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


}
