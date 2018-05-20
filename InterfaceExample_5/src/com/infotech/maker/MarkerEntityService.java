package com.infotech.maker;

import com.infotech.exception.InvalidEntityFoundException;


public class MarkerEntityService {

	public boolean save(Object object) throws InvalidEntityFoundException {
		   return new MarkerEntityDAO().save(object);
		}
}
