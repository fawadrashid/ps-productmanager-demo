package com.ndataconsulting.productmanager.demo.model.projections;

import java.math.BigDecimal;

import org.springframework.data.rest.core.config.Projection;

import com.ndataconsulting.productmanager.demo.model.Manufacturer;
import com.ndataconsulting.productmanager.demo.model.Model;
import com.ndataconsulting.productmanager.demo.model.ModelType;

@Projection(name="modelDetail", types = {Model.class})
public interface ModelDetail {
	String getName();
	BigDecimal getPrice();
	Manufacturer getManufacturer();
	ModelType getModelType();
	int getFrets();
	String getWoodType();
}
