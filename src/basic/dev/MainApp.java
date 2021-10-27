package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// cach nhap tu ban phim
		System.out.println("Nhap vao so nguyen a");
		int a = sc.nextInt();
		System.out.println(a);
		
		System.out.println("Nhap vao so nguyen b ");
		int b = sc.nextInt();
		System.out.println(b);
		// tinh tong
		int tong = a + b;
		System.out.println("Tong = " + tong);
		// tinh hieu
		int hieu = a - b;
		System.out.println("Hieu = " + hieu);
		// tinh tich
		int tich = a * b;
		System.out.println("Tich = " + tich);
		// tinh thuong
		int thuong = a / b;
		System.out.println("Thuong = " + thuong);
		boolean c;
		c = a > b;
		System.out.println("a lon hon b: " + c);
		c = a < b;
		System.out.println("a be hon b: " + c);
		c = a >= b;
		System.out.println("a lon hon hoac bang b: " + c);
		c = a <= b;
		System.out.println("a be hon hoac bang b: " + c);
	}
}
