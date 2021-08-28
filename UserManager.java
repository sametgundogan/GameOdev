
public class UserManager implements UserService{

	@Override
	public void enroll(User user) {
		System.out.println(user.getFirstName()+ user.getLastName() + " adlı kullanıcı kayıt edildi.");		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ user.getLastName() + " adlı kullanıcı güncellendi.");		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ " adlı kullanıcı silindi.");		
		
	}

}
