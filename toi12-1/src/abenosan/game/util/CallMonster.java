package abenosan.game.util;

import abenosan.game.monsterList.Bob;
import abenosan.game.monsterList.Lion;
import abenosan.game.monsterList.Lnoss;
import abenosan.game.monsterList.Slime;



public class CallMonster {
	public BaseCharacter monster = null;

	public BaseCharacter getMonster(){
	switch((int)(Math.random()*4)){
		case 1:
			monster = new Slime();
			break;
		case 2:
			monster = new Lnoss();
			break;
		case 3:
			monster = new Bob();
			break;
		case 4:
			monster = new Lion();
			break;
		default:
			monster = new Slime();
			break;
		}
		return monster;
		}

	}
