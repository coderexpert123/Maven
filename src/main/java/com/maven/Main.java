package com.maven;
public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc");
			System.out.print("Driver Loaded !");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
