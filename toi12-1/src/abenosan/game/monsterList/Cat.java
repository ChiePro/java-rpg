package abenosan.game.monsterList;

import abenosan.game.util.BaseCharacter;
import abenosan.game.util.Dice;

public class Cat extends BaseCharacter {
	public Cat(){
		name = "猫";  /* 名前 */
		level = 6;			/* Level */
		hp = 4;			/* HP数値 */
		mp = 0;				/* MP数値 */
		exp = 10;			/* 経験値 */
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
