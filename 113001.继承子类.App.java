public class App {
public static void main(String[] args) {
	R r = new R();
    System.out.println(r.boy_filePathString);
    System.out.println(r.girl_filePathString);
    for (int i=0;i<r.arry2d.length;i++){
        for (int j=0;j<r.arry2d[i].length;j++){
            System.out.print(r.arry2d[i][j]+" ");
        }
        System.out.println();
    }
}
}
