package Clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PDM11726 {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    void run() throws IOException {
        int num = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2));

        int result = find(num, arr);

        System.out.println(result);
    }

    int find(int n, ArrayList<Integer> arr){
        int number = 2;
        while (true){
            if(n < 3){
                return arr.get(n-1);
            }
            number++;
            arr.add((arr.get(number - 2) + arr.get(number - 3))%10007);
            if(number == n){
                return arr.get(number-1);
            }
        }
    }

    public static void main(String[] args) {
        PDM11726 my = new PDM11726();
        try{
            my.run();
        }catch(Exception e){}
    }
}

