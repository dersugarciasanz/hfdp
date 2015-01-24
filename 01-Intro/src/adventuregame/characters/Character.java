package adventuregame.characters;

import adventuregame.behaviours.WeaponBehaviour;

public abstract class Character {
	
	protected WeaponBehaviour weapon;
	
	public Character() {
		
	}
	
	public void setWeapon(WeaponBehaviour w) {
		weapon = w;
	}
	
	public void fight() {
		display();
		weapon.useWeapon();
	}

	public abstract void display();

}
