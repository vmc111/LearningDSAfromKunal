import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Question: Array [2,3,5,9, 14,16,18] find the ceiling of 1?*/
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the size of array: ");
			// For us to know how many elements in array to be Scanned
			int size = in.nextInt();
			int [] arr = new int[size];
			System.out.print("Enter the elements of array: "); // Fiil in the array
			for (int i=0; i<size;i++) {
				arr[i] = in.nextInt();
			}
			System.out.print("Enter the target number: "); //Lets get the target Number 
			int target = in.nextInt();
			System.out.println(ceiling(arr , target));
			
	}
	static int ceiling(int[] arr , int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		if (arr[start] < arr[end]) {  // Ascending order array
			while (start <= end) { 
				int mid = start + (end - start)/2;   // To know why mid = "..." visit Kunals lecture vedio
				if (arr[mid] == target) {
					return arr[mid];
				}else if (arr[mid] > target){
					// target will lie on left side 
					end = mid-1;
				}else { // arr[mid] >target  -> target is on the right side of mid element.
					start = mid+1;
				}
				// if start becomes > end that means loop breaks 
				// so there is no element array equals to target 
				// the target lies on the right side of mid here
			}
			return arr[start];
		}else {      // Descending order array:
			while (start <= end) { 
				int mid = start + (end - start)/2;   // To know why mid = "..." visit Kunals lecture vedio
				if (arr[mid] == target) {
					return arr[mid];
				}else if (arr[mid] > target){
					// target will lie on right side 
					start = mid+1;
				}else { // arr[mid] >target  -> target is on the left side of mid element.
					end = mid-1;
				}
		}
			return arr[end]; // here end will be the ceiling if loop breaks
		}
	}
}
