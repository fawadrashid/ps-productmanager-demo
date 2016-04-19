package com.ndataconsulting.productmanager.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;


import com.ndataconsulting.productmanager.demo.model.Product;


@Repository
@RepositoryRestResource(path="prds", collectionResourceRel="prds")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface ProductJpaRepository extends JpaRepository<Product, Long> {
	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	List<Product> findAll();
	
	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	Page<Product> findAll(Pageable pageable);
	
	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	List<Product> findAll(Sort sort);
	
	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	List<Product> findAll(Iterable<Long> ids);
}
