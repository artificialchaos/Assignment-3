package lifesim;
import processing.core.*;
import java.util.*;

import lifesim.Object;
public class Main extends PApplet
{
	
	public static void main(String[] args) 
	{
		PApplet.main(new String[] { "--present", "Main" });
		ArrayList<Herbivore> herbivores = new ArrayList<Herbivore>();
		ArrayList<Carnivore> carnivores = new ArrayList<Carnivore>();
		ArrayList<Object> Objects = new ArrayList<Object>();

	}
	
	Bacteria bacteria;
	Herbivore herbivore;
	Carnivore carnivore;
	public void setup()
	{
	  size(1300, 800);
	  background(0);
	  
	  bacteria = new Bacteria(this);
	  herbivore = new Herbivore(this);
	  carnivore = new Carnivore(this);
	}
	
	public void draw() 
	{
		
		for(int i = 0 ; i <= 10 ; i++)
		{
			herbivore.hposx = (int)random(1300);
			herbivore.hposy = (int)random(800);
			carnivore.cposx = (int)random(1300);
			carnivore.cposy = (int)random(800);
			//bacteria.render();
			herbivore.drawHerb();
			carnivore.drawCarn();
		}
	}	
}
