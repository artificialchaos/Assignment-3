package lifesim;
import processing.core.PApplet;
import java.util.*;
public class Herbivore
{
	PApplet parent;
	int hposx = 0;
	int hposy = 0;
	public Herbivore(PApplet p)
	{
		parent = p;
	}
	public static void main(String[] args) 
	{
		

	}
	public void drawHerb( int x, int y)
	{
		 
		 parent.pushMatrix(); 
	     parent.translate(x, y);
	     parent.fill(0,255,0);
	     parent.ellipse(40, 40, 40, 40);
	     parent.popMatrix();
	     
	}


}
