package factorydemo;

public class CreateGongsunli implements RoleFactory {


	public Role CreateRole() {
		// TODO �Զ����ɵķ������
		return new GongsunliRole();
	}

}
