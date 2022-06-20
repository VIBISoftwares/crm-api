package com.vibi.crm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.vibi.crm.dao.CompanyContactDAO;
import com.vibi.crm.model.CompanyContact;
import com.vibi.crm.util.Constant;
import com.vibi.crm.util.UtilClass;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/crm/api")
public class ContactController {
	
	@Autowired
	UtilClass uc;
	
	@Autowired
	CompanyContactDAO contactDao;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

		
	@RequestMapping(method = RequestMethod.POST, value = "/addCompanyInfo")
	public ResponseEntity<String> addCompanyInfo(@RequestBody CompanyContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = ""; System.out.println(contact);
		String createClient = contactDao.addCompanyInfo(contact);
		if (createClient.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_COMP_ADD_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_COMP_ADD_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - createClient json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);		
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/updateCompanyInfo")
	public ResponseEntity<String> updateCompanyInfo(@RequestBody CompanyContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		String createClient = contactDao.updateCompanyInfo(contact);
		if (createClient.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_COMP_UPDATE_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_COMP_UPDATE_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - updateCompanyInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);				
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/deleteCompanyInfo")
	public ResponseEntity<String> deleteCompanyInfo(@RequestBody CompanyContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = ""; 
		String createClient = contactDao.deleteCompanyInfo(contact);
		if (createClient.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_COMP_DELETE_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_COMP_DELETE_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - deleteCompanyInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);				
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getCompanyList")
	public ResponseEntity<String> getClientDetails() {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		List<CompanyContact> companyList = contactDao.getCompanyInfo();
		if (companyList != null) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_RCD_AVL)
					+ ",\"company_list\":" + g.toJson(companyList) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_RCD_NOT_AVL)
					+ "}";
		}
		logger.info("Login as - Admin,  action - getCompanyList json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findCompanyList")
	public ResponseEntity<String> findCompanyInfo(@RequestBody CompanyContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		List<CompanyContact> companyList = contactDao.findCompanyInfo(contact);
		if (companyList != null) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_RCD_AVL)
					+ ",\"company_list\":" + g.toJson(companyList) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_RCD_NOT_AVL)
					+ "}";
		}
		logger.info("Login as - Admin,  action - findCompanyInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);
	}
	
	
	

}
