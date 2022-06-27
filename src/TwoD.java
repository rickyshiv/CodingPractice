import java.util.*;
public class TwoD {
	int arr[][]=null;
	public TwoD(int Size1,int size2)
	{
		arr=new int[Size1][size2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			arr[i][j]=Integer.MIN_VALUE;
			
		}
	}
	}
	public void input()
	{
		
	Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			arr[i][j]=sc.nextInt();
			
		}
	}
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+" ");
			
			
		}
			System.out.println();
	}
	}
	public void search()
	{
		Scanner sc=new Scanner(System.in);
		int se=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]==se)
				{
					
				
			System.out.print("Element found");
				}
			
		}
	}
	}
	public void transpose()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[j][i]+" ");
			
			
		}
			System.out.println();
	}
	}
	public void rotate()
	{
		for(int i=0;i<arr.length;i++)  
		{  
		for(int j=i;j<arr[0].length;j++)  
		{  
		int temp = arr[i][j];  
		arr[i][j] = arr[j][i];  
		arr[j][i] = temp;  
		}  
		} 
		//then we reverse the elements of each row  
		for(int i=0;i<arr.length;i++)  
		{  
		//logic to reverse each row i.e 1D Array.    
		int low = 0, high = arr.length-1;  
		while(low < high)  
		{  
		int temp = arr[i][low];  
		arr[i][low] = arr[i][high];  
		arr[i][high] = temp;  
		low++;  
		high--;  
		}  
		} 
		System.out.println("The Right Rotated Matrix is: ");  
		//prints matrix after rotation  
		for(int i=0;i<arr.length;i++)  
		{  
		for(int j=0;j<arr[i].length;j++)  
		{  
		System.out.print(arr[i][j]+" " +"\t");  
		}  
		System.out.println();  
		}  
		}  
		  
	
public static void main(String[] args) {
	
	int size1,size2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size 1");
	size1=sc.nextInt();
	System.out.println("Enter the size 2");
	size2=sc.nextInt();
	TwoD a=new TwoD(size1,size2);
	System.out.println("Now Taking Inputs from user");
	a.input();
	System.out.println("Displaying the elements");
	a.display();
	// a.search();
	System.out.println("Afte Transpose of a Matrix");
	a.transpose();
	a.rotate();
	
	

		

	}

}
