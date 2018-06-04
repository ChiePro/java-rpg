package abenosan.game.util;

import abenosan.game.combat.Combat;

public class NextRun {
	static int mass = 0;
	public static int mass_1(){
		System.out.println("------------戦闘モード-----------");
		System.out.println("モンスターが現れた！！");
		Combat.combat();
		mass +=1;
		System.out.println("ゴールまで残り:["+ (100-mass) + "]マス");
		return mass;
	}

	public static int mass_2(){
		mass +=2;
		System.out.println("--------------------------");
		System.out.println(" [2] ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
		System.out.println("--------------------------");
		System.out.println("");
		return mass;
	}
	public static int mass_3(){
		mass +=3;
		System.out.println("--------------------------");
		System.out.println(" [3] ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
		System.out.println("--------------------------");
		System.out.println("");
		return mass;
	}
	public static int mass_4(){
		mass +=4;
		System.out.println("--------------------------");
		System.out.println(" [4] ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
		System.out.println("--------------------------");
		System.out.println("");
		return mass;
	}
	public static int mass_5(){
		mass +=5;
		System.out.println("--------------------------");
		System.out.println(" [5] ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
		System.out.println("--------------------------");
		System.out.println("");
		return mass;
	}

	public static int mass_6(){
		mass +=6;
		System.out.println("--------------------------");
		System.out.println(" [6] ﾏｽ進んだぞ！ゴールまで残り:["+ (100-mass) + "]ﾏｽ");
		System.out.println("--------------------------");
		System.out.println("");
		return mass;
	}
}
