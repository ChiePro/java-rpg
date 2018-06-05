package abenosan.game.monsterList;

import abenosan.game.util.BaseCharacter;
import abenosan.game.util.Dice;

public class Java extends BaseCharacter {
	public Java(){
		name = "Java";  /* 名前 */
		level = 99;			/* Level */
		hp = 999;			/* HP数値 */
		mp = 999;				/* MP数値 */
		exp = 99999999;			/* 経験値 */
	}

	@Override
	public int attack() {
		int damage = Dice.dice() + this.exp;
		return damage;
	}

	@Override
	public int skillAttack() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
