package CollectionFramwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDataStructure {
    public static void main(String[] args) {
        //Create a Quesue

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);

        System.out.println(myQueue.remove());
        System.out.println(myQueue);

    }
}
