package edu.iot.leo.interfaceWeapon;

public class Missile implements Weapon {
	
	public int power() {
		int power = 30;
		return power;
	}
	@Override
	public void attack() {
		System.out.println("�̻��Ϸ� ����!@");
	}
}