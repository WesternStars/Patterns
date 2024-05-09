package structural.bridge.fifoCollection;

public interface FifoCollection<T> {

    //Adds element to collection
    void offer(T element);

    //Removes & returns first element from collection
    T pull();
}
