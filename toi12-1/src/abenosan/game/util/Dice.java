package abenosan.game.util;
public class Dice {
	/**
	 *
	 * Damage 計算をランダム出力
	 *
	 */
	public static int dice(){
		int point = (int) (Math.random()*11);
		return point;
	}

	/**
	 *
	 * @return Storyを進めるためのサイコロ１～６までの出力
	 */
	public static int diceMini(){
		int point = (int) (Math.random()*6)+1;
		return point;
	}
}
