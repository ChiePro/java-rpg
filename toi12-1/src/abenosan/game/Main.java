package abenosan.game;

import java.util.Scanner;

import abenosan.game.player.Player;
import abenosan.game.util.GameEnd;
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
		System.out.println("[1]:GAMEをはじめる		[2]:GAMEを終了する");
		while(Integer.parseInt(sc.nextLine()) == 1){
			while(Player.hp > 0 && mass <= 100){					/* mass が 100以上になったらゲーム終了 */
				System.out.println("[1]:先へ進む     [2]:回復     [4]:ステータス確認");
				String i = sc.nextLine();
				if(i.equals("1")){
					NextRun.goRun();			/* サイコロを振り、戦闘などが発生する*/
				}else if(i.equals("4")) {
					System.out.println("--------------------------");
					Player.status();			/* PlayerのStatusの表示 */
					System.out.println("--------------------------");
				}else if(i.equals("2")) {
					System.out.println("--------------------------");
					Player.drug();				/* Playerの薬の数を表示 */
					System.out.println("--------------------------");
				}
			}
			System.out.println( GameEnd.updown(mass,Player.hp)); 	/* ゴールかゲームオーバーの判断 */
			break;
		}
	}
}