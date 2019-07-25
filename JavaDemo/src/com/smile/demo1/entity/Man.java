package com.smile.demo1.entity;

public class Man extends Animal  {
	public String walk="人学会了走路！";
	public String move="人 不用爬。";
	public String think="有思想的！";
	//覆盖父类同名方法
	@Override
	public String move() {
		// TODO Auto-generated method stub
		//System.out.println(this.getClass().getSimpleName()+super.move()+" man too");
		System.out.println(this.getClass().getSimpleName()+":"+move+walk);
		return " man too";
	}

}
