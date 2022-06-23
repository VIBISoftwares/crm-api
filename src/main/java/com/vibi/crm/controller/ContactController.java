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
import com.vibi.crm.dao.ClientContactDAO;
import com.vibi.crm.dao.CompanyContactDAO;
import com.vibi.crm.model.ClientContact;
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
	
	@Autowired
	ClientContactDAO clientContactDao;
	
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
		logger.info("Login as - Admin , action - addCompanyInfo json respone : - " + json_response + "\n");
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
	public ResponseEntity<String> getCompanyDetails() {
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
	
//	Client controllers
	
	@RequestMapping(method = RequestMethod.POST, value = "/addClientInfo")
	public ResponseEntity<String> addClientInfo(@RequestBody ClientContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = ""; System.out.println(contact);
		String createClient = clientContactDao.addClientInfo(contact);
		if (createClient.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_CLIENT_ADD_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_CLIENT_ADD_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - addClientInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);		
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/updateClientInfo")
	public ResponseEntity<String> updateClientInfo(@RequestBody ClientContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		String createClient = clientContactDao.updateClientInfo(contact);
		if (createClient.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_CLIENT_UPDATE_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_CLIENT_UPDATE_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - updateClientInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);				
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/deleteClientInfo")
	public ResponseEntity<String> deleteClientInfo(@RequestBody ClientContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = ""; 
		String createClient = clientContactDao.deleteClientInfo(contact);
		if (createClient.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_CLIENT_DELETE_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_CLIENT_DELETE_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - deleteClientInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);				
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/getAllClientList")
	public ResponseEntity<String> getAllClientList(@RequestBody ClientContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson(); 
		String json_response = "";
		List<ClientContact> clientList = clientContactDao.getAllClientInfo();
		if (clientList != null) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_RCD_AVL)
					+ ",\"company_list\":" + g.toJson(clientList) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_RCD_NOT_AVL)
					+ "}";
		}
		logger.info("Login as - Admin,  action - getClientDetails json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findClientInfo")
	public ResponseEntity<String> findClientInfo(@RequestBody ClientContact contact, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		List<ClientContact> companyList = clientContactDao.findClientInfo(contact);
		if (companyList != null) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":" + g.toJson(Constant.MSG_RCD_AVL)
					+ ",\"company_list\":" + g.toJson(companyList) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":" + g.toJson(Constant.MSG_RCD_NOT_AVL)
					+ "}";
		}
		logger.info("Login as - Admin,  action - findClientList json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);
	}
	
	

}
