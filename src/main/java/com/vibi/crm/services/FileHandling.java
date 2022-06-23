package com.vibi.crm.services;

import org.springframework.stereotype.Service;

@Service
public class FileHandling {
	/*

	@Autowired
	JdbcTemplate jdbcTemplate;

	Gson g = new Gson();

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Transactional
	public String addAccount(ClientContact client) {
}
	
	String sql_map = "INSERT INTO `ACCOUNT_POINT_OF_CONTACT` (`CLIENT_ID`, `ACCT_ID`, `NAME`, `DESIGNATION`, `DEPARTMENT`, `CONTACT_NO`, `EMAIL`, `ADDRESS`,"
			+ " `CITY`, `PINCODE`, `CREATED_BY`, `CREATED_ON`, `LASTMODIFIED_BY`, `LASTMODIFIED_DATE`, `STATE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	//
	int[] updateCounts = null;
	boolean query_flag = true;
	if (account.getPoc_list() != null && account.getPoc_list().size() > 0) {
		updateCounts = jdbcTemplate.batchUpdate(sql_map, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) {
				try {
					ps.setString(1, account.getClient_id());
					ps.setString(2, account.getAccount_id());
					ps.setString(3, account.getPoc_list().get(i).getName());
					ps.setString(4, account.getPoc_list().get(i).getDesignation());
					ps.setString(5, account.getPoc_list().get(i).getDepartment());
					ps.setString(6, account.getPoc_list().get(i).getContact_no());
					ps.setString(7, account.getPoc_list().get(i).getEmail());
					ps.setString(8, account.getPoc_list().get(i).getAddress_line_one());
					ps.setString(9, account.getPoc_list().get(i).getCity());
					ps.setString(10, account.getPoc_list().get(i).getPincode());
					ps.setString(11, account.getLogin_id());
					ps.setString(12, UtilClass.getCurrentDateAndTime());
					ps.setString(13, account.getLogin_id());
					ps.setString(14, UtilClass.getCurrentDateAndTime());
					ps.setString(15, account.getPoc_list().get(i).getState());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Login as - " + account.getLogin_id()
							+ "action - addAccount, Exception - " + e.toString() + "\n");
				}
			}
    */
}
