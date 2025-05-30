package seleniumsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgCRUDTest {
public int AddUser() {
	return 123;
	
}
public String getUser(int uid) {
	return "userInfoFor"+uid;
	
}
public String updateUser(int uid) {
	return "userInfoFor"+uid;
	
}
public String DeleteUser(int uid) {
	return "deleteInfoFor"+uid;
}
	//AAA Arrange-Act-Assert pattern
@Test
public void AddUserTest() {
	int uid= AddUser();
	
}
@Test
public void getUserTest() {
	int uid=AddUser();
	String userInfo = getUser(uid);
	System.out.println(userInfo);
}
@Test
public void updateUserTest() {
	int uid=AddUser();
	System.out.println(uid);
	uid= 124;
	updateUser(uid);
	System.out.println(uid);
	Assert.assertEquals(uid,124,"user is not updated");
	
}
@Test
public void DeleteUserTest() {
	int uid= AddUser();
	DeleteUser( uid);
	getUser(uid);
	
}
}

