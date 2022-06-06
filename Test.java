//**********************************
//COSC 1336 CS1
//Name: Jalen McCarthy
//Date: 11/28/21
//MyPoint Test
//**********************************
public class Test {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint Point1 = new MyPoint(0,0);
		MyPoint Point2 = new MyPoint(1,12);
		MyPoint Point3 = new MyPoint(3,8);
		
		String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
	    
		for (int i = 0; i < tokens.length; i++)
		  System.out.println(tokens[i]);

		
	//Get Point 1
	System.out.println("The first point is: " + "(" +
	Point1.getX() + "," + Point1.getY()+ ")" );
	
	//Get Point 2
	System.out.println("The second point is: " + "(" +
			Point2.getX() + "," + Point2.getY()+ ")" );
	//Get Point 3
	System.out.println("The third point is: " + "(" +
			Point3.getX() + "," + Point3.getY()+ ")" );
	
	//Get Distance for Point 1 and 2
	System.out.println("\nThe distance between Point1 and Point2 is:" +
	Point1.distance(Point2));
	
	//Get Distance for Point 2 and 3
	System.out.println("The distance between Point2 and Point3 is:" +
			Point2.distance(Point3));
	
	//Get Distance for Point 1 and 3
	System.out.println("The distance between Point1 and Point3 is:" +
			Point1.distance(Point3));
}
}
