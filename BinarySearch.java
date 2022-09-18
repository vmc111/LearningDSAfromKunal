import java.util.Scanner
public class Main {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of array: ");
		for (int index=0;index<size;index++) {
			arr[index] = in.nextInt();
		}
		System.out.print("Enter the target Element: ");
		int target =in.nextInt();
		int ans = BinarySearch(arr , target);
		System.out.println(ans);
	}
	// Given Array is in Ascending order
	static int BinarySearch (int[] arr, int target) {
		int start=0;
		int end = arr.length-1;
		boolean isAsc = arr[start] < arr[end];
		// This returns true if first element is less than final.
		while (start<=end) {
		int mid = start + (end-start)/2;
		if (arr[mid]==target) {
			return mid;
		}
		else if (isAsc) {
			if(arr[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}else {
			if(arr[mid]<target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
	}
		return -1;
	}
}
