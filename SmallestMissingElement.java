package assignments;

public class SmallestMissingElement {
	public static int SmallestMissing(int[] nums, int left, int right)
    {
        if (left > right) {
            return left;
        }
 
        int mid = left + (right - left) / 2;
        if (nums[mid] == mid) {
            return SmallestMissing(nums, mid + 1, right);
        }
        else {
            return SmallestMissing(nums, left, mid - 1);
        }
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6 };
 
        int left = 0, right = nums.length - 1;
        System.out.println(SmallestMissing(nums, left, right));
    }

}
