
Run spring java in ubuntu

/usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dspring.jmx.enabled=true -Dspring.application.admin.enabled=true -Dspring.boot.project.name=crm @/tmp/cp_f1u5wj2tcf3k3f3nve43lh6v5.argfile com.vibi.crm.CrmApplication 

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


http://localhost:8080/crm/api/addLeadInfo
  {
     "sno":"",
    "title":"",
    "firstname":"",
    "middlename":"",
    "lastname":"",
    "gender":"",
    "email":"",
    "contact":"",
    "marital_status":"",
    "guardian_type":"",
    "guardian_name":"",
    "guardian_contact":"",
    "occupation":"",
    "dob":"",
    "relegion":"",
    "community":"",
    "caste":"",
    "address_line1":"",
    "address_line2":"",
    "area":"",
    "district":"",
    "state":"",
    "country":"",
    "pincode":"",
    "followupdate":"",
    "source":"",
    "is_convert":"",
    "created_by":"",
    "created_date":"",
    "updated_by":"",
    "updated_date":""

    }

    http://localhost:8080/crm/api/updateLeadInfo

    http://localhost:8080/crm/api/deleteLeadInfo
    {
     "sno":""
    }

    http://localhost:8080/crm/api/getAllLeadInfo

    http://localhost:8080/crm/api/findLeadInfo

    {   
     "sno":""
    }