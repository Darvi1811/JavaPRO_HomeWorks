package HW_10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeList<T> {
    private final List<T> tList = new ArrayList<>();
    final ReentrantLock lock = new ReentrantLock();

    public void add(T el) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            tList.add(el);
        } finally {
            lock.unlock();
        }
    }

    public void remove(T el) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            tList.remove(el);
        } finally {
            lock.unlock();
        }
    }

    public T get(int index) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            return tList.get(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "" + tList;
    }
}
