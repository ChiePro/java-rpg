package abenosan.game.monsterList;

import abenosan.game.util.BaseCharacter;
import abenosan.game.util.Dice;

public class Zombie extends BaseCharacter {
	public Zombie(){
		name = "ゾンビ";  /* 名前 */
		level = 53;			/* Level */
		hp = 100;			/* HP数値 */
		mp = 500;				/* MP数値 */
		exp = 300;			/* 経験値 */
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
