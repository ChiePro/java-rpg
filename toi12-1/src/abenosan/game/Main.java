package abenosan.game;

import java.util.Scanner;

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
	public static void main(String[] args) {
		OperationGame.setPlayerName();		/* PlayerNameの選択 */
		int mass = 0;
		System.out.println("1:GAMEをはじめる 2:GAMEを終了する");
		if(new Scanner(System.in).nextInt() == 1){
			while(mass < 100){
				System.out.println("[1] を入力してサイコロを振ってください。");
				if(new Scanner(System.in).nextInt() == 1){
					switch(Dice.diceMini()){
					case 1:
						NextRun.mass_1();	/* 戦闘メソッド */
						mass += 1;
						break;
					case 2:
						NextRun.mass_2();	/* マス進むメソッド */
						mass += 2;
						break;
					case 3:
						NextRun.mass_3();	/* マス進むメソッド */
						mass += 3;
						break;
					case 4:
						NextRun.mass_4();	/* マス進むメソッド */
						mass += 4;
						break;
					case 5:
						NextRun.mass_5();	/* マス進むメソッド */
						mass += 5;
						break;
					case 6:
						NextRun.mass_6();	/* マス進むメソッド */
						mass += 6;
						break;
					}
				}
			}
			System.out.println("ゴールにたどり着くことが出来た。");
		}else{
			System.out.println("GAMEを終了する");
		}

	}
}





