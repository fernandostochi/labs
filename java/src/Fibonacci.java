
public class Fibonacci {
	public int getValue(int n) {
		if (n <= 1) return n;
		
		int previous_1 = 1;
		int previous_2 = 0;
		int current = 0;
		
		for(int i = 2; i <= n; i++) {
			current = previous_1 + previous_2;
			int temp = previous_1;
			previous_1 = current;
			previous_2 = temp;
		}
		
		return current;
	}
	
	public int getValueRecursively(int n) {
		if (n <= 1) return n;
		
		int current = this.getValueRecursively(n - 1) + this.getValueRecursively(n - 2);
		return current;
	}
}
