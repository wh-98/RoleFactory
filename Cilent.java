package factorydemo;

public class Cilent {
	//����Ӣ�۹�����
	public static void main(String[] args) {
	RoleFactory Gongsunli = new CreateGongsunli();
	Role r1 = Gongsunli.CreateRole();
	r1.role();
	
	//����Ӣ����
	RoleFactory Kai = new CreateKai();
	Role r2 = Kai.CreateRole();
	r2.role();
	
	//������ɫ¶��
	RoleFactory Luna = new CreateLuna();
	Role r3 = Luna.CreateRole();
	r3.role();
	}
}
