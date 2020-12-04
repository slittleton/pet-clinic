package com.spring.services;

import java.util.Set;

import com.spring.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);

}