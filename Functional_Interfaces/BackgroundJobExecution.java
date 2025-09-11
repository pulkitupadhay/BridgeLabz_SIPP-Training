public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Job executed in background");
        new Thread(job).start();
    }
}
