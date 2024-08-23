package com.makersharks.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.makersharks.model.Supplier;
import com.makersharks.repo.SupplierRepository;

@Component
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	public Page<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcesses,
			Pageable pageable) {
		return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(location,
				natureOfBusiness, manufacturingProcesses, pageable);
	}

}
