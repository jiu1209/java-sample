package sample;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 1;
		int i = 0;

	    do {
	    	System.out.println(x + "を足します");
	        i = i + x;
	        x++;

	    } while (i < 10 );
	    System.out.println("合計は" + i + "です");
   }
}
