package classes.myImplementations.finalClass;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int numSum = nums.length * (nums.length + 1) / 2;
        for (int num : nums) {
            numSum -= num;
        }
        return numSum;
    }
}
