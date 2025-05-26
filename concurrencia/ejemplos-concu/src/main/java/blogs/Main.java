package blogs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean modoConcurrente = true;
        List<BlogReader> blogReaders = List.of(
                new BlogReader("Alice", 1),
                new BlogReader("Bob", 2),
                new BlogReader("Charlie", 3)
        );

        if (modoConcurrente) {
            System.out.println("All users are reading their posts concurrently...");
        } else {
            System.out.println("All users are reading their posts sequentially...");
        }

        for (BlogReader blogReader : blogReaders) {
            if (modoConcurrente) {
                Thread thread = new Thread(blogReader);
                thread.start();
            } else {
                blogReader.run();
            }
        }
    }
}
