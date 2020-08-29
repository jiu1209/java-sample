package sample;
import java.util.ArrayList;


public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	 //リストの勉強
	 //ArrayListクラスで遅い場合はLinkedListクラスを使う
      ArrayList<String> names = new ArrayList<>();
      // 変数の宣言とnamesにインスタンスの作成して代入

      names.add("修一");
      names.add("正敏");
      // addメソッドで要素のy＼追加ができる

      System.out.println(names);

      names.add(1,"武");
      // 指定したインデックスに配置する

      System.out.println(names);

      names.remove(0);
      // removeメソッドで要素の削除

      System.out.println(names);

      String name = names.get(1);
      // nameにgetメソッドでnamesの中の1の要素を参照
      // 参照するだけなので、namesは変更されない

      System.out.println(name);

      names.set(1,"古矢");
      //setメソッドで1の要素を古矢に変更した

      System.out.println(names);


	}
}
