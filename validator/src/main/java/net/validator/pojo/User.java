package net.validator.pojo;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class User {
	@NotBlank(message = "用户名不能为空")
	private String userName;

	@NotBlank(message = "年龄不能为空")
	@Pattern(regexp = "^[0-9]{1,2}$", message = "年龄是整数")
	private String age;
	
	@Pattern(regexp = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$", message = "出生日期格式不正确")
	private String birthday;

	@NotBlank(message = "学校不能为空")
	private String school;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
