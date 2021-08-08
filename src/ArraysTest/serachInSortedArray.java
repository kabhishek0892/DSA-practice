package ArraysTest;

public class serachInSortedArray {
    static int search(int arr[], int l, int h, int key) {

        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] > arr[l]) {
            if (arr[l] <= key && key <= arr[mid]) {
                return search(arr, l, mid - 1, key);
            } else {
                return search(arr, mid + 1, h, key);
            }

        } else {

            if (key >= arr[mid] && key <= arr[h]) {
                return search(arr, mid + 1, h, key);

            } else {
                return search(arr, l, mid - 1, key);
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = { 12, 13, 14, 15, 16, 10 };
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        int item = 10;
        int k = search(arr, left, right, item);
        if (k == -1) {
            System.out.println("item not found");

        } else {
            System.out.println("item found on " + k + " index");
        }

    }
}

