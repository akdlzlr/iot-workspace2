package edu.iot.leo.interfaceWeapon3;

public class Robot implements Unit{
//	유닛 체력 선언
	protected int hp;
	
//	유닛 생성자
	public Robot(int hp) {
		super();
		this.hp = hp;
	}
//	유닛 체력 getter,setter 메서드 
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
//	------------------------------------------------------------------------
//	공격 및 수리..
	public void Attack(Weapon weapon,Unit unit) {
		if(hp>=0) {
			weapon.attack();
			unit.damege(weapon.power());
		}
	}

	@Override
	public void damege(int loss) {
		hp-=loss;
		if(hp<=0) {
			System.out.println("공격 대상이 파괴 되었습니다.");
			System.out.println();
			hp=0;
		}else {
			System.out.println("남은 hp : "+hp);
			System.out.println();
		}
	}
	
	public void repair(int hp) {
		if(this.hp>0) {
			this.hp+=hp;
			System.out.println(hp+" 만큼 치료 후 hp : "+this.hp);
		}else {
			System.out.println("파괴되어 수리가 불가능합니다.");
			System.out.println();
		}
	}
}