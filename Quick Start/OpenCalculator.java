import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> FirstSet = new HashSet<Integer>();
        HashSet<Integer> SecondSet = new HashSet<Integer>();

        String[] parts = reader.readLine().split(" ");
        for (int i = 0; i < parts.length; i++){
            int num = Integer.parseInt(parts[i]);
            FirstSet.add(num);
        }

        int num = Integer.parseInt(reader.readLine());
        int sum = 0;
        
        while (num != 0){
        SecondSet.add(num % 10);
        num /= 10;
        }

        if(FirstSet.contains(SecondSet)){
            writer.write("0");
        }
        else{
            for(Integer i : SecondSet){
                if(FirstSet.contains(i) == false){
                    sum +=1;
                }
            }
             writer.write(String.valueOf(sum));
        }
        
        

        reader.close();
        writer.close();
    }

}
