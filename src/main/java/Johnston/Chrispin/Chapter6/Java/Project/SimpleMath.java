package Johnston.Chrispin.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		double results = numerator / denominator;
		System.out.println(results);
		return results;
	}
}