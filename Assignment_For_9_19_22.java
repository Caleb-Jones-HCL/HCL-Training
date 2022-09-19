import java.util.*;

class WashingMachine{
	private int numClothes;
	
	public WashingMachine(int numClothes) {
		super();
		this.numClothes = numClothes;
	}
	public int getNumClothes() {
		return numClothes;
	}
	public void setNumClothes(int numClothes) {
		this.numClothes = numClothes;
	}

	public void switchOn(){
		
	}
	
	public int acceptClothes(int clothes){
		numClothes = clothes;
		return numClothes;
	}
	
	public void acceptDetergent() {
		
	}
	
	public void switchOff() {
		
	}
}

class Student{
	private String studentName;
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	public void setName(Scanner scnr) {
		this.studentName = scnr.nextLine();
	}
	public String getName() {
		return studentName;
	}
	
	public String gradeAverage(int a, int b, int c) {
		
		double avg = (a + b + c) / 3;
		
		if(avg >= 50) {
			return "Passed";
		}
		else {
			return "Failed";
		}
	}
}

class Bank{
	private double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		return balance + amount;
	}
	
	public double withdraw(double amount) {
		double total = balance - amount;
		
		if(total <= 0) {
			return 0;
		}
		else {
			return total;
		}
	}
	
}

class Vehicle{
	private String vehicleNo;
	private String manufacturer;
	private String color;
	public Vehicle(String vehicleNo, String manufacturer, String color) {
		super();
		this.vehicleNo = vehicleNo;
		this.manufacturer = manufacturer;
		this.color = color;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

class Truck extends Vehicle{
	private int loadCapacity;

	public Truck(String vehicleNo, String manufacturer, String color, int loadCapacity) {
		super(vehicleNo, manufacturer, color);
		this.loadCapacity = loadCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
		return "Load Capacity: " + loadCapacity + ", VehicleNo: " + getVehicleNo() + ", Manufacturer: "
				+ getManufacturer() + ", Color: " + getColor();
	}
}
	
class Bookstore{
	private String[] bookArray;
	private String[] CDArray;
	private String[] softwareArray;
	private String customerID;
	private String customerPass;
	private String address;
	private String[] cart;
	private String orderRecipt;
	
	
	
	public Bookstore(String[] bookArray, String[] cDArray, String[] softwareArray, String customerID,
			String customerPass, String address, String[] cart, String orderRecipt) {
		super();
		this.bookArray = bookArray;
		CDArray = cDArray;
		this.softwareArray = softwareArray;
		this.customerID = customerID;
		this.customerPass = customerPass;
		this.address = address;
		this.cart = cart;
		this.orderRecipt = orderRecipt;
	}

	
	public String[] getBookArray() {
		return bookArray;
	}


	public void setBookArray(String[] bookArray) {
		this.bookArray = bookArray;
	}


	public String[] getCDArray() {
		return CDArray;
	}


	public void setCDArray(String[] cDArray) {
		CDArray = cDArray;
	}


	public String[] getSoftwareArray() {
		return softwareArray;
	}


	public void setSoftwareArray(String[] softwareArray) {
		this.softwareArray = softwareArray;
	}


	public String getCustomerID() {
		return customerID;
	}


	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


	public String getCustomerPass() {
		return customerPass;
	}


	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String[] getCart() {
		return cart;
	}


	public void setCart(String[] cart) {
		this.cart = cart;
	}


	public String getOrderRecipt() {
		return orderRecipt;
	}


	public void setOrderRecipt(String orderRecipt) {
		this.orderRecipt = orderRecipt;
	}


	public boolean checkLogin(String username, String password) {
		boolean validLogin = false;
		
		return validLogin;
	}
	
	public void browseTitles(Scanner scnr) {
		
	}
	
	public void addToCart(String title) {
		
	}
	
	public void orderCart() {
		getAddress();
		setShippingOrder();
		billCustomer();
		orderRecipt = getOrderRecipt();
		logOff();
	}
	
	public void setShippingOrder() {
		String orderDetails = "Process to be implemented";
		setOrderRecipt(orderDetails);
	}
	
	public void billCustomer() {
		
	}
	
	public void logOff() {
		
	}
	
	
}
	


public class Assignment_For_9_19_22 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Truck truck1 = new Truck("19301290", "Ford", "Red", 100);
		System.out.println("Old truck1 is classified as: " + truck1);
		truck1.setLoadCapacity(99999);
		truck1.setColor("Black");
		System.out.println("New truck1 is classified as: " + truck1);
	}
	
	
	
	

}
