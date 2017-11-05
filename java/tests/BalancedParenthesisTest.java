import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


class BalancedParenthesisTest {

	@Test
	void testEmptySequenceReturnsTrue() {
		BalancedParenthesis bp = new BalancedParenthesis("");
        assertTrue(bp.isBalanced());
	}
	
    @Test
    void testSimpleMatchingParenthesisReturnsTrue() {
        BalancedParenthesis bp = new BalancedParenthesis("()");
        assertTrue(bp.isBalanced());
    }
    
    @Test
    void testSimpleUnmatchingParenthesisReturnsFalse() {
        BalancedParenthesis bp = new BalancedParenthesis(")(");
        assertFalse(bp.isBalanced());
    }
    
    @Test
    void testSimpleUnbalancedOpeningParenthesisReturnsFalse() {
        BalancedParenthesis bp = new BalancedParenthesis("(");
        assertFalse(bp.isBalanced());
    }

    @Test
    void testSimpleUnbalancedClosingParenthesisReturnsFalse() {
        BalancedParenthesis bp = new BalancedParenthesis(")");
        assertFalse(bp.isBalanced());
    }
    
    @Test
    void testNestedBalancedParenthesisReturnsTrue() {
        BalancedParenthesis bp = new BalancedParenthesis("(())");
        assertTrue(bp.isBalanced());
    }

    @Test
    void testNestedTriceBalancedParenthesisReturnsTrue() {
        BalancedParenthesis bp = new BalancedParenthesis("((()))");
        assertTrue(bp.isBalanced());
    }
    
    @Test
    void testNestedGroupBalancedParenthesisReturnsTrue() {
        BalancedParenthesis bp = new BalancedParenthesis("(()())");
        assertTrue(bp.isBalanced());
    }
    
    @Test
    void testManyNestedGroupBalancedParenthesisReturnsTrue() {
        BalancedParenthesis bp = new BalancedParenthesis("((()(()))())()()");
        assertTrue(bp.isBalanced());
    }
}