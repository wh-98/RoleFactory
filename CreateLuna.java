package factorydemo;

public class CreateLuna implements RoleFactory {


	public Role CreateRole() {
		// TODO �Զ����ɵķ������
		return new LunaRole();
	}

}
