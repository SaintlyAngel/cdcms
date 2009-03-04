package cn.net.chinacdc.cdcms.teachingmanage.models;


// 1. import package
import java.sql.*;
import java.util.ArrayList;

public class Course{
	
	// 2. load JDBC driver
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}	
	
}

