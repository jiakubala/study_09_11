package study_09_11;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;

	//无参构造函数没设置且已经存在有参构造函数所以默认不存在了
	public Hero(String heroName) {
		name = heroName;
	}
	public Hero(String heroName,float heroHp,
			float heroArmor,int heroMoveSpeed) {
		this(heroName);//调用一个参数的构造方法
		hp = heroHp;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
		System.out.println(name+"拥有"+hp+"的血量，以及"+
		armor+"的护甲，移动速度为"+moveSpeed+"。");
	}
	
	public static void main(String[] args) {
		Hero zzz = new Hero("左正直",1000,300,420);
		System.out.println(zzz.name);
	}
}
