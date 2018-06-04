package abenosan.game.util;

import abenosan.game.player.Player;

public class LevelUpSystem{
	public static void getLevelUp(){
		int m_exp = Player.level *10;
		while(Player.exp > m_exp ){
			m_exp *=1.2;
			Player.level ++;
			System.out.println("[ " + Player.name + " ] は [" + Player.level + " ] レベルになった。");
			System.out.println("攻撃力:"+Player.attack+ "→" + (Player.attack += Dice.dice()));
			if((m_exp - Player.exp)>0)
			System.out.println("次のLvまで残り:"+(m_exp - Player.exp)+"exp");
		};
	}
}
