import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

//FIFO -> First In First Out

//Team member to complete Queue.java code -> Lynda Ofume

public class Queue {
    public ArrayList<Character> theArray;
    public int size;

    public Queue (){
        size= 0;
        theArray = new ArrayList<Character>();
    }
    //enqueue
    public void enqueue(char chars){
        theArray.add(0, chars);
        size++;
    }
    //dequeue

    public char dequeue() throws UnderFlowException{
        if(size ==0){
            throw new UnderFlowException();
        }
        else{
            char chars = theArray.get(size -1);
            theArray.remove(size -1);
            size--;
            return chars;
        }
    }
}
