package prajwal.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class daoImpl implements Dao {

	private JdbcTemplate jdbcTemplate;
	public daoImpl() {
	   System.out.println("dao contruct created");
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate ;
	}
	public boolean save() {
		String sql = "INSERT INTO book VALUES(1 , 'java', 1000)";
		jdbcTemplate.execute(sql);
		return true;
	}

}
