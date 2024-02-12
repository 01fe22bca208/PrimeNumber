public class Array {
    public int findBiggest(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE; // Return the minimum integer value if array is empty or null
        }

        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
  return biggest;
    }
    public static void main(String[] args) {
        Array finder = new Array();
        int[] array = {10, 5, 20, 15, 8};
        System.out.println("The biggest number in the array is: " + finder.findBiggest(array));
    }
}
