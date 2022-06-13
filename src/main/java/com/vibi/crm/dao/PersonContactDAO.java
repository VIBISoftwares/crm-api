package com.vibi.crm.dao;

import java.util.List;
import com.vibi.crm.model.PersonContact;

public interface PersonContactDAO{

//Client Contact Info
public String addPersonInfo(PersonContact contact);
public List<PersonContact> updatePersonInfo(PersonContact contact);
public List<PersonContact> getPersonInfo(PersonContact contact);
public List<PersonContact> findPersonInfo(PersonContact companyContact);
public String removePersonInfo(PersonContact contact);

}
