package abenosan.game.util;

import abenosan.game.player.Player;

public class LevelUpSystem{
	public static int m_exp = Player.level + 50;
	public static void getLevelUp(){

		while(Player.exp > m_exp && Player.level <= 99 ){			/* プレイヤーLvが99以下ならば実行 */
			m_exp *=1.2;											/* Lvが上がるごとに経験値を1.2倍にする */
			Player.level ++;
			System.out.println("[ " + Player.name + " ] は [" + Player.level + " ] レベルになった。");
			System.out.println("HP："+Player.hp + "→" + (Player.hp += Dice.dice()));			/* Playerの攻撃力を増加 */
			System.out.println("攻撃力:"+Player.attack+ "→" + (Player.attack += Dice.dice()));	/* PlayerのHPを増加 */
			if((m_exp - Player.exp)>0)
			System.out.println("次のLvまで残り:"+(m_exp - Player.exp)+"exp");
		}
			System.out.println("次のLvまで残り:"+(m_exp - Player.exp)+"exp");
	}
}
