package abenosan.game.player;


import abenosan.game.util.Const;
import abenosan.game.util.Dice;

public class Player{
	public static String name = Const.Player_Name;
	public static int level = 1;
	public static int hp = 100;
	public static int mp = 100;
	public static int exp = 0;
	public static int attack = 1;
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
	public static void status() {
		System.out.println("┏━━━━━━━━Status━━━━━━━┓");
		System.out.printf("┃[ 名前 ]    :%8s ┃\n" , Player.name);
		System.out.printf("┃[ Level ]  :   %2d    ┃\n" , Player.level );
		System.out.printf("┃[ HP/MP ]  :%3d / %-3d┃\n" , Player.hp , Player.mp);
		System.out.printf("┃[ 薬草 ]    :   %2d    ┃\n", Player.drug);
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");
	}

	public static void drug() {
		if(Player.hp+20 <= 100 && Player.drug >= 1){
			Player.hp = Player.hp + 20 ;
			Player.drug -=1;
			System.out.println(" [ " + Player.name + " ] は薬草を1つ使い20回復した");
			System.out.println("残り薬草:"+Player.drug);
		}else{
			System.out.println("これ以上回復できません");
		}
	}
}