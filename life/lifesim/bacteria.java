package lifesim;
import processing.core.PApplet;
import java.util.*;
public class Bacteria 
{
	PApplet parent;
	
	public Bacteria(PApplet p)
	{
		parent = p;
	}
	public void render() 
	{
		parent.fill(0);
		parent.rect(100, 100, 100, 100);
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Herbivore> herbivores = new ArrayList<Herbivore>();
		
	}

}
