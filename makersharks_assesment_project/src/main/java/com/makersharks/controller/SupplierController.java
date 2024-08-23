package com.makersharks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.makersharks.model.Supplier;
import com.makersharks.service.SupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	@PostMapping("/query")
	public ResponseEntity<Page<Supplier>> querySuppliers(@RequestParam String location,
			@RequestParam String natureOfBusiness, @RequestParam String manufacturingProcesses,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Supplier> suppliers = supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcesses,
				pageable);

		return ResponseEntity.ok(suppliers);
	}

}
