package lifesim;
import processing.core.PApplet;
import java.util.*;
public class Herbivore
{
	PApplet parent;
	
	public Herbivore(PApplet p)
	{
		parent = p;
	}
	public static void main(String[] args) {
		

	}
	void drawHerb()
	{
	     parent.pushMatrix(); 
	     parent.fill(0,255,0);
	     parent.ellipse(40, 40, 40, 40);
	     parent.popMatrix();
	}

}
