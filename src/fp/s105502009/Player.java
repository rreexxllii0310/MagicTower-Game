package fp.s105502009;

public class Player {
	private int x=11,y=6;           //初始位置
	private int Level=1;            //初始能力值
	private int Hp=1000;
	private int at=100; //init 10
	private int def=100; //init 10
	private int Money=0;
	private int Exp=0;
	private int Ykey=2; //init 0
	private int Bkey=1;
	private int Rkey=1;
	private int floor=1;
	
	public Player(int x, int y, int Level, int Hp, int at, int def, int Money, int Exp, int Ykey, int Bkey, int Rkey, int floor) {
		this.x = x;
		this.y = y;
		this.Level = Level;
		this.Hp = Hp;
		this.at = at;
		this.def = def;
		this.Money = Money;
		this.Exp = Exp;
		this.Ykey = Ykey;
		this.Bkey = Bkey;
		this.Rkey = Rkey;
		this.floor = floor;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getAt() {
		return at;
	}
	public void setAt(int at) {
		this.at = at;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public int getYkey() {
		return Ykey;
	}
	public void setYkey(int ykey) {
		Ykey = ykey;
	}
	public int getBkey() {
		return Bkey;
	}
	public void setBkey(int bkey) {
		Bkey = bkey;
	}
	public int getRkey() {
		return Rkey;
	}
	public void setRkey(int rkey) {
		Rkey = rkey;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
}
