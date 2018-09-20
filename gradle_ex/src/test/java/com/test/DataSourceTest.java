package com.test;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import hello.Application;


@RunWith(SpringRunner.class)
@SpringBootConfiguration
@SpringBootTest(classes=Application.class)
public class DataSourceTest {

	@Autowired
	private DataSource ds;
	@Test
	public void contextLoads() {
	}
	@Test
	public void testDBConnection() throws Exception {
		
		System.out.println("ds연결정보:" + ds);
		
		Connection con = ds.getConnection();
		
		System.out.println("con정보:" + con);
		
		con.close();
	}
}
