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
import com.vibi.crm.dao.LeadsDAO;
import com.vibi.crm.model.Leads;
import com.vibi.crm.util.Constant;
import com.vibi.crm.util.UtilClass;

@Repository
public class LeadsDAOImpl implements LeadsDAO{

    @Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	UtilClass uc;
	
	Gson g = new Gson();
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String addLeadInfo(Leads leads) {
        String query = "INSERT INTO leads_personal_info ( title, firstname, middlename, lastname, gender, email, contact, marital_status, guardian_type, guardian_name, guardian_contact, occupation, dob,relegion,community,caste,address_line1,address_line2,area,district,state,country,pincode,followupdate,source,is_convert,created_by,created_date	 )"
        + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";			
                try {
                    logger.info("Login as - Admin action - addLeadInfo , Inputs - " + g.toJson(leads) + "\n");		
                    int row = jdbcTemplate.update(query, leads.getTitle(),leads.getFirstname(),leads.getMiddlename(),leads.getLastname(),leads.getGender(),leads.getEmail(),leads.getContact(),leads.getMarital_status(),leads.guardian_type,leads.getGuardian_contact(),leads.getGuardian_name(),leads.getGuardian_contact(),leads.getOccupation(),leads.getDob(),leads.getRelegion(),leads.getCommunity(),leads.getCaste(),leads.getAddress_line1(),leads.getAddress_line2(),leads.getArea(),leads.getDistrict(),leads.getState(),leads.getCountry(),leads.getPincode(),leads.getFollowupdate(),leads.getSource(),leads.getIs_convert(),  leads.getCreated_by() ,	UtilClass.getCurrentDateAndTime() );
                    if (row>0) {
                        logger.info("Login as - Admin , addLeadInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
                        return Constant.MSG_STATUS_SUCCESS;
                    }
                } catch (EmptyResultDataAccessException empty) {
                    logger.info("Login as - Admin, action - addLeadInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
                } catch (Exception e) {
                    logger.info("Login as - Admin, action - addLeadInfo,  Exception - "+ e.toString() + "\n");
                }
                logger.info("Login as - Admin, addLeadInfo response - "
                        + g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
                return Constant.MSG_STATUS_FAILURE;
    }

    @Override
    public String updateLeadInfo(Leads leads) {
        String query = "UPDATE leads_personal_info SET title=?,  firstname=?,  middlename=?,  lastname=?,  gender=?,  email=?,  contact=?,  marital_status=?,  guardian_type=?,  guardian_name=?,  guardian_contact=?,  occupation=?,  dob=?, relegion=?, community=?, caste=?, address_line1=?, address_line2=?, area=?, district=?, state=?, country=?, pincode=?, followupdate=?, source=?, is_convert=?, updated_by=?, updated_date=? WHERE sno=?";	
		try {
			logger.info("Login as - Admin action - updateLeadInfo , Inputs - " + g.toJson(leads) + "\n");
		
			int row = jdbcTemplate.update(query, leads.getTitle(),leads.getFirstname(),leads.getMiddlename(),leads.getLastname(),leads.getGender(),leads.getEmail(),leads.getContact(),leads.getMarital_status(),leads.guardian_type,leads.getGuardian_contact(),leads.getGuardian_name(),leads.getGuardian_contact(),leads.getOccupation(),leads.getDob(),leads.getRelegion(),leads.getCommunity(),leads.getCaste(),leads.getAddress_line1(),leads.getAddress_line2(),leads.getArea(),leads.getDistrict(),leads.getState(),leads.getCountry(),leads.getPincode(),leads.getFollowupdate(),leads.getSource(),leads.getIs_convert(),leads.getCreated_by() ,	UtilClass.getCurrentDateAndTime(), leads.getSno() );
			if (row>0) {
				logger.info("Login as - Admin , updateLeadInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
				return Constant.MSG_STATUS_SUCCESS;
			}
		} catch (EmptyResultDataAccessException empty) {
			logger.info("Login as - Admin, action - updateLeadInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
		} catch (Exception e) {
			logger.info("Login as - Admin, action - updateLeadInfo,  Exception - "+ e.toString() + "\n");
		}
		logger.info("Login as - Admin, updateLeadInfo response - "
				+ g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
		return Constant.MSG_STATUS_FAILURE;
    }

    @Override
    public List<Leads> getAllLeadInfo() {
        String query="SELECT * FROM leads_personal_info"; // where status=1 
		try {			
			RowMapper<Leads> rowMapper = new BeanPropertyRowMapper<Leads>(Leads.class);
			List<Leads> contactList = jdbcTemplate.query(query, rowMapper );
			if (contactList  != null) {
				logger.info("Login as - Admin , "
						+ " response - " + g.toJson(contactList ) + "\n");
				return contactList ;
			}
		}catch (Exception e) {
			logger.info("Login as - Admin , action - getAllLeadInfo,  Exception - " + e.toString() + "\n");
		}
		return null;
    }

    @Override
    public List<Leads> findLeadInfo(Leads leads) {
        String query="SELECT * FROM leads_personal_info  where status=1 ";
		try {			
			RowMapper<Leads> rowMapper = new BeanPropertyRowMapper<Leads>(Leads.class);
			List<Leads> contactList = jdbcTemplate.query(query, rowMapper );
			if (contactList  != null) {
				logger.info("Login as - Admin , "
						+ " response - " + g.toJson(contactList ) + "\n");
				return contactList ;
			}
		}catch (Exception e) {
			logger.info("Login as - Admin , action - getAllLeadInfo,  Exception - " + e.toString() + "\n");
		}
		return null;
    }

    @Override
    public String deleteLeadInfo(Leads leads) {
        String query = "UPDATE leads_personal_info SET status=0, updated_by=?,updated_date=? WHERE sno=?";	
		try {
			logger.info("Login as - Admin action - deleteLeadInfo , Inputs - " + g.toJson(leads) + "\n");
		
			int row = jdbcTemplate.update(query, leads.getCreated_by() ,	UtilClass.getCurrentDateAndTime(), leads.getSno() );
			if (row>0) {
				logger.info("Login as - Admin , deleteLeadInfo response - "+ g.toJson(Constant.MSG_STATUS_SUCCESS) + "\n");
				return Constant.MSG_STATUS_SUCCESS;
			}
		} catch (EmptyResultDataAccessException empty) {
			logger.info("Login as - Admin, action - deleteLeadInfo,  EmptyResultDataAccessException - " + empty.toString() + "\n");
		} catch (Exception e) {
			logger.info("Login as - Admin, action - deleteLeadInfo,  Exception - "+ e.toString() + "\n");
		}
		logger.info("Login as - Admin, deleteLeadInfo response - "+ g.toJson(Constant.MSG_STATUS_FAILURE) + "\n");
		return Constant.MSG_STATUS_FAILURE;
    }

}