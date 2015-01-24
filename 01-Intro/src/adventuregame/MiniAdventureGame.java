package adventuregame;

import adventuregame.behaviours.AxeBehaviour;
import adventuregame.behaviours.BowAndArrowBehaviour;
import adventuregame.behaviours.KnifeBehaviour;
import adventuregame.behaviours.SwordBehaviour;
import adventuregame.characters.Character;
import adventuregame.characters.King;
import adventuregame.characters.Knight;
import adventuregame.characters.Queen;
import adventuregame.characters.Troll;

public class MiniAdventureGame {

	public static void main(String[] args) {
		Character character = new Queen();
		character.setWeapon(new KnifeBehaviour());
		character.fight();
		
		character = new King();
		character.setWeapon(new BowAndArrowBehaviour());
		character.fight();
		
		character = new Knight();
		character.setWeapon(new SwordBehaviour());
		character.fight();
		
		character = new Troll();
		character.setWeapon(new AxeBehaviour());
		character.fight();

	}

}
