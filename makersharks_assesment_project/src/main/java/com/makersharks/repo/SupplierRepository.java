package com.makersharks.repo;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makersharks.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

	Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(String location,
			String natureOfBusiness, String manufacturingProcesses, Pageable pageable);

}
