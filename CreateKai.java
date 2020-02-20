package factorydemo;

public class CreateKai implements RoleFactory {

	@Override
	public Role CreateRole() {
		// TODO 自动生成的方法存根
		return new KaiRole();
	}

}
