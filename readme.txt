http://localhost:8080/crm/api/addCompanyInfo
request: 
    {
    "company_name": "KASPON",
    "office_address": "PERUNGUDI",
    "contact_person": "RANJITH",
    "person_contact": "9875874589",
    "office_contact": "1234567890",
    "email": "KASPON@GMAIL.COM",
    "gst_no": "ASAASASDASD",
    "company_level": "L2",
    "reference": "RAMESH",
    "assignto": "VINOTH",
    "status": "1",
    "createdby": "ADMIN",
    "createddate": "2022-06-13"
}

http://localhost:8080/crm/api/updateCompanyInfo
request: 
    {
    "sno":"2",
    "company_name": "KASPON TECH WORKS",
    "office_address": "PERUNGUDI",
    "contact_person": "RANJITH",
    "person_contact": "9875874589",
    "office_contact": "1234567890",
    "email": "KASPON@GMAIL.COM",
    "gst_no": "ASAASASDASD",
    "company_level": "L2",
    "reference": "RAMESH",
    "assignto": "VINOTH KUMAR",
    "status": "1",
    "createdby": "ADMIN",
    "createddate": "2022-06-13"
}


http://localhost:8080/crm/api/findCompanyList
request: 
    {
    "sno":"2",
    }

    
http://localhost:8080/crm/api/addClientInfo
        {
    "contact_name":"Sitha",
    "contact_number":"989898989",
    "alternate_number":"",
    "email_id":"",
    "facebook":"",
    "instagram":"",
    "linked_in":"",
    "others_media_id":"",
    "status": "1",
    "createdby": "ADMIN",
    "createddate": "2022-06-23"
}

http://localhost:8080/crm/api/getAllClientList

    {
    "sno":"2",
    "contact_name":"Arjuna",
    "contact_number":"889898989",
    "alternate_number":"1234567789",
    "email_id":"",
    "facebook":"",
    "instagram":"",
    "linked_in":"",
    "others_media_id":"",
    "status": "1",
    "createdby": "ADMIN",
    "createddate": "2022-06-23"
}


http://localhost:8080/crm/api/updateClientInfo
    {
    "sno":"2",
    "contact_name":"Arjuna",
    "contact_number":"889898989",
    "alternate_number":"1234567789",
    "email_id":"",
    "facebook":"",
    "instagram":"",
    "linked_in":"",
    "others_media_id":"",
    "status": "1",
    "createdby": "ADMIN",
    "createddate": "2022-06-23"
}


http://localhost:8080/crm/api/findClientInfo
    { "sno":"2", }

http://localhost:8080/crm/api/deleteClientInfo
   { "sno":"2", }





