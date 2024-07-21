import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int max_interval = 2000, close_number = 0;
        
        int n = Integer.parseInt(reader.readLine());
        String[] parts = reader.readLine().split(" ");
        int aim = Integer.parseInt(reader.readLine());
        
        for(String s: parts){
            int num = Integer.parseInt(s);
            if(Math.abs(aim - num) <= max_interval){
                max_interval = Math.abs(aim - num);
                close_number = num;
                
            }
        }

        writer.write(String.valueOf(close_number));

        reader.close();
        writer.close();
    }

}
