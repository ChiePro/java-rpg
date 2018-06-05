package abenosan.game.util;

public class GameEnd {
	public static String updown(int mass , int hp) {
		if(mass >= 100) {
			String text = "ゴールにたどり着きました。";
			return text;
		}
		if(hp <= 0){
			String text = "力尽きてしまった。";
			return text;
		}
		return null;
	}
}
