package whretg;
import java.util.*;
public class Oop2 {

	public static void main(String[] args) {
		
		salary employer = new salary(5, 1000, "hello", "world");
		System.out.println("Basic salary is: "+employer.getMonsal());
		employer.getINFO();

	}
}
class salary{
		private int ID;
		private double monsal;
		private String name;
		private String lastname;
		
		salary(int ID,double monsal, String name, String lastname){
			
			this.ID=ID; //ID=ID
			this.lastname=lastname;
			this.name=name;
			this.monsal=monsal;
		}
		public int getID() {
			return ID;
		}
		public String nln() {
			return name+" "+lastname;
		}
		public void raiseS(double per) {
			monsal=(1+per/100)*monsal;
		}
		public double getMonsal() {
			return monsal;
		}
		public void applyS(int year) {
			monsal += monsal*year*0.33/100;
		}
		
		public void getINFO() {
			System.out.println("ID:"+getID()+" name and last name:"+nln()+"SALARY:"+getMonsal());
		}
		
	}
		

