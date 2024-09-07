import java.util.*;
abstract class Sides {
	abstract void numberOfSides();
}
class Rect extends Sides
{
	int side;
	Rect() 
	{
		this.side=4;
	}
	public void numberOfSides() 
	{
		System.out.println("I am a Rectangle with "+side+" sides");
	}

}
class Triangle extends Sides
{
	int side;
	public Triangle()
{
		this.side=3;
}
	public void numberOfSides() 
	{
		System.out.println("I am a Triangle with "+side+" sides");
	}

}
class Hexagon extends Sides
{
	int side;
	public Hexagon() 
	{
		this.side=6;
	}
	public void numberOfSides() 
	{
		System.out.println("I am a Hexagon with "+side+" sides");
	}

}
public class Abstra
{
	public static void main(String [] Args) 
	{
		Rect a=new Rect();
		Triangle b=new Triangle();
		Hexagon c=new Hexagon();
		a.numberOfSides();
		b.numberOfSides();
		c.numberOfSides();
	}
}