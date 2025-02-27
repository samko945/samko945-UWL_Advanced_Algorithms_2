public class task2 {
    // Write an algorithm to test whether an array a[left...right] is sorted in ascending order

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean numbersAreAsc = isAscending(numbers);
        System.out.println(numbersAreAsc);

    }

    static boolean isAscending(int[] array) {
        // index starts at 2nd element
        for(int i = 1; i < array.length; i++) {
            // check if the previous element is larger than current
            if(array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
        // Time Complexity:
        //  best case = O(1) = if first two elements are in wrong order - return false
        //  worst case = O(n) = a fully sorted array in ascending - return true
        //  average case = O(n/2) = a disorder is found halfway through the array
    }
}

