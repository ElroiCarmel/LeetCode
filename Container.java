
public class Container {
	
	/*
	 * Input: height = [1,8,6,2,5,4,8,3,7]
	 * Output: 49
	 */
	
	public static void main(String[] args) {
		int[] test = {1,8,6,2,5,4,8,3,7};
//		System.out.println(solution(test));
		System.out.println(solutionV2(test));

	}
	//More efficient
	public static int solutionV2(int[] height) {
		int max = 0, i=0, j=height.length-1;
		while (i<j) {
			int area = (j-i)*Math.min(height[i], height[j]);
			if (area>max) max = area;
			if (height[i] < height[j]) {
				i++;
			} else if (height[j] < height[i]) {
				j--;
			} else {
				if (height[i+1] > height[j-1]) {
					i++;
				} else {
					j--;
				}
			}
		}
		return max;
	}
	
	public static int solution(int[] height) {
		int len = height.length;
		int max = Math.min(height[0], height[1]);
		for (int i=0; i<len-1; i++) {
			for (int j=1; j<len; j++) {
				int area = (j-i)*Math.min(height[i], height[j]);
				if (area>max) max = area;
			}
		}
		return max;
	}
}
