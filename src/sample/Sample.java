package sample;
import java.util.HashSet;


public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	// セットは要素の重複を許さないコレクション。リストのような順番はない

    HashSet <String> names = new HashSet<>();
    // namesにインスタンスを代入

      names.add("修一");
      names.add("マングース");
      // リストと同じでaddメソッドで要素の追加。順番がない。
      // 同じ要素は追加することができない

      System.out.println(names);

      names.remove("修一");
      // リストと同じくremoveメソッドで要素の削除

      System.out.println(names);
	}
}
