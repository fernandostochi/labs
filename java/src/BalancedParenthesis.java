import java.util.*;

class BalancedParenthesis {
	
	private List<Character> lstValidElements = Arrays.asList('(', ')','[', ']', '{', '}');
	private Stack<Character> stack = new Stack<Character>();
	private String sequence = null;
	
	public BalancedParenthesis(String sequence) {
		this.sequence = sequence;
	}
	
	public boolean isBalanced() {
		for(char element: this.sequence.toCharArray()) {
			if (!lstValidElements.contains(element)) continue;
			
			if (this.isOpeningElement(element)) {
				this.stack.push(element);
				continue;
			}
			
			if (this.stack.empty() || !this.isAMatch(element)) {
				return false;
			}
			
			this.stack.pop();			
		}
		
		return this.stack.empty();
	}
	
	private boolean isAMatch(char element) {
		if (element == ')' && this.stack.peek() == '(') return true;
		if (element == ']' && this.stack.peek() == '[') return true;
		if (element == '}' && this.stack.peek() == '{') return true;
		
		return false;
	}
	
	private boolean isOpeningElement(char element) {
		return element == '(' ||
			element == '[' ||
			element == '{';
	}
}