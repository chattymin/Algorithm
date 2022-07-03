package Clear;

import java.util.Scanner;

public class PDM11718 {
    Scanner scan = new Scanner(System.in);

    void run(){
        StringBuilder stringBuilder = new StringBuilder();

        while(scan.hasNext()){
            stringBuilder.append(scan.nextLine()).append("\n");
        }
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {
        PDM11718 my = new PDM11718();
        my.run();
    }
}
