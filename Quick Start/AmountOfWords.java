import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<String> set = new HashSet<String>();

        String hehe = reader.lines().collect(Collectors.joining("\n"));
        String[] LinesFromStream = hehe.split("\n");
        for(String s :LinesFromStream){
            String[] parts = s.split(" ");
            for(String k : parts){
                if (k.length() != 0){set.add(k);}  
            }
        }
        
        writer.write(String.valueOf(set.size()));

        reader.close();
        writer.close();
    }

}
