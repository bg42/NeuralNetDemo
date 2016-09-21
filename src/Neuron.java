
public class Neuron
{
	public double x_weight;
	public double y_weight;
	public double bias_weight; //is used to account for points like (0, 0)
	
	public Neuron()
	{
		 x_weight = (Math.random() * 2) - 1; 
		 y_weight = (Math.random() * 2) - 1;
		 bias_weight = (Math.random() * 2) - 1;
		 
	}
	
	int feedforward(double[] inputs) 
	{
		double weighted_val = 0;
		weighted_val += inputs[0] * x_weight;
		weighted_val += inputs[1] * y_weight;
		weighted_val += 1 * bias_weight;
		return activate(weighted_val);	
	}
	
	int activate(double sum)
	{
		if (sum > 0)
			{
				return 1;
			}
		else 
			{
				return -1;
			}
	}
	
	void train(double[] inputs, int x)
	{
		int estimate = feedforward(inputs);
		double error = x - estimate; 
		x_weight += 0.01 * error * inputs[0];
		y_weight += 0.01 * error * inputs[1];
		bias_weight += 0.01 * error * inputs[2];
	}
	
	
}
