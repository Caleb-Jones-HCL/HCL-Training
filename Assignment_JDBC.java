/*
 * Assignment 9/22/22 For HCL
 * By Caleb Jones
 */


import java.io.*;
import java.sql.*;
import java.util.*;
public class Assignment_JDBC {
	
	public static void main(String[] args) throws Exception
    {
		//Build and establish a connection to the MySQL database
        String url = "jdbc:mysql://localhost:3306/classicmodels"; // Database to link to
        // MySQL credentials
        String username = "root";
        String password = "root";
        // Drivers to establish connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully\n\n\n");
       
        //=== Queries can now be quantified and executed ===
        
        // Receive a new Employee name to add to the database:
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        Statement st = con.createStatement();
        String query = "";
        String userFirst = "";
        String userLast = "";
        int randEmpNum = rand.nextInt(10000);
        
       
        System.out.println("Enter the first name: ");
        userFirst = scnr.nextLine();
        System.out.println("Enter the last name: ");
        userLast = scnr.nextLine();
        System.out.println("The following employee will be added to the database with Employee Number: " + randEmpNum);
        
        // Query to add the employee to the database
        query = "INSERT INTO employees "+
        		"VALUES (" + randEmpNum + ", \'" + userLast + "\', \'" + userFirst + "\', 'x4611', 'mpatterso@classicmodelcars.com', 1, 1002, 'VP Sales')";
        st.executeUpdate(query); // Execute query
     
        System.out.println("========================================");
        System.out.println("Deleting this duplicate employee \"Donald Duck\" by the employee number 2727");
        //Adding Donald Duck for deletion query
        query = "INSERT INTO employees " +
        		"VALUES (2727, 'Donald' , 'Duck' , 'x4611', 'mpatterso@classicmodelcars.com', 1, 1002, 'VP Sales')";
        st.executeUpdate(query);
        query = "SELECT employeeNumber, lastName, firstName FROM employees WHERE employeeNumber = 2727";
        ResultSet rs = st.executeQuery(query); // Execute query
        // Loop to display results
        while(rs.next()) {
        	int employeeNumber = rs.getInt("employeeNumber");
        	String lastName = rs.getString("lastName");
        	String firstName = rs.getString("firstName");
        	
        	System.out.printf("%d | %s | %s\n",employeeNumber, lastName, firstName);
        }
        
        // Deleting records
        query = "DELETE FROM employees WHERE employeeNumber = 2727";
        st.executeUpdate(query);
        
        // Search records
        System.out.println("========================================");
        System.out.printf("Search for employee %s %s by their Employee Number: %d\n", userFirst, userLast, randEmpNum);
        query = "SELECT employeeNumber, lastName, firstName FROM employees WHERE employeeNumber = " + randEmpNum;
        rs = st.executeQuery(query);
        // Loop to display results
        while(rs.next()) {
        	int employeeNumber = rs.getInt("employeeNumber");
        	String lastName = rs.getString("lastName");
        	String firstName = rs.getString("firstName");
        	
        	System.out.printf("%d | %s | %s\n",employeeNumber, lastName, firstName);
        }
        
        System.out.println("========================================");
        System.out.println("Below is the employees table with the new data");
        query = "SELECT lastName, firstName FROM employees";
        rs = st.executeQuery(query);
        //Loop through table
        while(rs.next()) {
        	String lastName = rs.getString("lastName");
        	String firstName = rs.getString("firstName");
        	
        	System.out.printf("%s | %s\n", lastName, firstName);
        }
        
        
        //Ending Query Session
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("\n\n\nConnection Closed....");
    }
}
