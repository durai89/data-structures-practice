import java.util.*;

class Program {
	
  public int firstDuplicateValue(int[] array) {
      for(int value: array) {
         int index = Math.abs(value) - 1;
         if (array[index] < 0) {
	   return index + 1;
         }
         array[index] = -1 * array[index];
      }
      return -1;
  }
}
