//HW2
/*You are a product manager and currently leading a team to develop a new product. 
Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version,
all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. 
Implement a function to find the first bad version. 
You should minimize the number of calls to the API.

Hint: There are 2 well-known ways to solve this problem!
 */
public class HW2 {
	public HW2(){}
	public static void main(String[] args) {
		HW2 solve = new HW2();
		int firstBadIndex = solve.findFirstBad(7);
		System.out.println("n = 8");
		System.out.println("Expected: 4, Actual: " + firstBadIndex);
		
		firstBadIndex = solve.findFirstBad(100);
		System.out.println("n = 100");
		System.out.println("Expected: 4, Actual: " + firstBadIndex);
		
	}
	
	public int findFirstBad(int version) {
		int low = 0, high = version, mid;
        int firstBadIndex = -1;
        while(low < high)
        {
            mid = low + (high - low) / 2; //To avoid erroneous integer rounding.
            if(isBadVersion(mid)){
                high = mid; //search left side
                firstBadIndex = high; 
            }else {
                low = mid + 1; //search right side
            }
        }
        return firstBadIndex;
	}
	
	static boolean isBadVersion(int version) {
		return version >= 4;
	}
}