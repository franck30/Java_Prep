package array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int array[] = {1, 1, 2, 2, 3};
        int newArray[] = removeDuplicate(array);

        for (int a : newArray) {
            System.out.println(a);
        }
    }

    private static int[] removeDuplicate(int[] array) {
        int j = 0;
        int i = 1;
        if (array.length < 2) {
            return array;
        }
        while (i < array.length) {
            if (array[i] == array[j]) {
                i++;
            } else {
                j++;
                array[j] = array[i];
                i++;
            }
        }
        int newArray[] = new int[j + 1];
        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = array[k];
        }
        return newArray;
    }
}
