package seralization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	private int empId;
	private String ename;
	private double salary;
	public Emp(int empId, String ename, double salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}
	
}
public class SeralizationDemo {

	public static void main(String[] args) {
		Emp emp=new Emp(1,"akshay",434444);
		try {
			FileOutputStream fileout=new FileOutputStream("D:\\akash\\file_emp.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			out.writeObject(emp);
			out.close();
			fileout.close();
		}catch(Exception e) {
          System.out.println(e.getMessage());
          e.printStackTrace();
	}
     System.out.println("serilization succes");
}
}