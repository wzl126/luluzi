package text;

public class twosum {
	public static int[] twoSum(int[] nums, int target) {
		int[] ret=new int[] {0,0};
		for(int i=0;i<nums.length;i++)
			for(int j=i+1;j<nums.length;j++)
            {
				if(nums[i]+nums[j]==target)
					return ret=new int[] {i,j};
			}
		return ret;
	}

	public static void main(String[] args) {
		int[] ret=twoSum(new int[] {2,9,6,12,5}, 15);
		System.out.print("["+ret[0]+","+ret[1]+"]");

	}

}
