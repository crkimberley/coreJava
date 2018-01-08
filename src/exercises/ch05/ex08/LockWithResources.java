package exercises.ch05.ex08;

import java.util.concurrent.locks.ReentrantLock;

public class LockWithResources {

    private AutoCloseable lockHelper() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        return lock::unlock;
    }

    public void locking() {
        try(AutoCloseable lock = lockHelper()) {
            // Some locked code
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}