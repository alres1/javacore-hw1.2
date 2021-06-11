package hwCore12;


public class Main {
    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listenerErr = System.out::println;
        Worker worker = new Worker(listener,listenerErr);
        worker.start();

    }
}
