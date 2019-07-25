package com.smile.demo1.entity;

public class ReflectMan {
	 //私有属性
    private String NickName = "小三";
    //公有属性
    public String Name = "张三";
    //私有方法
    @SuppressWarnings("unused")
	private void say(){
        System.out.println(NickName+" private say()...");
    }
    //公有方法
    public void work(){
        System.out.println(Name+" public work()...");
    }

	
}
