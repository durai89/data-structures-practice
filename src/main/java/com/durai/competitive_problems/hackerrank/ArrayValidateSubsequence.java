import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int i = 0, j = 0;
    while (i < array.size() && j < sequence.size()) {
      if(array.get(i) == sequence.get(j)) {
	j++;
      } else {
	i++;
      }
      i++;
    }
    return j == sequence.size();
  }
}
