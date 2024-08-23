package com.makersharks.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.makersharks.model.Supplier;


@Service
public interface SupplierService {

	public Page<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcesses,
			Pageable pageable);

}
