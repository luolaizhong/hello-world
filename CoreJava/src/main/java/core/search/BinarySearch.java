package core.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 5, 6, 8, 9};
        int index = search(arr, 8, 0, arr.length);
        System.out.println(index);
    }

    public static int search(int[] arr, int number, int l, int r) {
        int m = (l + r) / 2;

        if (number > arr[m]) {
            l = m + 1;
        } else if (number < arr[m]) {
            r = m - 1;
        } else {
            return m;
        }

        if (l > r) {
            return -1;
        }
        return search(arr, number, l, r);
    }
}
