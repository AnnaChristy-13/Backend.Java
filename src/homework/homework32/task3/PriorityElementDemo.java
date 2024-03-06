package homework32.task3;

public class PriorityElementDemo {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue(8,34);
        priorityQueue.enqueue(1,55);
        priorityQueue.enqueue(5,12);
        priorityQueue.enqueue(3,4);
        priorityQueue.enqueue(9,76);
        priorityQueue.enqueue(7,1);
        priorityQueue.enqueue(2,45);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.dequeue());

    }
}
