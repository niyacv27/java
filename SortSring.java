import java.util.*;
public class SortString{
	public static void main(String args[]){
	int n1;
	Scanner read=new Scanner(System.in);
	System.out.print("Enter the size of array:");
	n1=read.nextInt();
	System.out.print("Enter values:");
	String[] arr=new String[n1];
	for(int i=0;i<n1;i++)
	{
	arr[i]=read.next();
	}
	Arrays.sort(arr);
	System.out.println("Sorted array");
	for(int i=0;i<n1;i++)
	{
	System.out.print(arr[i]+",");
	}
}
}
