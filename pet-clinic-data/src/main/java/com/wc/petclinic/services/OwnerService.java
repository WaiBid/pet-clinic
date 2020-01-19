package com.wc.petclinic.services;

import java.util.Set;
import com.wc.petclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
