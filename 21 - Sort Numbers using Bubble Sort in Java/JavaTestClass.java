public class JavaTestClass {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int length = arr.length;

        // Bubble Sort Algorithm
        for(int i = 0; i < length - 1; i++) {
            for(int j = 1; j < length - i; j++) {
                if(arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.print("Sorted array : ");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
