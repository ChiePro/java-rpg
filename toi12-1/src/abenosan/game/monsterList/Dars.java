package abenosan.game.monsterList;

import abenosan.game.util.BaseCharacter;
import abenosan.game.util.Dice;

public class Dars extends BaseCharacter {
	public Dars(){
		name = "ダーツ";  /* 名前 */
		level = 32;			/* Level */
		hp = 50;			/* HP数値 */
		mp = 11;				/* MP数値 */
		exp = 40;			/* 経験値 */
	}

	@Override
	public int attack() {
		int damage = Dice.dice() + this.level;
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
