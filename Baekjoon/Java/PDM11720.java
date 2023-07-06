package Clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PDM11720 {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    void run() throws IOException{
        Long result = 0L;
        int num = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        for(int i=0; i < str.length(); i++){
            result += Long.parseLong(String.valueOf(str.charAt(i)));
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        PDM11720 my = new PDM11720();
        try {
            my.run();
        }catch(Exception e){}
    }
}
