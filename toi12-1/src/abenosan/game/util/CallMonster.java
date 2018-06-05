package abenosan.game.util;

import abenosan.game.monsterList.Bob;
import abenosan.game.monsterList.Cat;
import abenosan.game.monsterList.Dars;
import abenosan.game.monsterList.Java;
import abenosan.game.monsterList.Lion;
import abenosan.game.monsterList.Lnoss;
import abenosan.game.monsterList.Slime;
import abenosan.game.monsterList.Zombie;

public class CallMonster {
	public BaseCharacter monster = null;
/**
 *
 * 乱数を使って、ランダムにMonsterを呼び出す
 *
 */
	public BaseCharacter getMonster(){
		switch((int)(Math.random()*8)){
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
		case 5:
			monster = new Cat();
			break;
		case 6:
			monster = new Zombie();
			break;
		case 7:
			monster = new Dars();
			break;
		case 8:
			monster = new Java();
			break;
		default:
			monster = new Slime();
			break;
		}
		return monster;
	}
}