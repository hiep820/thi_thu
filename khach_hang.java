package thi_thu;
import java.util.Scanner;

public class khach_hang {
		private String fullName;
		private String address;
		private int phone;
		private double amount;
		private double percentage;
		private double tax;
			// o A constructor for a Customer object with the fields above as parameters. 
		public khach_hang(String fullName, String address, int phone, double amount, double percentage, double tax) {
			super();
			this.fullName = fullName;
			this.address = address;
			this.phone = phone;
			this.amount = amount;
			this.percentage = percentage;
			this.tax = tax;
			}
			
		public khach_hang() {
			super();
			}

			//A method for accepting the customer details from keyboard. 
		public void input() {
				Scanner nhap = new Scanner(System.in);
				System.out.println("Full name: ");
				this.fullName = nhap.nextLine();
				System.out.println("Address: ");
				this.address = nhap.nextLine();
				System.out.println("Phone: ");
				this.phone = nhap.nextInt();
				System.out.println("Amount of money before discount and tax: ");
				this.amount = nhap.nextDouble();
				System.out.println("Percentage of discount : ");
				this.percentage = nhap.nextDouble();
				System.out.println("Tax (in percent): ");
				this.tax = nhap.nextDouble();
			}
			//A method for printing the customer details 
			public void output() {
				System.out.println("Full name: " + this.fullName);
				System.out.println("Address: " + this.address);
				System.out.println("Phone: " + this.phone);
				System.out.println("Amount of money before discount and tax: " + this.amount);
				System.out.println("Percentage of discount : " + this.percentage);
				System.out.println("Tax (in percent): " + this.tax);
			}
			// A method “CalculateTheAmount()” for calculate the actual amount
			public double CalculateTheAmount() {
				return (this.amount - this.amount*(this.percentage/100) + this.amount * (this.tax/100));
			}
			
			
	}

