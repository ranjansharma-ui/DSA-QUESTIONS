package Arrays.Interviews;

import java.util.Scanner;

public class Os1sProblem {
    static int[] Solution(int[]arr, int n){

        int left = 0;
        int right = n-1;

        while(left<=right){
            if(arr[left] == 1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if (arr[left] == 0) left++;
            if (arr[right] == 1) right--;
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the only 0s and 1s : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = Solution(arr,n);
        for (int i=0; i<n; i++){
            System.out.print(res[i] + " ");
        }


    }
}
