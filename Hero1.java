package study_09_11;

public class Hero1 {
	String name; // 姓名
	float hp; // 血量
	float armor; // 护甲
	int moveSpeed; // 移动速度

	public Hero1() {

	}

	public Hero1(String name,float hp){
		this.name = name;
		this.hp = hp;
    }// 复活

	public Hero1 revive(Hero1 h){
		//只要有人仍个英雄过来，我就造一个h对象（新建一个提莫hp为383）
	    h = new Hero1("提莫",383);
	    return h;
    }
	public static void main(String[] args) {
	Hero1 teemo = new Hero1("提莫",383);//创建一个叫teemo的对象，并扔到战场
    //受到400伤害，挂了
    teemo.hp = teemo.hp - 400;//上战场的teemo被围殴了，此时的hp为-17，挂了
    
    teemo=teemo.revive(teemo);//把挂掉的teemo尸体扔给revive方法，revive方法看到挂掉的英雄就会自动制造一个叫h的对象且名字叫“提莫”hp为“383”。
    
    //revive方法造好的英雄都留着自己完了，闭门玩“h”。。。并没有把造好的英雄放回战场，也就不会出现在泉水里复活。
    
    //此时调用syso（teemo.hp）引用的是teemo对象，也就是原来挂掉的提莫。
    
    System.out.println(teemo.hp);//听说提莫造好了，syso跑去问teemo对象要提莫，结果teemo对象只有个挂掉的提莫，没办法，诈尸回战场
    
    //造好的新提莫还在revive方法的手里被各种play
    }
	// 输出为-17
}

