package xyz;

import java.util.Scanner;

public class Mergearr {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of first array ");
		int m=s.nextInt();
		int []a=new int[m];
		System.out.println("Enter the size of second array  ");
		int n=s.nextInt();
		int b[]=new int[n];
		int k=0;
		int i; int j;
		int c[]=new int[m+n];
		System.out.println("Element of arrar FIRST:> ");
		for( i=0;i<=a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("Element of arrar SECOND:> ");
		for(j=0;j<=b.length;j++)
		{
			b[j]=s.nextInt();
			
		}
		i=0 ; j=0;
		while(i<a.length&&j<b.length)
		{
			if (a[i]<b[j])
			{   
				c[k]=a[i];
				i++;
				k++;
				
			}
			else
			{
				c[k]=b[j];
				j++;
				k++;
				
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(c[k]==a[i])
		{
			k++;j++;
		}
		System.out.println("Merged array is :>  ");
		for(int l=0;l<c.length;l++)
			System.out.print(c[l] +" ");
		
		
		// TODO Auto-generated method stub

	}

}
