package Clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PDM11721 {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    void run() throws IOException{
        String str = bf.readLine();
        for(int i=0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        PDM11721 my = new PDM11721();
        try {
            my.run();
        }catch(Exception e){}
    }
}
