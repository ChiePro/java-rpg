package abenosan.game.monsterList;

import abenosan.game.util.BaseCharacter;
import abenosan.game.util.Dice;

public class Bob extends BaseCharacter {
	public Bob(){
		name = "ボブ";  /* 名前 */
		level = 12;			/* Level */
		hp = 57;			/* HP数値 */
		mp = 32;				/* MP数値 */
		exp = 30;			/* 経験値 */
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
