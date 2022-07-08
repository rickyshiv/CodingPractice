// The following implementation assumes that the activities
// are already sorted according to their finish time
import java.util.*;
import java.lang.*;
import java.io.*;

class ActivitySelection
{
	static void bubbleSort(int array[]) {
	    int size = array.length;
	    
	    for (int i = 0; i < (size-1); i++) {
	    
	  
	      boolean swapped = false;
	      
	      for (int j = 0; j < (size-i-1); j++) {

	        if (array[j] > array[j + 1]) {

	          int temp = array[j];
	          array[j] = array[j + 1];
	          array[j + 1] = temp;
	          
	          swapped = true;
	        }
	      }
	     
	      if (!swapped)
	        break;

	    }
	  }
	 
	public static void printMaxActivities(int s[], int f[], int n)
	{
	int i, j;
	
	System.out.print("Following activities are selected : n");
	
	i = 0;
	System.out.print(i+" ");
	
	for (j = 1; j < n; j++)
	{
		if (s[j] >= f[i])
		{
			System.out.print(j+" ");
			i = j;
		}
	}
	}
	
	public static void main(String[] args)
	{
	
	int s[] = {1,3,0,5,8,5};
	int n = s.length;
	int f[] = {2,4,6,7,9,9};
	bubbleSort(f);
	Arrays.toString(f);
	
	
	
		
	printMaxActivities(s, f, n);
	}
	
}
