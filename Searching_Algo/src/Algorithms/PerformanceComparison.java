package Algorithms;

public class PerformanceComparison {
    public static void main(String[] args) {
        int n = 1000000;
        long start, end;

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) sb.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        StringBuffer sf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) sf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");
    }
}
