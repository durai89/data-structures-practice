import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
  	Set<Integer> numberSet = new HashSet<>();
		for (int i=0; i < array.length; i++) {
			if (numberSet.contains(targetSum - array[i])) {
				return new int[]{array[i], targetSum - array[i]};
			}
			numberSet.add(array[i]);
		}
    return new int[0];
  }
}
