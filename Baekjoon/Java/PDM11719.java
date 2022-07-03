package Clear;

import java.util.Scanner;

public class PDM11719 {
    Scanner scan = new Scanner(System.in);

    void run(){
        StringBuilder stringBuilder = new StringBuilder();

        while(scan.hasNext()){
            stringBuilder.append(scan.nextLine()).append("\n");
        }
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {
        PDM11719 my = new PDM11719();
        my.run();
    }
}
