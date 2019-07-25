package com.smile.demo1.entity;

public class SmartImpl implements Smart {

	public SmartImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+": Smart move");
		return "Smart move";
	}

	@Override
	public String think() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+ ": Smart think");
		return "Smart think";
	}

}
