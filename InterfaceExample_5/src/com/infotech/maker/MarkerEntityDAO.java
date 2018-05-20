package com.infotech.maker;

import com.infotech.exception.InvalidEntityFoundException;


public class MarkerEntityDAO {

	public boolean save(Object object)  throws InvalidEntityFoundException{
		boolean isSaved = false;
		if(!(object instanceof MarkerEntity)) {
		       throw new InvalidEntityFoundException("Invalid Entity Found, can't be saved");
		   } else{
			   System.out.println("Object saved in Database..");
			   isSaved = true;
		   }
		return isSaved;
	}
}
