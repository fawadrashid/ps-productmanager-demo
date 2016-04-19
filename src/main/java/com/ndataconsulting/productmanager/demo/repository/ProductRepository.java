package com.ndataconsulting.productmanager.demo.repository;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ndataconsulting.productmanager.demo.model.Product;


@Repository
public class ProductRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private ProductJpaRepository productJpaRepository;
	
	/**
	 * Create
	 */
	public Product create(Product prod) {
		return productJpaRepository.saveAndFlush(prod);
	}

	/**
	 * Update
	 */
	public Product update(Product prod) {
		return productJpaRepository.saveAndFlush(prod);
	}

	/**
	 * Delete
	 */
	public void delete(Product prod) {
		productJpaRepository.delete(prod);
	}

	/**
	 * Find
	 */
	public Product find(Long id) {
		return productJpaRepository.findOne(id);
	}


	
	public Long getProductCount() {
		CriteriaBuilder qb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = qb.createQuery(Long.class);
		cq.select(qb.count(cq.from(Product.class)));
		return entityManager.createQuery(cq).getSingleResult();
	}
}
