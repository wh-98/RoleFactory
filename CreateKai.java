package factorydemo;

public class CreateKai implements RoleFactory {

	@Override
	public Role CreateRole() {
		// TODO �Զ����ɵķ������
		return new KaiRole();
	}

}
