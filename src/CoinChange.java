import java.util.Arrays;

public class CoinChange {

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
	static int max(int arr[],int t)
    {
        int n=arr.length;
        int result=0;
       int count=0;
        
        for(int i=n-1;i>=0;i--)
        {
            while(t>=arr[i])
            {
                t= t- arr[i];
                count ++;
               
                
            }
           
        }
       
        return count;
    }
	public static void main(String[] args) {

		int c[] = {1,2,3};
		int n = c.length;
		int amount =4;
		
		
		bubbleSort(c);
		Arrays.toString(c);
		System.out.println(max(c,amount));
		
		
		
		
	}

}
