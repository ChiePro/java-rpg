package abenosan.game.util;

import abenosan.game.monsterList.Shine;
import abenosan.game.monsterList.Slime;


public class CallMonster {
	public BaseCharacter monster = null;

	public BaseCharacter getMonster(){
	switch((int)(Math.random()*10)){
		case 1:
			monster = new Slime();
			break;
		case 2:
			monster = new Shine();
			break;
		default:
			monster = new Slime();
			break;
		}
		return monster;
		}

	}
