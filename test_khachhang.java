package thi_thu;
import java.util.ArrayList;
import java.util.Scanner;

public class test_khachhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<khach_hang> cus = new ArrayList<khach_hang>();
		Scanner nhap = new Scanner(System.in);
		// Write a program that input 5 customers and print all again 
		System.out.println("Nhap khach hang: ");
		int i = 0;
		do {
			khach_hang c = new khach_hang();
			c.input();
			cus.add(c);
			i=i+1;
		} while (i<5);
		System.out.println("In khach hang: ");
		for (khach_hang customer : cus) {
			customer.output();
		}
		// Write another program to list all customers that pay for receipt in maximum actual amount
		System.out.println("In khach hang voi so tien thuc te: ");
		for (khach_hang customer : cus) {
			customer.output();
			System.out.println("Maximum actual amount: " + customer.CalculateTheAmount());
		}
	}

}

