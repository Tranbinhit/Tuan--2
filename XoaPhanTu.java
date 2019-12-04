package Binh.edu.vn;

import java.util.Random;
import java.util.Scanner;

public class XoaPhanTu {

	public static void main(String[] args) {
	    int n, i, c;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n <= 0);
	         
	    int A[] = new int[n];
	         
	    System.out.println("Nhập các phần tử cho mảng: ");
	    for (i = 0; i < n; i++) {
	        Random rd=new Random();
	        A[i] = rd.nextInt(10);
	    }
	    
	    System.out.println("Mang sau khi nhap ");
	    for (int j : A) {
			System.out.print(j +"\t");
		}
	         
	    System.out.println("\nNhập số nguyên k: ");
	    int k = scanner.nextInt();	   
	    for (c = i = 0; i < n; i++) {
	        if (A[i] != k) {
	            A[c] = A[i];
	            c++;
	        }
	    }	         
	    n = c; 
	    System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
	    for (int j : A) {
			System.out.print(j +"\t");
		}
	}
	
		
}


