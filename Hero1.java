package study_09_11;

public class Hero1 {
	String name; // ����
	float hp; // Ѫ��
	float armor; // ����
	int moveSpeed; // �ƶ��ٶ�

	public Hero1() {

	}

	public Hero1(String name,float hp){
		this.name = name;
		this.hp = hp;
    }// ����

	public Hero1 revive(Hero1 h){
		//ֻҪ�����Ը�Ӣ�۹������Ҿ���һ��h�����½�һ����ĪhpΪ383��
	    h = new Hero1("��Ī",383);
	    return h;
    }
	public static void main(String[] args) {
	Hero1 teemo = new Hero1("��Ī",383);//����һ����teemo�Ķ��󣬲��ӵ�ս��
    //�ܵ�400�˺�������
    teemo.hp = teemo.hp - 400;//��ս����teemo��ΧŹ�ˣ���ʱ��hpΪ-17������
    
    teemo=teemo.revive(teemo);//�ѹҵ���teemoʬ���Ӹ�revive������revive���������ҵ���Ӣ�۾ͻ��Զ�����һ����h�Ķ��������ֽС���Ī��hpΪ��383����
    
    //revive������õ�Ӣ�۶������Լ����ˣ������桰h����������û�а���õ�Ӣ�۷Ż�ս����Ҳ�Ͳ��������Ȫˮ�︴�
    
    //��ʱ����syso��teemo.hp�����õ���teemo����Ҳ����ԭ���ҵ�����Ī��
    
    System.out.println(teemo.hp);//��˵��Ī����ˣ�syso��ȥ��teemo����Ҫ��Ī�����teemo����ֻ�и��ҵ�����Ī��û�취��թʬ��ս��
    
    //��õ�����Ī����revive���������ﱻ����play
    }
	// ���Ϊ-17
}

