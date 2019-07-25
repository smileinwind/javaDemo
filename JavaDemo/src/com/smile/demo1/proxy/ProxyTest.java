package com.smile.demo1.proxy;

import com.smile.demo1.entity.Animal;
import com.smile.demo1.entity.Move;
import com.smile.demo1.entity.Smart;
import com.smile.demo1.entity.SmartImpl;
/***
 * 
 * @author smileinwind
 *	java动态代理测试
 */
public class ProxyTest {

	public ProxyTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]){
		Move realObj=new Animal();
		ProxyClient<Move> proxyClient=new ProxyClient<Move>();
		proxyClient.doproxy(realObj).move();
		Smart realObj1=new SmartImpl();
		ProxyClient<Smart> proxyClient1=new ProxyClient<Smart>();
		Smart proxy=proxyClient1.doproxy(realObj1);
		proxy.move();
		proxy.think();
	
	}

}
