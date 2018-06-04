package abenosan.game.player;


import abenosan.game.util.Const;
import abenosan.game.util.Dice;

public class Player{
	public static String name = Const.Player_Name;
	public static int level = 1;
	public static int hp = 100;
	public static int mp = 100;
	public static int exp = 0;
	public static int attack = 0;
	public static int drug = 3;

	public  static  int attack(){
		int damage = Dice.dice()+attack;
		return  damage;
	}

	public int skillAttack(){
		int a = 0;
		return a;
	}

	public static void run(){
		System.out.println(Player.name+"は逃げることに成功した。");
	}
}