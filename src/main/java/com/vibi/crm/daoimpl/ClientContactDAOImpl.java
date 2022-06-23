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
import com.vibi.crm.dao.ClientContactDAO;
import com.vibi.crm.model.ClientContact;
import com.vibi.crm.util.Constant;
import com.vibi.crm.util.UtilClass;

@Repository
public class ClientContactDAOImpl implements ClientContactDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	UtilClass uc;
	
	Gson g = new Gson();
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String addClientInfo(ClientContact contact) {
	String query = "INSERT INTO clientcontact (contact_name,contact_number,alternate_number,email_id,facebook,instagram,linked_in,others_media_id,status,created_by,created_date)"
+ " VALUES (?,?,?,?,?,?,?,?,?,?,?)";			
		try {
			logger.info("Login as - Admin action - addClientInfo , Inputs - " + g.toJson(contact) + "\n");		
			int row = jdbcTemplate.update(query, contact.getContact_name(),contact.getContact_number(),contact.getAlternate_number(),contact.getEmail_id(),contact.getFacebook(),contact.getInstagram(),contact.getLinked_in(),contact.getOthers_media_id(),contact.getStatus(),contact.getCreated_by() ,	UtilClass.getCurrentDateAndTime() );
			if (row>0) {
				logger.info("Login as - Admin , addClientInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
				return Constant.MSG_STATUS_SUCCESS;
			}
		} catch (EmptyResultDataAccessException empty) {
			logger.info("Login as - Admin, action - addClientInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
		} catch (Exception e) {
			logger.info("Login as - Admin, action - addClientInfo,  Exception - "+ e.toString() + "\n");
		}
		logger.info("Login as - Admin, addClientInfo response - "
				+ g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
		return Constant.MSG_STATUS_FAILURE;
	}

	@Override
	public String updateClientInfo(ClientContact contact) {
		String query = "UPDATE clientcontact SET contact_name=?,contact_number=?,alternate_number=?,email_id=?,facebook=?,instagram=?,linked_in=?,others_media_id=?,status=?,updated_by=?,updated_date=? WHERE sno=?";	
		try {
			logger.info("Login as - Admin action - updateClientInfo , Inputs - " + g.toJson(contact) + "\n");
		
			int row = jdbcTemplate.update(query,contact.getContact_name(),contact.getContact_number(),contact.getAlternate_number(),contact.getEmail_id(),contact.getFacebook(),contact.getInstagram(),contact.getLinked_in(),contact.getOthers_media_id(),contact.getStatus(),contact.getCreated_by() ,	UtilClass.getCurrentDateAndTime(), contact.getSno() );
			if (row>0) {
				logger.info("Login as - Admin , updateClientInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
				return Constant.MSG_STATUS_SUCCESS;
			}
		} catch (EmptyResultDataAccessException empty) {
			logger.info("Login as - Admin, action - updateClientInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
		} catch (Exception e) {
			logger.info("Login as - Admin, action - updateClientInfo,  Exception - "+ e.toString() + "\n");
		}
		logger.info("Login as - Admin, updateClientInfo response - "
				+ g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
		return Constant.MSG_STATUS_FAILURE;
	}

	@Override
	public List<ClientContact> getAllClientInfo() {
		String query="SELECT * FROM clientcontact"; // where status=1 
		try {			
			RowMapper<ClientContact> rowMapper = new BeanPropertyRowMapper<ClientContact>(ClientContact.class);
			List<ClientContact> contactList = jdbcTemplate.query(query, rowMapper );
			if (contactList  != null) {
				logger.info("Login as - Admin , "
						+ " response - " + g.toJson(contactList ) + "\n");
				return contactList ;
			}
		}catch (Exception e) {
			logger.info("Login as - Admin , action - getClientList,  Exception - " + e.toString() + "\n");
		}
		return null;
	}

	@Override
	public List<ClientContact> findClientInfo(ClientContact contact) {
		String query="SELECT * FROM clientcontact where sno=? "; 
		try {			
			RowMapper<ClientContact> rowMapper = new BeanPropertyRowMapper<ClientContact>(ClientContact.class);
			List<ClientContact> contactList = jdbcTemplate.query(query, rowMapper,contact.getSno() );
			if (contactList  != null) {
				logger.info("Login as - Admin , findClientInfo response - " + g.toJson(contactList ) + "\n");
				return contactList ;
			}
		}catch (Exception e) {
			logger.info("Login as - Admin , action - findClientInfo,  Exception - " + e.toString() + "\n");
		}
		return null;
	}

	@Override
	public String deleteClientInfo(ClientContact contact) {
		String query = "UPDATE clientcontact SET status=0, updated_by=?,updated_date=? WHERE sno=?";	
		try {
			logger.info("Login as - Admin action - deleteClientInfo , Inputs - " + g.toJson(contact) + "\n");
		
			int row = jdbcTemplate.update(query, contact.getCreated_by() ,	UtilClass.getCurrentDateAndTime(), contact.getSno() );
			if (row>0) {
				logger.info("Login as - Admin , deleteClientInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
				return Constant.MSG_STATUS_SUCCESS;
			}
		} catch (EmptyResultDataAccessException empty) {
			logger.info("Login as - Admin, action - deleteClientInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
		} catch (Exception e) {
			logger.info("Login as - Admin, action - deleteClientInfo,  Exception - "+ e.toString() + "\n");
		}
		logger.info("Login as - Admin, deleteClientInfo response - "+ g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
		return Constant.MSG_STATUS_FAILURE;
	}


}
