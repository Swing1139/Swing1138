package pac;

public class App {
public static void main(String[] args) throws InterruptedException {
	 int arr[][]={
			 {7,9},
			 {300,500},
			 {999,666},
			 {5,6},
	 };
	 while (true) {
		Thread.sleep(1000);
		System.out.println("一秒已经过去了");
		int rdm=(int)(Math.random()*10%4);
		System.out.println(arr[rdm][0]+","+arr[rdm][1]);
	}
         }
	 }
