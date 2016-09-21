import java.awt.*; 

public class Point 
{
	private boolean isFill;
	private int x;
	private int y;
	
	
	public Point(int x, int y, boolean t) //true means filled
	{
	   this.x = x-(5/2);
	   this.y = y-(5/2);
	   isFill = t; 
	}
	
	public void drawPoint(Graphics g)
	{
		if(isFill)
		{
			g.setColor(Color.red); //red points are above line
			g.fillOval(x, y, 7, 7);
		}
		else
		{
			g.setColor(Color.blue); //blue points are below 
			g.fillOval(x, y, 7, 7);
		}
		g.setColor(Color.BLACK);
	} 
	
	
}
