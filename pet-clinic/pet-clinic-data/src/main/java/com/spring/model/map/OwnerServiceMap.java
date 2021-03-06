package com.spring.model.map;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.model.Owner;
import com.spring.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

	@Override
	public Owner findById(Long id) {

		return  super.findById(id);
	}

	@Override
	public Owner save(Owner object) {

		return  super.save(object);
	}

	@Override
	public void delete(Owner object) {

		 super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
