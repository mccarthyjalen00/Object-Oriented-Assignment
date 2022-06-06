//**********************************
//COSC 1336 CS1
//Name: Jalen McCarthy
//Date: 11/28/21
//MyPoint Class
//**********************************
public class MyPoint {

	//Create Data Field
	private int x = 0;
	private int y = 0;
	
	//No-aug Constructor
	MyPoint() {
		x = 0;
		y = 0;
		
	}
	MyPoint(int newX, int newY) {
		x = newX;
		y = newY;
	}
	//Return x-value
	public int getX() {
		return x;
	}
	//Set a new x-value
	public void setX(int newX) {
		if (newX > 0)
		x = newX;
	}
	//Return y-value
	public int getY() {
		return y;
}
	//Set a new y-value
	public void setY(int newY) {
		if (newY > 0)
			y = newY;
	}
	//Get Distance
	public int distance(int x, int y) {
       return (int) Math.sqrt((this.x - x) * (this.x - x) 
    	 + (this.y - y) * (this.y - y));
    }
	 public int distance(MyPoint point) {
	   return distance(point.x, point.y);
	 }
}

