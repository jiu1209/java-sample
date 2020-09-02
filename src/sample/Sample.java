package sample;
import java.util.HashMap;


public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	// マップはキーと呼ばれる情報と一緒の管理するコレクション。

    HashMap <String, String> names = new HashMap<>();
    // namesにインスタンスを代入。
    // 一つ目のStringがキー、2つめのStringが要素

      names.put("男性1","しゅういち");
      names.put("男性2","しゅう");
      names.put("女性1","まゆ");
      names.put("女性2","みみ");
      // リストやセットと違いputメソッドで要素の追加

      System.out.println(names);

      String oldName = names.put("女性1", "マングース");
      // すでに存在しているキーでputすると新しい要素に置き換わる
      // 古い要素がoldNameに参照され返り値になる

      System.out.println(names);
      System.out.println(oldName);

      names.remove("男性1");
      // リストとセットと同じくremoveメソッドで削除する
      // 違うところは引数に要素ではなくキーを記述する

      System.out.println(names);

      names.put("男性2","雷");

      String name = names.get("男性2");
      // リストと同じくgetメソッドで要素の取得
      // キーを引数に指定する

      System.out.println(name);
  	}
}
