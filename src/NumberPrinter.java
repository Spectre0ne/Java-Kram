public class NumberPrinter {
    public static void main(String[] args) {
        int limit = 20; // Grenze für die Anzahl der Zahlen

        // Erstelle Thread für gerade
        Thread evenThread = new Thread(new NumberRunnable(limit, true));
        // Erstelle Thread für ungerade
        Thread oddThread = new Thread(new NumberRunnable(limit, false));


        evenThread.start();
        oddThread.start();
    }
}

class NumberRunnable implements Runnable {
    private int limit;
    private boolean isEven;

    public NumberRunnable(int limit, boolean isEven) {
        this.limit = limit;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        for (int i = isEven ? 2 : 1; i <= limit; i += 2) {
            if (isEven) {
                System.out.println("Gerade Zahl: " + i);
            } else {
                System.out.println("Ungerade Zahl: " + i);
            }
         }
    }
}
