public class kadens_algo {
    
    static int maxSubArraySum(int a[], int size)
    {
    int max_so_far = Integer.MIN_VALUE;
    int curr_max = 0;

    for (int i = 0; i < size; i++)
    {
    	curr_max=curr_max+a[i];
    	if(curr_max>max_so_far)
    	{
    		max_so_far=curr_max;
    	}
    	if(curr_max<0)
    	{
    		curr_max=0;
    	}
    }
    return max_so_far;
    }

    public static void main(String[] args)
    {
    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    int n = a.length;   
    int max_sum = maxSubArraySum(a, n);
    System.out.println("Maximum contiguous sum is " 
                       + max_sum);
    }
}