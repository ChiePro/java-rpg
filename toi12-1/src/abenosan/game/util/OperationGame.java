package abenosan.game.util;
import java.util.Scanner;

public class OperationGame {

	public static void setPlayerName(){     // 名前の選択
		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力してください:");
		Const.Player_Name = sc.next();
	}


}