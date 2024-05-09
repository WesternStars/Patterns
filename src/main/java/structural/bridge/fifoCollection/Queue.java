package structural.bridge.fifoCollection;

import structural.bridge.list.LinkedList;

public class Queue<T> implements FifoCollection<T> {

    private final LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T pull() {
        return list.removeFirst();
    }
}
