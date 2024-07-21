import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
//доделать
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(reader.readerLine());
        String[] parts = redaer.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> Firstpart = new ArrayList<>();
        ArrayList<Integer> Secondpart = new ArrayList<>();
        

        //поменяли тип массива 
        for (String s: parts){
            Int number = Integer.parseInt(s);
            list.add(number);
        }

        for(int i = 0; i < list.size(); i++){
            if ((List[i].size() - i) %  2  == 0){
                ArrayList inputA = list.subList(i , list.size()/2);
                ArrayList inputB = list.subList(list.size()/2 + 1, list.size());
                
                
            }
                        
        }

        reader.close();
        writer.close();
    }

}
