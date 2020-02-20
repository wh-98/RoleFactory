package factorydemo;

public class Cilent {
	//创建英雄公孙离
	public static void main(String[] args) {
	RoleFactory Gongsunli = new CreateGongsunli();
	Role r1 = Gongsunli.CreateRole();
	r1.role();
	
	//创建英雄铠
	RoleFactory Kai = new CreateKai();
	Role r2 = Kai.CreateRole();
	r2.role();
	
	//创建角色露娜
	RoleFactory Luna = new CreateLuna();
	Role r3 = Luna.CreateRole();
	r3.role();
	}
}
