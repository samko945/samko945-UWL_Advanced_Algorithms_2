import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        double[] numbers = {1,2,3,4,5,6,0,0,0,0,0};
        System.out.println(Arrays.toString(numbers));
        insert(1000, 3, numbers, 0,5);
        System.out.println(Arrays.toString(numbers));
    }

    // insert a type double value into an array
    // Complexity: Time=O(n), Space=O(1)
    static void insert(double val, int target, double[] array, int left, int right) {
        System.out.println("Inserting value " + val + " into index " + target);

        // shift values
        // for values starting from the value of right, until the target index
        for(int i = right; i >= target; i--) {
            System.out.println("Move " + i + " to " + (i + 1));
            array[i + 1] = array[i];
        }

        // target index can now be assigned new value
        System.out.println("assign " + target);
        array[target] = val;
    }
}
