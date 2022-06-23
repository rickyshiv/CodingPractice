/*import java.util.*;
public class WindowSliding_maxSum {
static int maxsum(int arr[],int n,int k)
{
	int max_sum=Integer.MIN_VALUE;
	for(int i=0;i<n-k+1;i++)
	{
		int curr_sum=0;
		for(int j=0;j<k;j++)
		{
			curr_sum=curr_sum+arr[i+j];
			max_sum=Math.max(curr_sum,max_sum);
		}
	}
	return max_sum;
}

public static void main(String args[])
{
	int arr[]= {1,2,3,4,5};
	int n=arr.length;
	int k=3;
	System.out.println(maxsum(arr, n, k));
	
}
// Without using sliding window
}*/
// using Sliding window
public class WindowSliding_maxSum {
static int maxsum(int arr[],int n,int k)
{
	int max_sum=0;
	for(int i=0;i<k;i++)
	{
		max_sum+=arr[i];
		
	}
	int window_sum=max_sum;
	for(int i=k;i<n;i++)
	{
		window_sum+=arr[i]-arr[i-k];
		max_sum=Math.max(max_sum, window_sum);
	}
	return max_sum;
	}
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5};
	int n=arr.length;
	int k=3;
	System.out.println(maxsum(arr, n, k));
	
}
}