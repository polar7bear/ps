import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        FileExtensionCounter counter = new FileExtensionCounter();
        insertData(counter, Integer.parseInt(br.readLine()));
        counter.printResults();
    }

    static void insertData(FileExtensionCounter counter, int n) throws IOException {
        while (n-- > 0) {
            String extension = getExtensionByPeriod(br.readLine());
            counter.countFileExtension(extension);
        }
    }

    static String getExtensionByPeriod(String fileName) {
        return fileName.substring(fileName.lastIndexOf('.') + 1);
    }

    static class FileExtensionCounter {
        Map<String, Integer> files = new TreeMap<>();

        void countFileExtension(String extension) {
            files.compute(extension, (k, v) -> v == null ? 1 : v + 1);
        }

        void printResults() {
            for (String key : files.keySet()) {
                System.out.println(key + " " + files.get(key));
            }
        }
    }
}
