import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//Taylor MacIntyre
//B00752864

//FIFO -> First In First Out
class QueueTest {
    public int result;
    //Test 1 - Test to check whether the number of elements in a newly created Queue object is zero
    @Test
    public void ensureNewQueueIsEmpty(){
        Queue queue1 = new Queue();
        result = queue1.size;
        assertEquals(0, result);
    }

    //Test 2 - Test to check whether the number of elements in a Queue object is one after 'enqueue' method is called
    @Test
    public void ensureSizeUpdatesAfterEnqueue(){
        Queue queue2 = new Queue();
        queue2.enqueue('a');
        result = queue2.size;
        assertEquals(1, result);
    }

    //Test 3 - Test to check whether you get item 'a' (assuming the Queue holds strings) from a Queue object after
    // calling 'enqueue('a')', 'enqueue('b')' and 'dequeue()' in that order
    @Test
    public void ensureProperEnqueueAndDequeueFunction() throws UnderFlowException{
        Queue queue3 = new Queue();
        queue3.enqueue('a');
        queue3.enqueue('b');
        char actual = queue3.dequeue();
        assertEquals('a', actual);
    }

    //Test 4 - Test to check whether 'dequeue' method throws a UnderFlowException if the method is called on an empty
    // Queue object.
    @Test
    public void dequeueEmptyQueue() throws UnderFlowException {
        Queue queue4 = new Queue();
        assertThrows(UnderFlowException.class, ()->queue4.dequeue());
    }

}