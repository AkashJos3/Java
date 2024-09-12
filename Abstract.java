
abstract class Shape{
	 abstract void  numberOfSides();
}
class Triangle extends Shape{
    int side;
    Triangle(int side) {
    	this.side = side;
    }
   public void numberOfSides() {
    	System.out.println("I'm Triangle, Number of sides is "+side);
 }
}
class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side = side;
	}
	void numberOfSides() {
		System.out.println("I'm Rectangle, Number of sides is="+side);
	}		
	}
class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side= side;
	}
 public	void numberOfSides() {
		System.out.println ("I,m Hexagon,Number of sides ="+side);
	}
	}
public class Abstract {
	public static void main(String[]args) {
		Triangle t = new Triangle(3); 
        Rectangle r = new Rectangle(4);
        Hexagon h = new Hexagon(6);
          r.numberOfSides();
          t.numberOfSides();
          h.numberOfSides();
  }

}