import java.util.Scanner;

public class CountingSort {
	int getMax(int a[], int n) {  
		   int max = a[0];  
		   for(int i = 1; i<n; i++) {  
		      if(a[i] > max)  
		         max = a[i];  
		   }  
		   return max; //maximum element from the array  
		}  
static void count(int[] arr)
    { 
	int max = arr[0];  
	   for(int i = 1; i<arr.length; i++) {
		      if(arr[i] > max)  
		         max = arr[i];  
		   }  
	  int  k=max;
       
        int count[] = new int[k+1];
        int b[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ++ count[arr[i]];
        }
 
        for (int i = 1; i <=k; i++) {
            count[i] += count[i - 1];
        }
 
        for (int i = arr.length - 1; i >= 0; i--) {
            b[--count[arr[i]]]=arr[i];
        }
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }
    }
 
    static void print(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements you want to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		count(arr);
		print(arr);
	}

}
