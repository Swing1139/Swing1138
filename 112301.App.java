package pac;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner xel=new Scanner(System.in);
	 while (true){
         int x = (int) (Math.random() * 100);
         int y = (int) (Math.random() * 100);
         System.out.println("请输入一个数字：");
         int i = xel.nextInt();
         if (i==1){
             System.out.println("x坐标"+x+" "+"y坐标"+y);
         }
	 }
}
}
