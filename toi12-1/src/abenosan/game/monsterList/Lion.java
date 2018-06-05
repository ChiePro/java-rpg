package abenosan.game.monsterList;

import abenosan.game.util.BaseCharacter;
import abenosan.game.util.Dice;

public class Lion extends BaseCharacter {
	public Lion(){
		name = "ライオン";  /* 名前 */
		level = 63;			/* Level */
		hp = 126;			/* HP数値 */
		mp = 999;				/* MP数値 */
		exp = 700;			/* 経験値 */
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
