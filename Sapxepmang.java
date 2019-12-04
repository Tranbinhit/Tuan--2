package Binh.edu.vn;

import java.util.Random;
import java.util.Scanner;

public class Sapxepmang {
	public static void main(String[] args) {
		System.out.println("Mời Nhập Số Phần Tử Mảng");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		Random rd=new Random();
		int a[]=new int [n];		
		for(int i=0; i<n;i++)
		{
			a[i]=rd.nextInt(9);
		}
		
		System.out.println("Mang Vua Nhap La : ");
		for(int i : a) {
			System.out.print(i +"\t");		
		}
		
		System.out.println("\nMang Sau khi Sắp xếp");
		sapxeptang(a, n);
		for(int i : a) {
			System.out.print(i +"\t");		
		}
		
	}
	
	public static void sapxeptang(int a[],int n)
	{
	 for(int i=0;i<n-1;i++)
	  for(int j=i+1;j<n;j++)
	   {
	    if(a[i]>a[j]) 
	     {
	       int temp=a[i];
	       a[i]=a[j];
	       a[j]=temp;
	     }
	   }
	}
	
}
