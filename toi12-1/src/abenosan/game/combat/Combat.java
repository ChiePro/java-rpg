package abenosan.game.combat;

import java.util.Scanner;

import abenosan.game.monster.Monster;
import abenosan.game.monster.Player;
import abenosan.game.util.Dice;

public class Combat {
	// 戦闘メソッド
	public static void combat(){
		Player player = new Player();
		Monster monster = new Monster();
		Dice point = new Dice();
		int point1;
		boolean check = true;
		System.out.println("--------------------------");
		System.out.println("[モンスター名]:"+ monster.hp );
		System.out.println("[ Level ]     :"+ monster.level );
		System.out.println("[ HP / MP ]   :"+ monster.hp +"/"+monster.mp);
		System.out.println("--------------------------");

		while(player.hp > 0 && monster.hp  > 0){	// PlayerとMonsterのHPがあれば戦闘開始
			int attack = player.attack();
			System.out.println("選択してください。");
			System.out.println("1:攻撃 2:回復 3:逃げる");
			System.out.println("--------------------------");
			System.out.println("");

			switch(new Scanner(System.in).next()){					// actionの選択
			case "1":
				System.out.println("[ "+player.name + " ] が [ " + monster.name + " ] に ["+ attack +"] のダメージを与えた。" );
				monster.hp = monster.hp - attack ;
				System.out.println("---------戦闘中----------");
				System.out.println("[モンスター名]:"+ monster.name );
				System.out.println("[ Level ]     :"+ monster.level );
				System.out.println("[ HP / MP ]   :"+ monster.hp +"/"+monster.mp);
				System.out.println("----------ＶＳ-----------");
				System.out.println("[ 名前 ]   :" + player.name );
				System.out.println("[ Level ]  :" + player.level );
				System.out.println("[ HP/MP ]  :" + player.hp + "/" + player.mp);
				System.out.println("--------------------------");
				break;
			case "2":
				System.out.println(" [ " + player.name + " ] は [" + attack  + "] 回復をした");
				player.hp = player.hp + attack ;;
				break;
			case "3":
				player.run();
				monster.hp = -1;
				check = false;
				break;
			default:
				System.out.println("番号を選択し直してください。");
				break;

			}
			if(Dice.dice() < 5 && check){
				point1 = point.dice();
				System.out.println(" [ "+monster.name + " ] が [ " + player.name +" ] に [" + point1 + "] のダメージを与えた。");
				player.hp = player.hp - point1;

			}

		}
		if(monster.hp == 0){
			System.out.println(monster.name+"を倒すことができた！");
		}
	}
}
