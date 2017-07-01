/**
 * In this example we have an array of integer numbers and we need to come out
 * with the pair of numbers that equals to the sum given. Given the array is
 * sorted.
 * 
 * First approach is for inside for -- quadratic solution bad time consuming
 * Linear search - As, the numbers are sorted we can start from first and end
 * sum and then comparing that with the given sum we can traverse array
 * accordingly in a linear time complexity we will be able to find our result.
 * 
 * @author Harsh
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int input[] = {-4, 1, 3, 5, 4, 6};
		int sum = 8;
		int result[] = findPairEqualToSum(input, sum);
		if (result != null && result.length == 2)
			System.out.println(result[0] + " + " + result[1] + " = " + sum);
		else System.out.println("No Pair exists !!");
	}

	private static int[] findPairEqualToSum(int[] input, int sum) {
		int result[] = new int[2];
		int frontIndex = 0, backIndex = input.length-1 ;
		while(frontIndex < input.length-1) {
			if(frontIndex == backIndex) frontIndex--;
			if(input[frontIndex] + input[backIndex] == sum) {
				result[0] = input[frontIndex];
				result[1] = input[backIndex];
				return result;
			} else if(input[frontIndex] + input[backIndex] > sum) {
				backIndex--;
			} else if(input[frontIndex] + input[backIndex] < sum) {
				frontIndex++;
			}
		}
		return null;
	}

}
