
public class ExtraCreditFiboNacci {

	public static void main(String[] args) {
		System.out.println("n=1, expected: 1, actual: " + calculateFibonacci(1));
		System.out.println("n=2, expected: 1, actual: " + calculateFibonacci(2));
		System.out.println("n=3, expected: 2, actual: " + calculateFibonacci(3));
		System.out.println("n=4, expected: 3, actual: " + calculateFibonacci(4));
		System.out.println("n=5, expected: 5, actual: " + calculateFibonacci(5));
		System.out.println("n=10, expected: 55, actual: " + calculateFibonacci(10));
		System.out.println("n=20, expected: 6765, actual: " + calculateFibonacci(20));
		System.out.println("n=100, expected: 354,224,848,179,261,915,075, actual: " + calculateFibonacci(100));
	}
	
	public static int calculateFibonacci(int n) {
		float fibNum = 0;
		if(n > 0) {
			float sqrt5 = (float) Math.sqrt(5);
			float plusSqrt5 = (1+sqrt5)/2;
			float minusSqrt5 = (1-sqrt5)/2;
			
			fibNum = (float) ((Math.pow(plusSqrt5, n) - Math.pow(minusSqrt5, n)) / sqrt5);
		}
		return Math.round(fibNum);
	}
}
