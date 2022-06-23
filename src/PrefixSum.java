public class PrefixSum {
	static void prefix(int arr[],int n,int prefix[])
	{
		prefix[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			prefix[i]=prefix[i-1]+arr[i];
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {10,2,5,7,31};
		int n=arr.length;
		int prefix []=new int [n];
		prefix(arr,n,prefix);
		for(int i=0;i<n;i++)
		{
			System.out.println(prefix[i]);
		}
		

	}

}
