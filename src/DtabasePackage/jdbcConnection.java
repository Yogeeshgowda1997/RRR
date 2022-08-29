package DtabasePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Statement;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3030";
		
		//Enter the database name as mysql name Demo
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/databasename", "root", "root");
		
		Statement s=(Statement) con.createStatement(); //connecting a way
		ResultSet rs=s.executeQuery("");
		//base index find the first index
		while(rs.next()) {
		
		WebDriver driver=new ChromeDriver();
	    driver.get("url");
		
		driver.findElement(By.id("txtUsername")).sendKeys(rs.getString("username"));  //Mysql username=Admin
		driver.findElement(By.id("txtPassword")).sendKeys(rs.getString("password"));   //Mysql password=admin123
		driver.findElement(By.id("btnLogin")).click();
		
		//System.out.println(	rs.getString("username"));
		//System.out.println(rs.getString("password"));
	
		}	

	}

}
