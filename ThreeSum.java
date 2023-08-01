import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,0,1,2,-1,-4};
		Arrays.sort(arr);
		int zeroIndex = Arrays.binarySearch(arr, 0);
		System.out.println(zeroIndex);
		int[] arr2 = {-10,-9,8};
		System.out.println(Arrays.binarySearch(arr2, 0));
		int[] check = {1,2,3,3,3,3,3,3,3,3,5,7,8,9};
		System.out.println(Arrays.toString(getRange(check, 5)));
		
	}
	
	public static List<List<Integer>> solution(int[] nums){
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		int len = nums.length;
		int zeroIndex = Arrays.binarySearch(nums, 0);
		int[] neg = {0,zeroIndex}, pos = {zeroIndex,len-1};
		if (zeroIndex < 0) {
			neg[1] = -1*zeroIndex - 2;
			pos[0] = -1*zeroIndex - 1;
			if (neg[1] == len -1 || pos[0] == 0) return ans;
		} else {
			int[] zeroRange = getRange(nums, zeroIndex);
			if (zeroRange[0]==0 && zeroRange[1] == len-1) {
				List<Integer> l = new LinkedList();
				l.add(0); l.add(0); l.add(0);
				ans.add(l);
				return ans;
			}
			
		}
		
		return ans;
	}
	
	public static int[] getRange(int[] arr, int i) {
		int[] ans = {i,i};
		int val = arr[i];
		int start = i, end = i;
		while (start >=0 && arr[start-1] == val) {
			start--;
		}
		ans[0] = start;
		while ( end < arr.length && arr[end+1] == val) {
			end++;
		}
		ans[1] = end;
		return ans;
	}

}
