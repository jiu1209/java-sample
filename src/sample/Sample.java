package sample;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	  Calendar  calendar  = Calendar.getInstance();
	  // Calendarクラスのインスタンス作成

      System.out.println(calendar.getTime());
      // get.TimeでDateクラスのインスタンス作成

      calendar.set(1234, 4 ,6);
      // setメソッドで、日付の指定
      System.out.println(calendar.getTime());

      calendar.clear();
      // 時分秒をセットしている

      calendar.set(1234, 4 ,6 ,23 , 11,10);

      System.out.println(calendar.getTime());

      int year = calendar.get(Calendar.YEAR);
      // get(Calendar.YEAR)で年を取得した
      // yearに参照した

      System.out.println(year);

      calendar.set(Calendar.YEAR, 2020);
      // setはフィールドの変更も可能

      System.out.println(calendar.getTime());

      calendar.add(Calendar.DAY_OF_YEAR, 3);
      // addメソッドは計算ができる +は足す

      calendar.add(Calendar.YEAR, -3);
      // -は引き算ができる

      System.out.println(calendar.getTime());

      SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      // SimpleDateFormatクラスのインスタンス作成

      String formatteDate = format.format(calendar.getTime());
      // dateクラスを文字列に変換

      System.out.println(formatteDate);
	}
}
