package abenosan.game.combat;

import java.util.Scanner;

import abenosan.game.player.Player;
import abenosan.game.util.BaseCharacter;
import abenosan.game.util.CallMonster;
import abenosan.game.util.Dice;
import abenosan.game.util.LevelUpSystem;

public class Combat{
	/**
	 * 戦闘メソッド
	 */
	public static void combat(){
		BaseCharacter monster = (new CallMonster().getMonster());
		Dice point = new Dice();
		int point1;
		int frg = 0;		/* 逃げる判断 */
		System.out.println("┏━━━━━━━モンスター出現━━━━━━┓");
		System.out.printf("┃[ モンスター名]:%8s    ┃\n",monster.name);
		System.out.printf("┃[ Level ]  :   %2d      ┃\n",monster.level);
		System.out.printf("┃[ HP/MP ]  :%3d / %-3d  ┃\n",monster.hp , monster.mp);
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━┛");

		while(Player.hp > 0 && monster.hp  > 0 && frg == 0){	// PlayerとMonsterのHPがあれば戦闘開始
			System.out.println("-----------------------------------------------");
			System.out.println("[1]:攻撃     [2]:回復     [3]:逃げる     [4]:ステータスの確認");
			System.out.println("-----------------------------------------------");
			System.out.println("");
			switch(new Scanner(System.in).nextInt()){					// actionの選択
			case 1:
				monster.hp = monster.hp - Player.attack(); ;
				if(monster.hp >= 0){
					if(Dice.dice() < 5 ){
						int m_damage = monster.attack();
						Player.hp = Player.hp - m_damage;
						System.out.println(" [ "+monster.name + " ] が [ " + Player.name +" ] に [ " + m_damage + "] のダメージを与えた。");
					}
					if(Player.hp >= 1) {
						System.out.println("┏━━━━━━━━━戦闘中━━━━━━━┓");
						System.out.printf("┃[モンスター名]:%8s┃\n",monster.name);
						System.out.printf("┃[ Level ] :   %2d    ┃\n",monster.level);
						System.out.printf("┃[ HP/MP ] :%3d / %-3d┃\n",monster.hp , monster.mp);
						System.out.println("[ "+Player.name + " ] が [ " + monster.name + " ] に ["+ Player.attack()+"] のダメージを与えた。" );
						System.out.printf("┃[ 名前 ]    :%8s ┃\n" , Player.name);
						System.out.printf("┃[ Level ]  :   %2d    ┃\n" , Player.level );
						System.out.printf("┃[ HP/MP ]  :%3d / %-3d┃\n" , Player.hp , Player.mp);
						System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");}
				}
				break;
			case 2:
				Player.drug();			/* 薬草を使い回復をする */
				break;
			case 3:
				Player.run();			/* 戦闘から逃げる */
				frg = 1;
				break;
			case 4:
				Player.status();		/* Playerのstatus確認 */
				break;
			default:
				System.out.println("番号を選択し直してください。");
				break;
			}
		}
		if(monster.hp <= 0){
			System.out.println("--------------------------");
			System.out.println("[" + Player.name+ "]は["+monster.name+"]を倒すことができた！");
			System.out.println("【" + monster.exp + " 】 expを獲得した。");
			Player.exp += monster.exp;			/* モンスターの経験値を獲得 */
			LevelUpSystem.getLevelUp();			/* Level Up 処理*/
			System.out.println("--------------------------");
		}

	}
}
