public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;  // Pointer to track the position for valid elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];  // Move the valid element to the front
                j++;  // Increment the position for the next valid element
            }
        }
        return j;  // Return the new length of the array
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3;

        int length = removeElement(nums, val);

        System.out.println("Amount of numbers that were not equal to " + val + ": " + length);
        System.out.print("New array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

