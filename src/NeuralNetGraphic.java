import java.applet.*; 
import java.awt.*; 


public class NeuralNetGraphic extends Applet
{
	private static final long serialVersionUID = -4943705162421094955L; //this is there b/c eclipse wanted me to have one

	public void paint(Graphics g)
	{
		g.setColor(Color.GRAY); //set up window 
		g.fillRect(0, 0, 800, 600);
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, 600, 600);
		
		
		//add neural net functionality later
		Teacher t = new Teacher(2000); 
		Neuron n1 = new Neuron(); 
		Point p = null;
		
		for(int x = 0; x < t.getAnswers().length; x++)
		{
			
			
			
			double[] coordinates = t.teachByPoint(x, n1);
			boolean isFill = false; 
			if(n1.feedforward(coordinates) == 1)
			{
				isFill = true;
			}
			p = new Point((int) coordinates[0], (int)coordinates[1], isFill);
			p.drawPoint(g);
			g.setColor(Color.WHITE); 
			g.fillRect(0, 545, 115, 55);
			g.setColor(Color.BLACK);
			g.drawString("Weights", 30, 560); 
			String weight =  String.format("%.4g%n", n1.x_weight);
			g.drawString("X Weight: " + weight, 3, 572);
			weight = String.format("%.4g%n", n1.y_weight);
			g.drawString("Y Weight: " + weight, 3, 584);
			weight = String.format("%.3g%n", n1.bias_weight);
			g.drawString("Bias Weight: " + weight, 3, 597);
			
			try {
			    Thread.sleep(25);                 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt(); //for exceptions in thread 
			} 
			
		} 
		
		
		
		
	}

	
	
}
