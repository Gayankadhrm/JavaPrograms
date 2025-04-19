public class JavaTestClass {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int length = arr.length;

        // Selection sort algorithm
        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println();
        System.out.println("Sorted Array : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
