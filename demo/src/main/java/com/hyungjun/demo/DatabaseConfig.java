package com.hyungjun.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages="com.hyungjun.demo.mapper")
@ComponentScan(basePackages="com.hyungjun.demo")
public class DatabaseConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
		final SqlSessionFactoryBean sf = new SqlSessionFactoryBean();
		sf.setDataSource(ds);
		PathMatchingResourcePatternResolver rs = new PathMatchingResourcePatternResolver();
		sf.setMapperLocations(rs.getResources("classpath:com/hyungjun/demo/mapper/*.xml"));
		return sf.getObject();
	}
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sf) throws Exception {
		final SqlSessionTemplate st = new SqlSessionTemplate(sf);
		return st;
	}
}
