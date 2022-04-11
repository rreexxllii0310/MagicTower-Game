package fp.s105502009;

import javafx.scene.image.Image;

public abstract class GameMonster {
	private int health;
	private int attack; // protested means only Class and it's children can access.
	private int defend;
	private int money;
	private int exp;
	private String name; // ���~�W��
	private Image image;

	public GameMonster(int health, int attack, int defend, int money, int exp, String name, Image image) {
		this.health = health;
		this.attack = attack;
		this.defend = defend;
		this.money = money;
		this.exp = exp;
		this.name = name;
		this.image = image;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefend() {
		return defend;
	}

	public void setDefend(int defend) {
		this.defend = defend;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
