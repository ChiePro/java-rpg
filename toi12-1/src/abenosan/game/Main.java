package abenosan.game;

import java.util.Scanner;

import abenosan.game.combat.Combat;
import abenosan.game.util.Dice;
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
		OperationGame.setPlayerName();/* PlayerNameの選択 */
		int mass = 0;
		System.out.println("1:GAMEをはじめる 2:GAMEを終了する");
		if(new Scanner(System.in).nextInt() == 1){
			while(mass < 100){
				System.out.println("[1] を入力してサイコロを振ってください。");
				if(new Scanner(System.in).nextInt() == 1){
					switch(Dice.diceMini()){
					case 1:
						System.out.println("------------戦闘モード-----------");
						System.out.println("モンスターが現れた！！");
						Combat.combat();
						mass +=1;
						System.out.println("ゴールまで残り:["+ (100-mass) + "]マス");
						break;
					case 2:
						mass +=2;
						System.out.println("--------------------------");
						System.out.println(" [2] ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
						System.out.println("--------------------------");
						System.out.println("");
						break;
					case 3:
						mass +=3;
						System.out.println("--------------------------");
						System.out.println(" [3] ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
						System.out.println("--------------------------");
						System.out.println("");
						break;
					case 4:
						mass +=4;
						mass -=3;
						System.out.println("--------------------------");
						System.out.println(" [4] ﾏｽ進んだが、落とし穴にハマり 3ﾏｽ戻ってしまった！ゴールまで残り:["+(100-mass) + "]ﾏｽ");
						System.out.println("--------------------------");
						System.out.println("");
						break;
					case 5:
						mass +=5;
						System.out.println("--------------------------");
						System.out.println(" [5]ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
						System.out.println("--------------------------");
						System.out.println("");
						break;
					case 6:
						mass +=6;
						System.out.println("--------------------------");
						System.out.println(" [6]ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
						System.out.println("--------------------------");
						System.out.println("");
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





