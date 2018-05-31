package abenosan.game.monster;

import abenosan.game.monsterList.Slime;
import abenosan.game.util.BaseCharacter;

public class Monster {
	public void monsterList(){
		BaseCharacter monster = null;

		switch((int)(Math.random()*1)){
		case 1:
			monster = (BaseCharacter)new Slime();
			break;
		}
	}
}
