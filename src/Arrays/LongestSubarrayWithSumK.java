package Arrays;

import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static int sumArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the array values one by one");
        for (int i=0; i<size;i++){
            arr[i]=scanner.nextInt();
        }

        int sum = sumArray(arr);
        System.out.print("Sum of Array: "+ sum);

    }
}
