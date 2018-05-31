package abenosan.game.player;

import abenosan.game.util.BaseCharacter;
import abenosan.game.util.Const;
import abenosan.game.util.Dice;

public class Player extends BaseCharacter{
	public static String name = "";
	public static int level = 0;
	public static int hp = 0;
	public static int mp = 0;
	public static int exp = 1;


	public  Player(){
		name = Const.Player_Name;
		level = 1;
		hp = 100;
		mp = 50;
		exp = 0;
	}

	public int attack(){
		int damage = Dice.dice()+5;
		return  damage;
	}

	public int skillAttack(){
		int a = 0;
		return a;
	}

	public void run(){
		System.out.println(Player.name+"は逃げることに成功した。");
	}
}