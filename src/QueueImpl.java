/**
 * Created by riska amaliyah on 04-Apr-17.
 */
public class QueueImpl {

    public static <T> void main(String[] args) {
        Queue newQueue = new Queue(5);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        newQueue.enQueue(5);
        System.out.println((T) newQueue.toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.toString());


        //jika queue penuh
        Queue myQueue = new Queue(2);
        myQueue.enQueue(6);
        myQueue.enQueue(7);
        myQueue.enQueue(8);
        myQueue.enQueue(9);
        myQueue.enQueue(10);
        System.out.println((T) myQueue.toString());
        System.out.println((T) myQueue.deQueue().toString());
        System.out.println((T) myQueue.deQueue().toString());
        System.out.println((T) myQueue.toString());

    }

}