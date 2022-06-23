package com.vibi.crm.dao;

import java.util.List;
import com.vibi.crm.model.ClientContact;

public interface ClientContactDAO{

//Client Contact Info
public String addClientInfo(ClientContact contact);
public String updateClientInfo(ClientContact contact);
public List<ClientContact> getAllClientInfo();
public List<ClientContact> findClientInfo(ClientContact contact);
public String deleteClientInfo(ClientContact contact);

}
