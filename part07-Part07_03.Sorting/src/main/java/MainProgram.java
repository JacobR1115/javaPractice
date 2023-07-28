import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        for (int number: array) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int smallestNumber = array[startIndex];
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }

}
