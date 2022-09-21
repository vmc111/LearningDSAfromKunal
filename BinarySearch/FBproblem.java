import java.util.Arrays;

public class Problems {
	public static void main(String[] args) {
		int [] arr = {5,7,7,7,7,8,8,10};
		int target = 7;
		int [] ans = SR(arr, target);
		System.out.println(Arrays.toString(ans));
	}
	
	
	static int[] SR(int[] nums , int target) {
//		Kunals Solution Class-1/2
//		int[] ans = {-1,-1};
//		int start = search(nums,target,true);
//		int end =search(nums,target,false);
//		ans[0] = start;
//		ans[1] = end;
//		return ans;
//	}
//	My solution in a single class:
	int[] arr = new int [2];
		int start =0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if (nums[mid]==target) {
				for (int j=0; j<=mid;j++) {
					if (nums[j] == target) {
						arr[0] = j;
						break;
					}
			}
				for (int k=nums.length-1; k>=mid;k--) {
					if (nums[k] == target ) {
						arr[1] = k;
						break;
					}
				}
				return arr;
		}else if (nums[mid]<target) {
			start = mid+1;
		}else {
			end = mid-1;
		}
		}
		arr[0] =-1;
		arr[1] = -1;
		return arr;
	}
//	Kunals Solution class=2/2
//	static int search(int[] nums, int target ,boolean findstart) {
//		int ans = -1;
//		int start=0;
//		int end = nums.length-1;
//		// This returns true if first element is less than final.
//		while (start<=end) {
//		int mid = start + (end-start)/2;
//		if (nums[mid]==target) {
//			ans = mid;
//			if (findstart) {
//				end = mid-1;
//			}else {
//				start = mid+1;
//			}
//		}
//		else if(nums[mid]<target) {
//				start = mid+1;
//			}else {
//				end = mid-1;
//			}
//			}
//		return ans;
//	}
}
	
