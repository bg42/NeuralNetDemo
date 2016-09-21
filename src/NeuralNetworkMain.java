


public class NeuralNetworkMain {
	
	//public void paint(Graphics g) {
	//]
	
	public static void main(String args[])
	{
		int points_to_test = 10000;
		Teacher t = new Teacher(points_to_test);
		Teacher tester = new Teacher(points_to_test);
		Neuron n1 = new Neuron();
		t.teach(n1);
		//line is y = -x
		System.out.println("Accuracy: " + tester.test(n1, points_to_test));
		
		//add visual representation, expand network?
		
	}
	
	
}
