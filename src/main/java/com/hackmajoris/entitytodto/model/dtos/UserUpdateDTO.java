package com.hackmajoris.entitytodto.model.dtos;

import lombok.Data;

@Data
public class UserUpdateDTO implements DTOEntity {

	private String name;
	private String email;
	private String password;

	public UserUpdateDTO() {
	}

	@Override
	public String toString() {
		return "UserUpdateDTO{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", password='" + password + '\''
				+ '}';
	}
}
