package AmazonCoding;

public class InsertSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        InsertionSort(intArray, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void InsertionSort(int[] input, int numItems) {

        if (numItems < 2) {
            return;
        }
        InsertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;
    }
}
