import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
     List<Integer[]> output = new LinkedList<>();
     int l, h, sum = 0;
     Arrays.sort(array); 
     for(int i=0; i < array.length; i++) {
	l = i + 1;
	h = array.length - 1;
  	while(h - l > 0) {
	  sum = array[i] + array[l] + array[h]; 
	  if(sum == targetSum) {
	    output.add(new Integer[]{array[i], array[l], array[h]});
	    l++;
	    h--;
	  }
	  else if(sum < targetSum) {
	    l++;
	  } else {
 	    h--;
	  }
	}
     }
     return output;
  }
}
