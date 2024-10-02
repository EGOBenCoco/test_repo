public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

