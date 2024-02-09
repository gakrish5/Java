package threads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOddPrinterTest {

    @Test
    void testEvenOddPrinter() {
        EvenOddPrinter.EvenThread evenThread = new EvenOddPrinter.EvenThread();
        EvenOddPrinter.OddThread oddThread = new EvenOddPrinter.OddThread();

        // Start the threads
        evenThread.start();
        oddThread.start();

        // Wait for the threads to finish
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
