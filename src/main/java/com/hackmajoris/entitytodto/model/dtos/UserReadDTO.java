package com.hackmajoris.entitytodto.model.dtos;

import lombok.Data;

@Data
public class UserReadDTO implements DTOEntity {

	private String name;
	private String email;

	public UserReadDTO() {
	}
}
