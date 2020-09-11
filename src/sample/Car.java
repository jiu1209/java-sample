package sample;

import java.util.HashMap;

public class Car {


     int speed;

     void speedUp(int value) {
    	 this.speed += value;
     }
     void speedDown(int value) {
    	 this.speed -= value;
     }
     public static void main(String[] args) {
     HashMap <String, String> frutis = new HashMap<>();

     frutis.put("緑色","スイカ");
     frutis.put("オレンジ色","みかん");


     System.out.println(frutis);
   }
}