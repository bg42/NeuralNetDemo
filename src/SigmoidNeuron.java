
public class SigmoidNeuron
{
	public double x_weight;
	public double y_weight;
	public double[] weights;
	public double bias_weight; //is used to account for points like (0, 0)
	
	public SigmoidNeuron()
	{
		 x_weight = (Math.random() * 2) - 1; 
		 y_weight = (Math.random() * 2) - 1;
		 bias_weight = (Math.random() * 2) - 1;
		 weights = new double[]{x_weight, y_weight, bias_weight};
		 
	}
	
	double feedforward(double[] inputs) 
	{
		double weighted_val = 0;
		for(int i = 0; i < inputs.length; i++)
		{
			weighted_val += weights[i] * inputs[i];
		}
		return activate(weighted_val);	
	}
	
	double activate(double sum) //this is the sigmoid function
	{
		return (1 / (1 + Math.pow(Math.E, -sum)));
	}
	
	void train(double[] inputs, int x) //rewrite with backpropagation
	{
		double estimate = feedforward(inputs); //change error functon to gradient descent
		double error = x - estimate; 
		for(int i = 0; i < inputs.length; i++)
		{
			weights[i] += 0.01 * error * inputs[i];
		}
	}
	
	
}
