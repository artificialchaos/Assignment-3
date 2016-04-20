package lifesim;
import processing.core.*;
import java.util.*;

import lifesim.Object;
public class Main extends PApplet
{
	ArrayList<Object> herbivores = new ArrayList<Object>();
	ArrayList<Object> carnivores = new ArrayList<Object>();
	ArrayList<Object> objects = new ArrayList<Object>();
	public static void main(String[] args) 
	{
		PApplet.main(new String[] { "--present", "Main" });

	}

	Bacteria bacteria;
	Herbivore herbivore;
	Carnivore carnivore;
	Object object;
	public void setup()
	{
	  size(1300, 800);
	  background(0);
	  
	  bacteria = new Bacteria(this);
	  herbivore = new Herbivore(this);
	  carnivore = new Carnivore(this);
	  object = new Object(this);
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
					Object herb = null;
					herbivores.add(herb);
					objects.add(herb);
					herbivore.drawHerb(herbivore.hposx, herbivore.hposy);
					bacteria.herbCount++;
				}
				
				if(bacteria.carnCount < 100)
				{
					Object carn = null;
					carnivores.add(carn);
					objects.add(carn);
					carnivore.drawCarn(carnivore.cposx, carnivore.cposy);
					bacteria.carnCount++;
				}
				
			  }
	}
	public void collisions()
	{
		for(int i = objects.size() - 1 ; i >= 0   ;i --)
		{
			Object bac1 = objects.get(i);
			if (bac1 instanceof herbivores)
		    {
				for(int j = objects.size() - 1 ; j >= 0   ;j --)
			    {
					Object bac2 = objects.get(j);
					if (bac2 instanceof carnivores) 
			        {
						PVector temp = new PVector(0,0);
				        temp.x = bac2.carnivore.cposx + 15;
				        temp.y = bac2.carnivore.cposy + 10;
				        if (bac1.position.dist(temp) < 25)
				        {
				          objects.remove(bac1);
				        }
			        }
			    }
		    }
		}
	}
}
