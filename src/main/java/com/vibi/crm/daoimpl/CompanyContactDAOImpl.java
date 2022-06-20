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
import com.vibi.crm.dao.CompanyContactDAO;
import com.vibi.crm.model.CompanyContact;
import com.vibi.crm.util.UtilClass;
import com.vibi.crm.util.Constant;

@Repository
public class CompanyContactDAOImpl implements CompanyContactDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	UtilClass uc;
	
	Gson g = new Gson();
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String addCompanyInfo(CompanyContact companyContact) {

		String query = "INSERT INTO company_contact (company_name, office_address, contact_person,person_contact,office_contact,email,gst_no, "
				+ "company_level, reference, assignto, status, created_by, created_date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";			
		
		try {
			logger.info("Login as - Admin action - addCompanyInfo , Inputs - " + g.toJson(companyContact) + "\n");
		
			int row = jdbcTemplate.update(query,companyContact.getCompany_name(),companyContact.getOffice_address(),
					companyContact.getContact_person(),companyContact.getPerson_contact(),companyContact.getOffice_contact(),companyContact.getEmail(),
					companyContact.getGst_no(),companyContact.getCompany_level(),companyContact.getReference(),companyContact.getAssignto(),companyContact.getStatus(),
					companyContact.getCreatedby(),	UtilClass.getCurrentDateAndTime() );
			if (row>0) {
				logger.info("Login as - Admin , addCompanyInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
				return Constant.MSG_STATUS_SUCCESS;
			}
		} catch (EmptyResultDataAccessException empty) {
			logger.info("Login as - Admin, action - addCompanyInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
		} catch (Exception e) {
			logger.info("Login as - Admin, action - addCompanyInfo,  Exception - "+ e.toString() + "\n");
		}
		logger.info("Login as - Admin, addCompanyInfo response - "
				+ g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
		return Constant.MSG_STATUS_FAILURE;
	}
	
	
	@Override
	public String updateCompanyInfo(CompanyContact companyContact) {
		String query = "UPDATE company_contact SET company_name=?, office_address=?, contact_person=?,person_contact=?,office_contact=?,email=?,gst_no=?, "
				+ "company_level=?, reference=?, assignto=?, status=?, updated_by=?, updated_date=? WHERE sno=?";	
		try {
			logger.info("Login as - Admin action - updateCompanyInfo , Inputs - " + g.toJson(companyContact) + "\n");
		
			int row = jdbcTemplate.update(query,companyContact.getCompany_name(),companyContact.getOffice_address(),
					companyContact.getContact_person(),companyContact.getPerson_contact(),companyContact.getOffice_contact(),companyContact.getEmail(),
					companyContact.getGst_no(),companyContact.getCompany_level(),companyContact.getReference(),companyContact.getAssignto(),companyContact.getStatus(),
					companyContact.getCreatedby(),	UtilClass.getCurrentDateAndTime(), companyContact.getSno() );
			if (row>0) {
				logger.info("Login as - Admin , updateCompanyInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
				return Constant.MSG_STATUS_SUCCESS;
			}
		} catch (EmptyResultDataAccessException empty) {
			logger.info("Login as - Admin, action - updateCompanyInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
		} catch (Exception e) {
			logger.info("Login as - Admin, action - updateCompanyInfo,  Exception - "+ e.toString() + "\n");
		}
		logger.info("Login as - Admin, addCompanyInfo response - "
				+ g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
		return Constant.MSG_STATUS_FAILURE;
	}

	@Override
	public List<CompanyContact> getCompanyInfo() {			
//		CompanyContact companyContact = new CompanyContact();		
		String query="SELECT * FROM company_contact where status=1 ";
		try {			
			RowMapper<CompanyContact> rowMapper = new BeanPropertyRowMapper<CompanyContact>(CompanyContact.class);
			List<CompanyContact> companyList = jdbcTemplate.query(query, rowMapper );
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
	public List<CompanyContact> findCompanyInfo(CompanyContact companyContact) {
		String query="SELECT * FROM company_contact where sno=? ";
		try {			
			RowMapper<CompanyContact> rowMapper = new BeanPropertyRowMapper<CompanyContact>(CompanyContact.class);
			List<CompanyContact> res = jdbcTemplate.query(query, rowMapper,companyContact.getSno() );
			if (res.size()>0) {
				logger.info("Login as - Admin , findCompanyInfo response - " + g.toJson(res)	+ "\n");
				return res;
			}else {
				return null;
			}
		}catch (Exception e) {
			logger.info("Login as - Admin , action - findCompanyInfo,  Exception - " + e.toString() + "\n");
		}
		return null;
	}

	@Override
	public String remove(CompanyContact companyContact) {
		// TODO Auto-generated method stub
		return null;
	}


}
