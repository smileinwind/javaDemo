package com.smile.demo1.entity;

public class Animal implements Move {
	String move=":我是爬行动物，我靠爬";

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+move);
		return move;
	}
	

}
