package sample;

public class Car {
	int speed;
	//スピードを保持するメソッド

	void speedUp(int value) {
		this.speed += value;
	}
	//スピードを上げるメソッド

	void speedDown(int value) {
		this.speed -= value;
	}
	//スピードを下げるメソッド
	 public static void main(String[] args){
		 Car car1 = new Car();
		 Car car2 = new Car();
		 //フィールドの代入とcarクラスのインスタンスを作成

		 car1.speedUp(10);
		 car2.speedUp(20);


		 System.out.println("スピード:" + car1.speed);
		 System.out.println("スピード:" + car2.speed);
		//フィールドの値を参照する

		 int newSpeed = 80;
		 car1.speedUp(newSpeed);

		 System.out.println(newSpeed);
	 }
}