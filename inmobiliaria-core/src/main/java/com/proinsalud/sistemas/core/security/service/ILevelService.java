package com.proinsalud.sistemas.core.security.service;

import java.util.List;

import com.proinsalud.sistemas.core.security.model.Level;

public interface ILevelService {

	public Level persistEntity(Level entity);

	public Level mergeEntity(Level entity);

	public void deleteEntity(Level entity);

	public List<Level> findAllEntity();

	public Level findEntityById(Long id);
}
