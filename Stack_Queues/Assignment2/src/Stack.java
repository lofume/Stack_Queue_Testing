//FILO -> First In Last Out
import java.util.ArrayList;

//Taylor MacIntyre
//B00752864
public class Stack {

    public ArrayList<Character> array;
    public int size;
    public Stack (){
        this.size = 0;
        this.array = new ArrayList<Character>();
    }


    public void push(char input){
        this.array.add(input);
        this.size++;
    }

    public char pop() throws UnderFlowException{

        if(size == 0){
            throw new UnderFlowException();
        }
        else{
            char item = this.array.get(size-1);
            this.array.remove(size-1);
            size--;
            return item;
        }
    }



}
