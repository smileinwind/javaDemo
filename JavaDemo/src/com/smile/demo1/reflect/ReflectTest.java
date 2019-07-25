package com.smile.demo1.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.smile.demo1.entity.ReflectMan;

/***
 * 
 * @author smileinwind
 *	java 反射测试
 */
public class ReflectTest {

	public ReflectTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获得类完整的名字
		Class rclass=ReflectMan.class;
		String className = ReflectMan.class.getName();
		System.out.println(className);
		        
		//获得类的public类型的属性。
		Field[] fields = rclass.getFields();
		for(Field field : fields){
		   System.out.println(field.getName());//Name
		}
		        
		//获得类的所有属性。包括私有的
		Field [] allFields = rclass.getDeclaredFields();
		for(Field field : allFields){
		    System.out.println(field.getName());//NickName Name 
		}
		        
		//获得类的public类型的方法。这里包括 Object 类的一些方法
		Method [] methods = rclass.getMethods();
		for(Method method : methods){
		    System.out.println(method.getName());//work wait equals toString hashCode等
		}
		        
		//获得类的所有方法。
		Method [] allMethods = rclass.getDeclaredMethods();
		for(Method method : allMethods){
		    System.out.println(method.getName());//work say
		}
		try{        
		//获得指定的私有属性
		Field f1 = rclass.getDeclaredField("NickName");
		//启用和禁用访问安全检查的开关，值为 true，则表示反射的对象在使用时应该取消 java 语言的访问检查；反之不取消
		f1.setAccessible(true);
		System.out.println(f1);
		//获得指定的属性 
		Field f2 = rclass.getField("Name");		
		System.out.println(f2);
		                
		//创建这个类的一个对象
		Object obj =  rclass.newInstance();
		//将 p2 对象的  f2 属性赋值为 Bob，f2 属性即为 私有属性 NickName
		f1.set(obj,"小小");
		//使用反射机制可以打破封装性，导致了java对象的属性不安全。 
		System.out.println(f1.get(obj)); //小小
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		        
		//获取构造方法
		Constructor [] constructors = rclass.getConstructors();
		for(Constructor constructor : constructors){
		    System.out.println(constructor.toString());//public com.ys.reflex.Person()
		}

	}

}
