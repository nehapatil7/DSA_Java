package Arrays;

import java.util.Scanner;

public class revarr {
    public static void reverseArray(int array[]){
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
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

        reverseArray(arr);
        for(int value:arr){
            System.out.print(value+"\t");
        }
    }
}
