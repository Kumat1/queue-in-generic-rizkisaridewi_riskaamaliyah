/**
 * Created by riska amaliyah on 04-Apr-17.
 */
import java.util.Arrays;

public class Queue<T> {

    int size;
    T[] queue;
    private int front;
    private int rear;

    public Queue(int inSize) {
        size = inSize;
        queue = (T[]) new Object[size];
        front = -1;
        rear = -1;
    }

    public boolean isempty() {
        return (front == -1 && rear == -1);
    }

    public void enQueue(T value) {
        if ((rear+1)%size==front) {
            throw new IllegalStateException("Queue penuh");

        } else if (isempty()) {
            front++;
            rear++;
            queue[rear] = value;

        } else {
            rear=(rear+1)%size;
            queue[rear] = value;

        }
    }

    public T deQueue() {
        T value = null;
        if (isempty()) {
            throw new IllegalStateException("Antrian kosong, tidak bisa dequeue");
        } else if (front == rear) {
            value = queue[front];
            front = -1;
            rear = -1;

        } else {
            value = queue[front];
            front=(front+1)%size;

        }
        return value;

    }

    @Override
    public String toString() {
        return "Queue [Awal=" + front + ", " +
                "akhir=" + rear + ", Ukuran=" + size
                + ", queue=" + Arrays.toString(queue) + "]";
    }

}
