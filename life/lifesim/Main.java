package lifesim;
import processing.core.*;
import java.util.*;

import lifesim.Object;
public class Main extends PApplet
{
	ArrayList<Herbivore> herbivores = new ArrayList<Herbivore>();
	ArrayList<Carnivore> carnivores = new ArrayList<Carnivore>();
	ArrayList<Object> objects = new ArrayList<Object>();
	public static void main(String[] args) 
	{
		PApplet.main(new String[] { "--present", "Main" });

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
		
		if (frameCount % 30 == 0)
			  {
				herbivore.hposx = (int)random(1300);
				herbivore.hposy = (int)random(800);
				carnivore.cposx = (int)random(1300);
				carnivore.cposy = (int)random(800);
				bacteria.render();
				if(bacteria.herbCount < 100)
				{
					Herbivore herb = null;
					herb = new Herbivore(this);
					herbivores.add(herb);
					herbivore.drawHerb();
					bacteria.herbCount++;
				}
				
				if(bacteria.carnCount < 100)
				{
					carnivore.drawCarn();
					bacteria.carnCount++;
				}
				
			  }
	}	
}
