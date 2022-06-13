package com.vibi.crm.dao;

import java.util.List;
import com.vibi.crm.model.CompanyContact;

public interface CompanyContactDAO{
//	Company Contact Info
public String addCompanyInfo(CompanyContact companyContact);
public String updateCompanyInfo(CompanyContact companyContact);
public List<CompanyContact> getCompanyInfo();
public List<CompanyContact> findCompanyInfo(CompanyContact companyContact);
public String removeCompanyInfo(CompanyContact companyContact);

}
