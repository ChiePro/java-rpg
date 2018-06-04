package abenosan.game.util;
import java.util.Scanner;

public class OperationGame {

	public static void setPlayerName(){     // 名前の選択
		System.out.print("名前を入力してください:");
		Const.Player_Name = new Scanner(System.in).next();
	}
}