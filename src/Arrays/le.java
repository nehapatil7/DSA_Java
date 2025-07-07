package Arrays;

public class le {
    public static int findLargestElement(int array[]){
        int largestElt = array[0];
        for(int i=0; i<array.length; i++){
            if (array[i]>largestElt) {
                largestElt = array[i];
            }
        }
        return largestElt;
    }
    public static void main(String[] args) {
        int arr[]={20, 45, 23, 11, 75};

        int largestValue =findLargestElement(arr);
        System.out.println("Largest Element :" + largestValue);
    }
}
