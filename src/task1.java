import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] numbers = {3, 10, 5, 90, 40, 25};
        // test task a
        int a = findMax(numbers);
        System.out.println(a);

        // test task b
        int b = findMaxIndex(numbers);
        System.out.println(b);

        // test task c
        int c = sumArray(numbers);
        System.out.println(c);

        // test task d
        countOddEven(numbers);

        // test task e
        int[] e = reverseArray(numbers);
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Reversed: " + Arrays.toString(e));
    }

    // (a) Write an algorithm to return the greatest integer in the array.
    static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // (b) Write an algorithm to return the position of the greatest integer in the array.
    static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // (c) Write an algorithm to sum the integers in the array.
    static int sumArray(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }

    // (d) Write an algorithm to count the number of odd and even integers in the array.
    static void countOddEven(int[] array) {
        int odds = 0;
        int evens = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Odds: " + odds + ", Evens: " + evens);
    }

    // (e) Write an algorithm to reverse the order of the integers in the array.
    static int[] reverseArray(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int l = 0;
        int r = newArray.length - 1;
        while (l < r) {
            int temp = newArray[l];
            newArray[l] = newArray[r];
            newArray[r] = temp;
            l++;
            r--;
        }
        return newArray;
    }
}
