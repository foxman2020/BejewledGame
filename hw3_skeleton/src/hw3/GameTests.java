package hw3;
import java.util.*;
import api.Jewel;


public class GameTests {
	
	
	public static void main(String[] args)
	{
	// descriptor for initial grid of a 3 x 4 game
	String[] desc =
	{
	"2 0 1 3",
	"1 0 1 3",
	"2 1 2 1"
	};

	JewelFactory generator = new JewelFactory(4);
	Game g = new Game(desc, generator);
	System.out.println(g.toString());
	System.out.println(g.getJewel(2, 1)); // expected 1
	g.setJewel(2, 1, new Jewel(3));
	System.out.println(g.getJewel(2, 1)); // expected 3
	g.setJewel(2, 1, null);
	System.out.println(g.toString());
	 } 
			

}
