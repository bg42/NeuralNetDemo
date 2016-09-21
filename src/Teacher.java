
public class Teacher
{

	private double[][] trainData;
	private int[] answers;
	
	public Teacher(int n)   //n sets to test
	{
		trainData =  new double[n][3];
		answers = new int[n];
		for(double i = 0; i < n; i++)
		{
			trainData[(int) i][0] = (int)(Math.random() * 797); //create random points 
			trainData[(int) i][1] = (int)(Math.random() * 597);
			if(trainData[(int) i][1] > ( (1 * trainData[(int) i][0]) + 0) ) //y = -x 
			{
				answers[(int) i] = -1;
			}
			else if(trainData[(int) i][1] < ( (1 * trainData[(int) i][0]) + 0) ) //signs flipped due to negatives
			{
				answers[(int) i] = 1;
			}
			else 
			{
				answers[(int) i] = 0;
		    trainData[(int) i][2] = 1;
		 }
		 
		}
		
		
	}
	
	
	public double[] teachByPoint(int i, Neuron x)
	{
		x.train(trainData[i], answers[i]);
		return trainData[i];
	} 
	
	public int[] getAnswers()
	{
		return answers;
	}
	
	public void teach(Neuron x)
	{
		for(int i = 0; i < answers.length; i++)
		{
			x.train(trainData[i], answers[i]);
		}
	}
	
	public String test(Neuron n, int x)
	{
		int counter = 0;
		String s = "";
		for(int i = 0; i < trainData.length; i++)
		{
			if(n.feedforward(trainData[i]) == answers[i])
			{
				counter++;
			}
		}
		s = counter + " / " + x;
		return s;
	}
	
	
	
}
