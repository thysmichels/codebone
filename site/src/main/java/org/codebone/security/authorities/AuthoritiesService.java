package org.codebone.security.authorities;

import java.util.List;

import org.codebone.framework.BaseModel;
import org.codebone.framework.SuccessModel;
import org.codebone.framework.generic.AbstractDao;
import org.codebone.framework.generic.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component

public class AuthoritiesService extends AbstractService<Authorities> {
	
	@Autowired
	private AuthoritiesDao dao;

	@Override
	public AbstractDao getDao() {
		return dao;
	}

	public BaseModel getAuthorities(Long organizationIdx) {
		List authoritiesList = dao.getAuthorities(organizationIdx);
		return new SuccessModel(authoritiesList);
	}
	public boolean isNew(){
		int count = dao.count();
		if(count==0){
			return true;
		}else{
			return false;
		}
	}

	public BaseModel delete(String idx) {
		Authorities auth = (Authorities) read(idx).getData();
		delete(auth);
		return new SuccessModel();
	}
}
