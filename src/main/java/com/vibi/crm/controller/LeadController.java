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
import com.vibi.crm.dao.LeadsDAO;
import com.vibi.crm.model.Leads;
import com.vibi.crm.util.Constant;
import com.vibi.crm.util.UtilClass;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/crm/api")
public class LeadController {

	@Autowired
	UtilClass uc;

	@Autowired
	LeadsDAO leadsDao;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(method = RequestMethod.GET, value = "/welcome")
	public String welcome() {
		return "Welcome to ViBi Software Solutions...!";
	}

	// Leads controllers

	@RequestMapping(method = RequestMethod.POST, value = "/addLeadInfo")
	public ResponseEntity<String> addLeadInfo(@RequestBody Leads leads, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		String createLead = leadsDao.addLeadInfo(leads);
		if (createLead.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":"
					+ g.toJson(Constant.MSG_LEAD_ADD_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":"
					+ g.toJson(Constant.MSG_LEAD_ADD_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - addLeadInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/updateLeadInfo")
	public ResponseEntity<String> updateLeadInfo(@RequestBody Leads leads, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		String createLead = leadsDao.updateLeadInfo(leads);
		if (createLead.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":"
					+ g.toJson(Constant.MSG_LEAD_UPDATE_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":"
					+ g.toJson(Constant.MSG_LEAD_UPDATE_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - updateLeadInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/deleteLeadInfo")
	public ResponseEntity<String> deleteLeadInfo(@RequestBody Leads leads, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		String createLead = leadsDao.deleteLeadInfo(leads);
		if (createLead.equalsIgnoreCase(Constant.MSG_STATUS_SUCCESS)) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":"
					+ g.toJson(Constant.MSG_LEAD_DELETE_SUCCESS) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":"
					+ g.toJson(Constant.MSG_LEAD_DELETE_FAIL) + "}";
		}
		logger.info("Login as - Admin , action - deleteLeadInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getAllLeadInfo")
	public ResponseEntity<String> getAllLeadInfo() {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		List<Leads> clientList = leadsDao.getAllLeadInfo();
		if (clientList != null) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":"
					+ g.toJson(Constant.MSG_RCD_AVL)
					+ ",\"company_list\":" + g.toJson(clientList) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":"
					+ g.toJson(Constant.MSG_RCD_NOT_AVL)
					+ "}";
		}
		logger.info("Login as - Admin,  action - getAllLeadInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/findLeadInfo")
	public ResponseEntity<String> findLeadInfo(@RequestBody Leads leads, HttpSession session) {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";
		List<Leads> companyList = leadsDao.findLeadInfo(leads);
		if (companyList != null) {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_SUCCESS) + ",\"message\":"
					+ g.toJson(Constant.MSG_RCD_AVL)
					+ ",\"company_list\":" + g.toJson(companyList) + "}";
		} else {
			json_response = "{\"status\":" + g.toJson(Constant.MSG_STATUS_FAILURE) + ",\"message\":"
					+ g.toJson(Constant.MSG_RCD_NOT_AVL)
					+ "}";
		}
		logger.info("Login as - Admin,  action - findLeadInfo json respone : - " + json_response + "\n");
		return new ResponseEntity<String>(json_response, status);
	}

}
