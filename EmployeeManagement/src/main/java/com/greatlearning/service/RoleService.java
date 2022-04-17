package com.greatlearning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.model.Role;
@Service
public interface RoleService {
	
	Role createRole(Role role);
	
	Role updateRole(Role role);
	
	List<Role> viewRoles();
	
	void deleteRole(int id);

}
