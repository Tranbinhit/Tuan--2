package Binh.edu.vn;

import java.util.Random;
import java.util.Scanner;

public class DaoNguocMang {
	public static void main(String[] args) {
		System.out.println("Mời Nhập Số Phần Tử Mảng");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		Random rd=new Random();
		int M[]=new int [n];		
		for(int i=0; i<n;i++)
		{
			M[i]=rd.nextInt(9);
		}
		
		System.out.println("Mang Vua Nhap La : ");
		for (int i : M){
			System.out.print(i +"\t");		
		}
		
		System.out.println("\nMang Sau khi Dao");
		
		DaoMang(M,n);
		for (int i : M){
			System.out.print(i +"\t");		
		}
		
		
	}
	public static void DaoMang(int M[],int n)
	{
	   for(int i=0;i<n/2;i++)
	    {
	      int temp=M[i];
	         M[i]=M[n-1-i];
	         M[n-1-i]=temp; 
	   }
	}
}
