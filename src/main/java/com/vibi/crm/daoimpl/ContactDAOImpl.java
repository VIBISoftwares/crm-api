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
import com.vibi.crm.dao.ContactDAO;
import com.vibi.crm.model.Contact;
import com.vibi.crm.util.UtilClass;

@Repository
public class ContactDAOImpl implements ContactDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	UtilClass uc;
	
	Gson g = new Gson();
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String addCompanyInfo(Contact contact) {

		String query = "INSERT INTO company_contact";
		return null;
	}

	@Override
	public List<Contact> updateCompanyInfo(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getCompanyInfo() {	
		
		Contact contact = new Contact();
		
		String query="SELECT * FROM company_contact";
		try {			
			RowMapper<Contact> rowMapper = new BeanPropertyRowMapper<Contact>(Contact.class);
			List<Contact> companyList = jdbcTemplate.query(query, rowMapper );
			if (companyList != null) {
				logger.info("Login as - Admin , getCompanyList response - " + g.toJson(companyList) + "\n");
				return companyList;
			}
		}catch (Exception e) {
			logger.info("Login as - Admin , action - getClientList,  Exception - " + e.toString() + "\n");
		}
		return null;
	}

	@Override
	public String removeCompanyInfo(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addClientInfo(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> updateClientInfo(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getClientInfo(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeClientInfo(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
