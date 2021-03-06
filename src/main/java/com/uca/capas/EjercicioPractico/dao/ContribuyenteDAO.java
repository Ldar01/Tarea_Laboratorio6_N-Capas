package com.uca.capas.EjercicioPractico.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.EjercicioPractico.domain.Contribuyente;

public interface ContribuyenteDAO {
	
	public List<Contribuyente> findAll() throws DataAccessException;
	
	public Contribuyente findOne(Integer c_contribuyente) throws DataAccessException;
	
	public void save(Contribuyente contribuyente) throws DataAccessException;
	
	public void delete(Integer c_contribuyente) throws DataAccessException;
	
}
