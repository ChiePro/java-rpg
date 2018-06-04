package abenosan.game;

import java.util.Scanner;

import abenosan.game.player.Player;
import abenosan.game.util.Dice;
import abenosan.game.util.NextRun;
import abenosan.game.util.OperationGame;
/**
 *
 *
 * --ゲームの説明--
 * 	サイコロを振り、ゴールの100ﾏｽまで目指すゲームです。
 * 	主人公にはHPがあり、0になるとGAME OVERです。
 *
 * */
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		OperationGame.setPlayerName();		/* PlayerNameの選択 */
		int mass = 0;
		System.out.println("1:GAMEをはじめる 2:GAMEを終了する");
		if(sc.nextLine().equals("1")){
			while(mass < 100){
				while(Player.hp > 0 ){					/* mass が 100以上になったらゲーム終了 */
					System.out.println("[1] を入力してサイコロを振ってください。");
					if(sc.nextLine().equals("1")){
						switch(Dice.diceMini()){
						case 1:
							mass = NextRun.mass_1();	/* 戦闘メソッド */
							break;
						case 2:
							mass = NextRun.mass_2();	/* マス進むメソッド */
							break;
						case 3:
							mass = NextRun.mass_3();	/* マス進むメソッド */
							break;
						case 4:
							mass = NextRun.mass_4();	/* マス進むメソッド */
							break;
						case 5:
							mass = NextRun.mass_5();	/* マス進むメソッド */
							break;
						case 6:
							mass = NextRun.mass_6();	/* マス進むメソッド */
							break;
						}
					}
					System.out.println("GAME OVERを終了する");
					break;
				}
				System.out.println("ゴールにたどり着けることができた。");
				}
			}
		}
	}





