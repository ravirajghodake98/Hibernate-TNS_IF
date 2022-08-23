package com.cg.service;

import com.cg.dao.IPlacementRepository;
import com.cg.dao.IPlacementRepositoryImpl;
import com.cg.entities.Placement;

public class IPlacementServiceImpl implements IPlacementService {

	private IPlacementRepository rep;
	
	
	public IPlacementServiceImpl() {
		super();
		rep = new IPlacementRepositoryImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		rep.beginTransaction();
		rep.addPlacement(placement);
		rep.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		rep.beginTransaction();
		rep.updatePlacement(placement);
		rep.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(Long id) {
		Placement placement=rep.searchPlacement(id);
		return placement;
		
	}

	@Override
	public boolean cancelPlacement(Long id) {
		rep.beginTransaction();
		rep.cancelPlacement(id);
		rep.commitTransaction();
		return false;
	}

}