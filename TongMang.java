package Binh.edu.vn;

import java.util.Scanner;

public class TongMang {
	public static void main(String[] args) {
		System.out.println("Mời Nhập Số Phần Tử Mảng");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int M[]=new int [n];		
		for(int i=0; i<n;i++)
		{
			System.out.println("Moi ban nhap so thu "+(i+1)+": ");
			M[i]=sc.nextInt();
		}
		
		System.out.println("Mang Vua Nhap La : ");
		for (int i : M) {
			System.out.print(i+"\t");
		}
		
		float sum=0;
		for (int i : M) {
			sum+=i;
		}
		System.out.println("\nTổng Của Mảng Là : "+sum);
	}

}
