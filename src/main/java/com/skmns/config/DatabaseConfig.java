package com.skmns.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {
     
    @Autowired
	@Qualifier("dataSourceFirst")
	DataSource dataSourceFirst;

    @Configuration
	@PropertySource("classpath:jdbc.properties")
	static class DataSourceFirst extends HikariConfig {
		@Value("${jdbc.first.driverClassName}") private String driverClassName;
		@Value("${jdbc.first.url}") private String url;
		@Value("${jdbc.first.username}") private String username;
		@Value("${jdbc.first.password}") private String password;
		@Value("${jdbc.first.autoCommit}") private Boolean autoCommit;
		@Value("${jdbc.first.connectionTimeoutMs}") private Long connectionTimeoutMs;
		@Value("${jdbc.first.idleTimeoutMs}") private Long idleTimeoutMs;
		@Value("${jdbc.first.maxLifetimeMs}") private Long maxLifetimeMs;
		@Value("${jdbc.first.minIdle}") private Integer minIdle;
		@Value("${jdbc.first.maxPoolSize}") private Integer maxPoolSize;
		
		@Primary
		@Bean(name="dataSourceFirst", destroyMethod = "close")
		DataSource dataSourceFirst() throws Exception {
			HikariConfig hikariConfig = new HikariConfig();
			hikariConfig.setMaximumPoolSize(this.maxPoolSize);
			hikariConfig.setDriverClassName(this.driverClassName);
			hikariConfig.setJdbcUrl(this.url);
			hikariConfig.addDataSourceProperty("user", this.username);
			hikariConfig.addDataSourceProperty("password", this.password);
			hikariConfig.setAutoCommit(this.autoCommit);
			hikariConfig.addDataSourceProperty("cachePrepStmts", true);			
			hikariConfig.addDataSourceProperty("prepStmtCacheSize", 250);		
			hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);	
			return new HikariDataSource(hikariConfig);
		}
	}
	
	@Primary
	@Bean(name="txtManagerFirst")
	public DataSourceTransactionManager txtManagerFirst() {
		return new DataSourceTransactionManager(dataSourceFirst);
	}
	
	@Primary
	@Bean(name = "sqlSessionFactoryFirst")
	public SqlSessionFactoryBean sqlSessionFactoryFirst(ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSourceFirst);
		factoryBean.setMapperLocations(applicationContext.getResources("classpath*:com/skmns/infra/mapper/*.xml"));
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis/mybatis-config.xml"));
		return factoryBean; 
	}
	
	@Primary
	@Bean(name = "sqlSessionTemplateFirst")
    public SqlSessionTemplate sqlSessionTemplateFirst(@Qualifier("sqlSessionFactoryFirst")SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
