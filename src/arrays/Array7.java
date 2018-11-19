package arrays;
import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		   int[] my_array = {25, 14, 56, 15, 36, 56, 73, 19, 27, 48};
		   
		   System.out.println("Original Array : "+Arrays.toString(my_array));     
		   
		   int removeIndex = 1;

		   for(int i = removeIndex; i < my_array.length -1; i++){
		        my_array[i] = my_array[i + 1];
		      }
		    System.out.println("After removing the second element: "+Arrays.toString(my_array));
		 }
		 }