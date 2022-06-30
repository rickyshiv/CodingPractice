import java.util.*;
public class ModifiedBubbleSort {

	public void bubble(int arr[])
	{
		int temp,flag;
		for(int i=0;i<arr.length-1;i++)
		{
			flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
	}
    static void print (int arr[])  
    {  
        int n = arr.length;  
        
        for (int i = 0; i < n; i++)  
        {  
            System.out.print(arr[i] + " ");  
        }         
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
	
	ModifiedBubbleSort n1=new ModifiedBubbleSort();
	n1.bubble(arr);
	System.out.println("After Sorting");
	n1.print(arr);

	}

}
