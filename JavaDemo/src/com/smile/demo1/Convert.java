package com.smile.demo1;

import com.smile.demo1.entity.Animal;
import com.smile.demo1.entity.Man;
import com.smile.demo1.entity.Move;
import com.smile.demo1.entity.SmartImpl;

/***
 * 
 * @author smileinwind java 类型强制转换
 *
 */
public class Convert {

	public Convert() {
		// TODO Auto-generated constructor stub
	}

	/***
	 * 子类父类互转  父类 Animal 子类 Man 
	 */
	public static void main(String[] args) {
		System.out.println("----子类父类互转 ----------");
		// 子类转换为父类
		Man man = new Man();
		Animal animal = null;
		if (man instanceof Animal) {
			System.out.println("人本质上就是动物啊！");
			animal = (Animal)man;
			animal.move();// 被子类move覆盖，执行子类方法，输出 Man:人 不用爬。人会走路！
			// 当父类是子类的实例时，父类可以强制转换为子类
			if (animal instanceof Man) {
				man = (Man) animal;
				System.out.println("这个动物是人啊！" + man.think);				
			}
		}
		// 父类一般不能强制转换为子类
		animal = new Animal();
		if (animal instanceof Man == false) {
			animal.move();
			System.out.println("动物就是动物，不是人！");			
		}

		System.out.println("----以下是类->接口类型-------");
		// 接口实现类转换为接口
		Move move = (Move) new Animal();
		Move move1 = (Move) new Man();
		// Smart smart=new SmartImpl();
		move.move();
		move1.move();
		// System.out.println(smart.walk());
		int i=Integer.MAX_VALUE;
		long l=	Long.MAX_VALUE;
		double d=Double.MAX_VALUE;
		float f=1.0f;
		System.out.println((long)i); //2147483647
		System.out.println((int)l);// -1 损失精度
		System.out.println((float)d);// Infinity 损失精度
	}
}
