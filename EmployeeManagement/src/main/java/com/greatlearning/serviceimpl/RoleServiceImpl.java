package com.greatlearning.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.model.Role;
import com.greatlearning.repository.RoleRepository;
import com.greatlearning.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role updateRole(Role role) {
		Role existingRole = roleRepository.getById(role.getId());
		if (existingRole != null) {
			existingRole.setName(role.getName());
			roleRepository.save(existingRole);
		}
		return null;
	}

	@Override
	public List<Role> viewRoles() {
		return roleRepository.findAll();
	}

	@Override
	public void deleteRole(int id) {
		roleRepository.deleteById(id);
	}

}
