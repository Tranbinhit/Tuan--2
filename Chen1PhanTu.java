package Binh.edu.vn;

import java.util.Random;
import java.util.Scanner;

public class Chen1PhanTu {
	
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
		
		System.out.println("\nMoi ban nhạp  phần tử  ");
		int k=sc.nextInt();
		System.out.printf("\nChèn phần tử "+ k+" vào mảng");
        a=insert(a,k);
        System.out.println("\nMang Vua Nhap La : ");
		for(int i : a) {
			System.out.print(i +"\t");		
		}				
	

	}
	
	public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;
         
        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;
    }
	
}

