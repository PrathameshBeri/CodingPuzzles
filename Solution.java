import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {

                int len = container[0].length;

                Long[] balls = new Long[len];
                Long[] cont = new Long[len];

                for(int i = 0; i < len; i++){
                    long sum = 0;
                    for(int j = 0; j < len; j++){

                        sum += container[i][j];
                    }

                    cont[i] = sum;
                }

                 for(int i = 0; i < len; i++){
                    long sum = 0;
                    for(int j = 0; j < len; j++){

                        sum += container[j][i];
                    }

                    balls[i] = sum;
                }
        List<Long> sortedBalls = Arrays.asList(balls).stream().sorted().collect                                                                      (Collectors.toList());
        List<Long> sortedContainer = Arrays.asList(cont).stream().sorted().collect                                                                      (Collectors.toList());
        boolean flag = true;
        for(int i = 0; i < sortedBalls.size(); i++){

            Long a = sortedBalls.get(i);
            Long b = sortedContainer.get(i);

            
                if(!(a.equals(b))){
                    flag = false;
                    break;
                }

        }

        if(flag){
            return("Possible");
        }else{
            return("Impossible");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
