package study_09_11;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;

	//�޲ι��캯��û�������Ѿ������вι��캯������Ĭ�ϲ�������
	public Hero(String heroName) {
		name = heroName;
	}
	public Hero(String heroName,float heroHp,
			float heroArmor,int heroMoveSpeed) {
		this(heroName);//����һ�������Ĺ��췽��
		hp = heroHp;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
		System.out.println(name+"ӵ��"+hp+"��Ѫ�����Լ�"+
		armor+"�Ļ��ף��ƶ��ٶ�Ϊ"+moveSpeed+"��");
	}
	
	public static void main(String[] args) {
		Hero zzz = new Hero("����ֱ",1000,300,420);
		System.out.println(zzz.name);
	}
}
