import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());

        int maxA = A;
        int minA = A / N;
        int maxB = B;
        int minB = B / N;
        if (B % N != 0){
            minB += 1;
        }

        if ( maxA > minB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        reader.close();
    }
}
