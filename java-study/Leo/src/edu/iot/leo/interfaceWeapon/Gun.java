package edu.iot.leo.interfaceWeapon;

public class Gun implements Weapon {

	public int power() {
		int power = 30;
		return power;
	}
	
	@Override
	public void attack() {
		System.out.println("���߻���!! ��������!!");
	}
}