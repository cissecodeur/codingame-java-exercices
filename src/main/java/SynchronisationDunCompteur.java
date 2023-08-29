public class SynchronisationDunCompteur {

    /*
    Question
Transformez la méthode Counter.increment() pour qu'elle supporte l'accès concurrentiel de plusieurs threads.
     */

    private static int count = 0;
    /**
     * Increments count in a thread-safe manner.
     */
    public static synchronized int increment() {
        count = count + 1;
        return count;
    }
}
