package lifesim;
import processing.core.*;
public class Main extends PApplet
{

	public static void main(String[] args) 
	{
		PApplet.main(new String[] { "--present", "Main" });
	}
	
	Bacteria bacteria;
	
	public void setup()
	{
	  size(1300, 800);
	  background(255);
	  bacteria = new Bacteria(this);
	}
	
	public void draw() 
	{
		bacteria.render();
	}	
}
