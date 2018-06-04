package abenosan.game.combat;

import java.util.Scanner;

import abenosan.game.player.Player;
import abenosan.game.util.BaseCharacter;
import abenosan.game.util.CallMonster;
import abenosan.game.util.Dice;
import abenosan.game.util.LevelUpSystem;

public class Combat{
	// 戦闘メソッド

	public static void combat(){
		BaseCharacter monster = (new CallMonster().getMonster());
		Dice point = new Dice();
		int point1;
		boolean check = true;
		System.out.println("┏━━━━━━━モンスター出現━━━━━━┓");
		System.out.printf("┃[ モンスター名]:%8s    ┃\n",monster.name);
		System.out.printf("┃[ Level ]  :   %2d      ┃\n",monster.level);
		System.out.printf("┃[ HP/MP ]  :%3d / %-3d  ┃\n",monster.hp , monster.mp);
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━┛");

		while(Player.hp > 0 && monster.hp  > 0){	// PlayerとMonsterのHPがあれば戦闘開始
			int attack = Player.attack();
			System.out.println("選択してください。");
			System.out.println("1:攻撃 2:回復 3:逃げる");
			System.out.println("--------------------------");
			System.out.println("");
			switch(new Scanner(System.in).next()){					// actionの選択
			case "1":
				System.out.println("[ "+Player.name + " ] が [ " + monster.name + " ] に ["+ attack +"] のダメージを与えた。" );
				monster.hp = monster.hp - attack ;
				if(monster.hp > 0){
					System.out.println("┏━━━━━━━━━戦闘中━━━━━━━┓");
					System.out.printf("┃[モンスター名]:%8s┃\n",monster.name);
					System.out.printf("┃[ Level ] :   %2d    ┃\n",monster.level);
					System.out.printf("┃[ HP/MP ] :%3d / %-3d┃\n",monster.hp , monster.mp);
					System.out.println("┣━━━━━━━━━━━VS━━━━━━━━┫");
					System.out.printf("┃[ 名前 ]    :%8s ┃\n" , Player.name);
					System.out.printf("┃[ Level ]  :   %2d    ┃\n" , Player.level );
					System.out.printf("┃[ HP/MP ]  :%3d / %-3d┃\n" , Player.hp , Player.mp);
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");}
				break;
			case "2":
				if(Player.hp+20 <= 100){
					Player.hp = Player.hp + 20 ;
					Player.drug -=1;
				System.out.println(" [ " + Player.name + " ] は薬草を1つ使い20回復した");
				System.out.println("残り薬草:"+Player.drug);
				}
				break;
			case "3":
				Player.run();
				monster.hp = -1;
				check = false;
				break;
			default:
				System.out.println("番号を選択し直してください。");
				break;

			}
			if(Dice.dice() < 5 && check){
				int m_damage = monster.attack();
				System.out.println(" [ "+monster.name + " ] が [ " + Player.name +" ] に [ " + m_damage + "] のダメージを与えた。");
				Player.hp = Player.hp - m_damage;

			}

		}
		if(monster.hp <= 0){
			System.out.println("[" + Player.name+ "]は["+monster.name+"]を倒すことができた！");
			System.out.println("[" + monster.exp + "] expを獲得した。");
			Player.exp += monster.exp;
			LevelUpSystem.getLevelUp();
		}

	}
}
