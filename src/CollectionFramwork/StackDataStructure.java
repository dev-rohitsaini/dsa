package CollectionFramwork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {
        //create new stack
        Stack<Integer> myStack = new Stack<>();
        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);

        myStack.remove(1);

//        System.out.println(myStack);
        Iterator<Integer> itr = myStack.iterator();

//        while(itr.hasNext()){
//            System.out.println(itr+" "+itr.next());
//        }

        System.out.println(myStack.get(0));
//        for(int val:myStack){
//            System.out.println(val);
//        }

    }
}
