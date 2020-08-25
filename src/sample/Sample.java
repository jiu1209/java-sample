package sample;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	  double[] peopol_Height = new double[5];
	    peopol_Height[0] = 175.2;
	    peopol_Height[1] = 172.5;
	    peopol_Height[2] = 170.5;
	    peopol_Height[3] = 168.5;
	    peopol_Height[4] = 170.0;

	  for (int i = 0; i < peopol_Height.length; i++) {
		System.out.println(peopol_Height[i]);
	  }

	  String[] singo = {"赤","黄","青"};
	    System.out.println(singo[0]);
	    System.out.println(singo[1]);
	    System.out.println(singo[2]);

	  int b = 10;

	  if (b > 20) {
		  System.out.println("bは20より大きい");
	  } else if (b == 20) {
		  System.out.println("bと20は等しい");
	  } else {
		  System.out.println("bは20より小さい");
	  }

	  for (int c = 0; c < 5; c++) {
		  if (c == 3) {
			  break;
		  }
		System.out.println(c);
	  }
	   System.out.println("プログラムの終了");

	   for (int c = 0; c < 5; c++) {
			  if (c == 3) {
				  continue;
			  }
			System.out.println(c);
		  }
		   System.out.println("プログラムの終了");
   }
}
