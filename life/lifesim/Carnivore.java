package lifesim;
import processing.core.PApplet;
import java.util.*;
public class Carnivore 
{
	PApplet parent;
	int cposx = 0;
	int cposy = 0;
	public Carnivore(PApplet p)
	{
		parent = p;
	}
	public static void main(String[] args) 
	{
	

	}
	void drawCarn( int p ,int q )
	{
	     parent.pushMatrix();
	     parent.translate(p, q);
	     parent.fill(255,0,0);
	     parent.ellipse(40, 40, 40, 40);
	     parent.popMatrix();
	
	}
}
