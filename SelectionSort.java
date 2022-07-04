public class SelectionSort {

  static void selectionSort(int[] arr) {
	  for(int i=0;i<arr.length-1;i++)
	  {
		  int min=i;
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[j]<arr[min])
			  {
			  min=j;
		  }
		  }
		  if(min!=i)
		  {
			  int temp;
			  temp=arr[i];
			  arr[i]=arr[min];
			  arr[min]=temp;
			  
		  }
	  }
	  
   
  }


	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
