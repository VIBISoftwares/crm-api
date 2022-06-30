package com.vibi.crm.dao;

import java.util.List;
import com.vibi.crm.model.Leads;

public interface LeadsDAO {

//Leads Info
public String addLeadInfo(Leads leads);
public String updateLeadInfo(Leads leads);
public List<Leads> getAllLeadInfo();
public List<Leads> findLeadInfo(Leads leads);
public String deleteLeadInfo(Leads leads);
public String changeFollowupDate(Leads leads);

public List<Leads> getTodayFollowups();
public List<Leads> getEsclationInfo();

}
