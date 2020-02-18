package com.app.dbconfig;


//import java.util.HashMap;
//
//import javax.persistence.EntityManager;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.PropertySources;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;

//@Configuration
//@PropertySources({@PropertySource("classpath:application.properties")})
////@EntityScan(basePackages =  {"my.project.app.entity"})
//@EnableJpaRepositories(
//		entityManagerFactoryRef = "ds1EntityManager",
//		transactionManagerRef = "ds1TransactionManager",
//		basePackages = {"com.app.repository"})
public class SourceDBConfig {
//	
//	@Autowired
//	private Environment env;
//	
//	@Primary
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource ds1DataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
//		dataSource.setUrl(env.getProperty("spring.datasource.url"));
//		dataSource.setUsername(env.getProperty("spring.datasource.username"));
//		dataSource.setPassword(env.getProperty("spring.datasource.password"));
//		
//		return dataSource;
//		
//	}
//	
//	@Bean
//	public LocalContainerEntityManagerFactoryBean ds1EntityManager() {
//		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//		em.setDataSource(ds1DataSource());
//		
//		//ScanEntities in Package:
//		em.setPackagesToScan(new String [] {"com.app.model"});
//		em.setPersistenceUnitName("spring_datasource");
//		
//		
//		
//		//JPA & Hibernate
//		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		vendorAdapter.setGenerateDdl(true);
//		em.setJpaVendorAdapter(vendorAdapter);
//		
//		HashMap<String, Object> properties = new HashMap();
//		//JPA & Hibernate
//		properties.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
//		properties.put("hibernate.show-sql", env.getProperty("spring.jpa.show-sql"));
//		
//		properties.put("hibernatehbm2ddl.auto.dialect", "update");
////		properties.put("hibernate.dialect", "org.hibernate.dialect.MYSQLDialect");
//		
//		em.setJpaPropertyMap(properties);
//		em.afterPropertiesSet();
//		
//		return em;
//		
//	}
//	
//	@Bean
//	public EntityManager  entityManager(){
//		EntityManager ent = ds1EntityManager().getNativeEntityManagerFactory().createEntityManager();
//	
//		return ent;
//	}
//	
//	
//	@Bean
//	public PlatformTransactionManager ds1TransactionManager() {
//		JpaTransactionManager transactionManager = new JpaTransactionManager();
//		transactionManager.setEntityManagerFactory(ds1EntityManager().getObject());
//		return transactionManager;
//		
//	}

}
