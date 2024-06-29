import java.io.*;
import java.util.*;

public class Judge {

    //your code here
    public static void solve(Scanner scanner, PrintWriter out) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        out.print(n);
        out.println(m);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\git_ms\\java-judge\\java-judge\\files\\input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("C:\\git_ms\\java-judge\\java-judge\\files\\output.txt"));

        int t = 1;
        // Uncomment the next line for multiple test cases
         t = scanner.nextInt();

        while (t-- > 0) {
            long startTime = System.currentTimeMillis();

            solve(scanner, out);

            long endTime = System.currentTimeMillis();
            System.err.println("Run Time : " + (endTime - startTime) / 1000.0 + "s | " + (endTime - startTime) + "ms");
        }

        out.flush();
        out.close();
        scanner.close();
    }
}

