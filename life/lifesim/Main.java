package lifesim;
import processing.core.*;
import java.util.*;
public class Main extends PApplet
{

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
		bacteria.render();
		herbivore.drawHerb();
		
		if (frameCount % 30 == 0)
		{
			
			
			
		}
		
	}	
}
