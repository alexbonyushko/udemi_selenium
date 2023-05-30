package org.alboniushko;

public class OpenSourseTask {
    public static void main(String[] args) {
        cycle();
    }

    public static void cycle() {
        for (int i = 0; i < 10; i++) {
            int j = i;
            i += j;
            System.out.println("i=" + i + "|j=" + j);
        }
    }
}
