package edu.iot.leo.interfaceWeapon3;

public class Sword implements Weapon {

	public int power() {
		int power = 10;
		return power;
	}
	
	@Override
	public void attack() {
		System.out.println("Į�� ����!!!!");
	}
}