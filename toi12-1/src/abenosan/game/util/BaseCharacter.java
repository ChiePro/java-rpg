package abenosan.game.util;
public abstract class BaseCharacter{
	public String name ;   /* 名前 */
	public int level;		/* Level */
	public int hp;			/* HP数値 */
	public int mp;			/* MP数値 */
	public int exp;		/* 経験値 */


	/**
	 * 攻撃処理
	 */
	public abstract int attack();

	/**
	 * 特殊攻撃
	 */
	public abstract int skillAttack();

	/**
	 * 逃げる処理
	 * @return
	 */
	public abstract void run();


	}

