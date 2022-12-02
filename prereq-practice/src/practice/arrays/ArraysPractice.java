package practice.arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] container = new int [30];
//		
//		for (int i = 0; i < container.length; i++) {
//			System.out.println(container[i]);
//		}
//		
//		int [] values = new int [] { 1, 4, 9, 16 };
//		
//		for ( int v : values ) {
//			System.out.println(v);
//		}
		
		System.out.println(search(new int[] {2,3,4,5,6,7}, 5)); // 3
		
		System.out.println(search(new int[] {2,3,4,5,6,7}, 9)); // -1

	}
	
	// Method 1 - my method
//	public static int search(int[] nums, int target) {
//		for ( int i = 0; i < nums.length; i++ ) {
//			if ( nums[i] == target ) {
//				return i;
//			}
//		}
//		return -1;
//		
//	}
	
	
	// Method 2 
	public static int search(int[] nums, int target) {
		int ret = -1;
		for( int i = 0; i < nums.length; i++ ) {
			if( nums[i] == target ) {
				ret = i;
				break;
			}
		}
		return ret;
	}
	
	

}
