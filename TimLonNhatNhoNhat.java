package Binh.edu.vn;

import java.util.Scanner;

public class TimLonNhatNhoNhat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Mởi bạn nhập số phần tử mảng ");
		int n=sc.nextInt();
		int a[]= new int [n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Moi ban nhap so thu "+(i+1)+ ": ");
				a[i]=sc.nextInt();			
		}
		
		System.out.println("Mảng bạn vừa nhập là : ");
		for (int i : a){
			System.out.print(i +"\t");		
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{	
				min=a[i];
			}
		}
		
		System.out.println("\nSố Lớn Nhât là : "+max);
		System.out.println("Số nhỏ nhất là :"+min);
		
	}

}
