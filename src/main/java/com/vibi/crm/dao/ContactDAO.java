package com.vibi.crm.dao;

import java.util.List;
import com.vibi.crm.model.Contact;

public interface ContactDAO{
//	Company Contact Info
public String addCompanyInfo(Contact contact);
public List<Contact> updateCompanyInfo(Contact contact);
public List<Contact> getCompanyInfo();
public String removeCompanyInfo(Contact contact);

//Client Contact Info
public String addClientInfo(Contact contact);
public List<Contact> updateClientInfo(Contact contact);
public List<Contact> getClientInfo(Contact contact);
public String removeClientInfo(Contact contact);

}
