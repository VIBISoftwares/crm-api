package com.vibi.crm.daoimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.vibi.crm.dao.PersonContactDAO;
import com.vibi.crm.model.PersonContact;
import com.vibi.crm.util.UtilClass;

@Repository
public class PersonContactDAOImpl implements PersonContactDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	UtilClass uc;
	
	Gson g = new Gson();
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String addPersonInfo(PersonContact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonContact> updatePersonInfo(PersonContact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonContact> getPersonInfo(PersonContact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonContact> findPersonInfo(PersonContact companyContact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removePersonInfo(PersonContact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
