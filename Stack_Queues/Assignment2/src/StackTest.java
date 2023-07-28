import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

//FILO -> First In Last Out

//Team member to complete StackTest.java code -> Lynda Ofume

class StackTest {
    public int value;
    public char result;
    //Test 1 - Test to check whether the number of elements in a newly created Stack object is zero
    @Test
    public void stackIsZero(){
        Stack stackT1 = new Stack();
        value = stackT1.size;
        assertEquals(0, value);
    }
    //Test 2 - Test to check whether the number of elements in a Stack object is one after 'push' method is called
    @Test
    public void pushToFindOne(){
        Stack stackT2 = new Stack();
        stackT2.push('a');
        value = stackT2.size;
        assertEquals(1, value);
    }
    //Test 3 - Test to check whether you get item 'b' (assuming the Stack holds strings) from a Stack object after
    // calling 'push('a')', 'push('b')' and 'pop()' in that order
    @Test
    public void findTheB() throws UnderFlowException{
        Stack stackT3 = new Stack();
        stackT3.push('a');
        stackT3.push('b');
        char result = stackT3.pop();
        assertEquals('b', result);
    }

    //Test 4 - Test to check whether 'pop' method throws a UnderFlowException if the method is called on an empty Stack object.
    @Test
    public void underFlowExceptionPop() throws UnderFlowException{
        Stack stackT4 = new Stack();
        assertThrows(UnderFlowException.class, ()-> stackT4.pop());
    }
}