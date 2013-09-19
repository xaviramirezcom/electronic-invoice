package com.stf.security;

import com.stf.persistence.entity.Role;
import com.stf.persistence.enums.PermissionTypeEnum;

public class PermissionWrapper {

	private String pageFunctionality;
	private Role role;
	private PermissionTypeEnum permissionTypeEnum;

	public String getPageFunctionality() {
		return pageFunctionality;
	}

	public void setPageFunctionality(String pageFunctionality) {
		this.pageFunctionality = pageFunctionality;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public PermissionTypeEnum getPermissionTypeEnum() {
		return permissionTypeEnum;
	}

	public void setPermissionTypeEnum(PermissionTypeEnum permissionTypeEnum) {
		this.permissionTypeEnum = permissionTypeEnum;
	}

}
