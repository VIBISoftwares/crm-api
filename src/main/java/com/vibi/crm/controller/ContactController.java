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
import com.vibi.crm.dao.ContactDAO;
import com.vibi.crm.model.Contact;
import com.vibi.crm.util.Constant;
import com.vibi.crm.util.UtilClass;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/crm/api")
public class ContactController {
	
	@Autowired
	UtilClass uc;
	
	@Autowired
	ContactDAO contactDao;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(method = RequestMethod.GET, value = "/getCompanyList")
	public ResponseEntity<String> getClientDetails() {
		HttpStatus status = HttpStatus.OK;
		Gson g = new Gson();
		String json_response = "";

		List<Contact> companyList = contactDao.getCompanyInfo();
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
	

}
