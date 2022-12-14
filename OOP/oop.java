package whretg;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		circle c = new circle();
		System.out.println(c.getArea());
		circle c2= new circle(10, "Red");
		c2.setR(5);// setting the new radius 
		System.out.println(c2.getArea());
		System.out.println(c2.toString());
	}
}

	class circle{
		private double radius;
		private String color;
		//constructors:
		//given elements:
		
		public circle(){
			radius= 1.0;
			color = "Blue";
		}
		public circle(double r, String c) {
			radius=r;
			color=c;
			
		}
		public double getR() {
			return radius;
		}
		public double getArea() {
			return radius*radius*Math.PI;
		}
		public String getColor() {
			return color;
		}
		public void setR(double newradius) {
			radius=newradius;
		
		}
		public String toString() {
			
			return "For the radius of:"+getR()+" the area is:"+getArea()+", while the color is " + getColor();
		}
	}
	
