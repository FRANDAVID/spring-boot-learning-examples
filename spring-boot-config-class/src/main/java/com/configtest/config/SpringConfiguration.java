package com.configtest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version SpringConfiguration.java, v 0.1 2019-05-10 15:17 david
 * @project spring-boot-learning-examples
 */
@Configuration
@Import(WebMvcConfiguration.class) //主配置类导入从配置类
@ComponentScan({"com.configtest"})
public class SpringConfiguration {
//  private static final String HIBERNATEDIALECT = "hibernate.dialect";
//  private static final String HIBERNATESHOWSQL = "hibernate.show_sql";
//  private static final String HIBERNATEDDLAUTO = "hibernate.hbm2ddl.auto";
//  private static final String HIBERNATEPACKAGESCAN = "hibernate.packagesToScan";
//  private static final String HIBERNATEFORMATSQL = "hibernate.format_sql";
//
//  @Value("${spring.datasource.jdbcUrl}")
//  private String url;
//  @Value("${spring.datasource.username}")
//  private String username;
//  @Value("${spring.datasource.password}")
//  private String password;
//  @Value("${spring.datasource.driver-class-name}")
//  private String driverClassName;
//  @Value("${spring.datasource.minPoolSize}")
//  private Integer minPoolSize;
//  @Value("${spring.datasource.maxPoolSize}")
//  private Integer maxPoolSize;
//  @Value("${spring.datasource.maxIdleTime}")
//  private Integer maxIdleTime;
//  @Value("${spring.datasource.acquireIncrement}")
//  private Integer acquireIncrement;
//  @Value("${spring.datasource.maxStatements}")
//  private Integer maxStatements;
//  @Value("${spring.datasource.initialPoolSize}")
//  private Integer initialPoolSize;
//  @Value("${spring.datasource.idleConnectionTestPeriod}")
//  private Integer idleConnectionTestPeriod;
//
//  @Autowired
//  private Environment env;
//
//  @Bean(name = "dataSource")
//  @Primary
//  public DataSource dataSource() throws PropertyVetoException {
//    ComboPooledDataSource dataSource = new ComboPooledDataSource();
//    dataSource.setJdbcUrl(url);
//    dataSource.setUser(username);
//    dataSource.setPassword(password);
//    dataSource.setDriverClass(driverClassName);
//    dataSource.setMinPoolSize(minPoolSize);
//    dataSource.setMaxPoolSize(maxPoolSize);
//    dataSource.setMaxIdleTime(maxIdleTime);
//    dataSource.setAcquireIncrement(acquireIncrement);
//    dataSource.setMaxStatements(maxStatements);
//    dataSource.setInitialPoolSize(initialPoolSize);
//    dataSource.setIdleConnectionTestPeriod(idleConnectionTestPeriod);
//    return dataSource;
//  }
//
//  @Bean("localSessionFactoryBean")
//  public LocalSessionFactoryBean localSessionFactoryBean(DataSource dataSource) throws
//      PropertyVetoException, IOException {
//    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//    sessionFactoryBean.setDataSource(dataSource);
//    sessionFactoryBean.setPackagesToScan(env.getRequiredProperty(HIBERNATEPACKAGESCAN));
//    // 设置完属性之后需要调用 afterPropertiesSet方法使配置生效
//    sessionFactoryBean.setHibernateProperties(hibProperties());
//    sessionFactoryBean.afterPropertiesSet();
//    return sessionFactoryBean;
//  }
//
//  @Bean("sessionFactory")
//  @Primary
//  public SessionFactory sessionFactory(LocalSessionFactoryBean localSessionFactoryBean) throws
//      PropertyVetoException, IOException {
//    SessionFactory sessionFactory = localSessionFactoryBean.getObject();
//    return sessionFactory;
//  }
//
//  @Bean
//  public LocalContainerEntityManagerFactoryBean entityManagerFactory
//      (DataSource dataSource) {
//    final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//    em.setDataSource(dataSource);
//    final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//    em.setJpaVendorAdapter(vendorAdapter);
//    em.setPackagesToScan(env.getRequiredProperty(HIBERNATEPACKAGESCAN));
//    // 设置完属性之后需要调用 afterPropertiesSet方法使配置生效
//    em.setJpaProperties(hibProperties());
//    em.afterPropertiesSet();
//    return em;
//  }
//
//  @Bean
//  public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
//    final JpaTransactionManager transactionManager = new JpaTransactionManager();
//    transactionManager.setEntityManagerFactory(emf);
//    return transactionManager;
//  }
//
//  @Bean
//  public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//    return new PersistenceExceptionTranslationPostProcessor();
//  }
//
//  @Bean
//  public FilterRegistrationBean registerOpenEntityManagerInViewFilterBean() {
//    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//    OpenEntityManagerInViewFilter filter = new OpenEntityManagerInViewFilter();
//    registrationBean.setFilter(filter);
//    registrationBean.addUrlPatterns("/*");
//    registrationBean.setOrder(5);
//    return registrationBean;
//  }
//
//
//  private Properties hibProperties() {
//    Properties properties = new Properties();
//    properties.put(HIBERNATEDIALECT, env.getRequiredProperty(HIBERNATEDIALECT));
//    properties.put(HIBERNATESHOWSQL, env.getRequiredProperty(HIBERNATESHOWSQL));
//    properties.put(HIBERNATEDDLAUTO, env.getRequiredProperty(HIBERNATEDDLAUTO));
//    properties.put(HIBERNATEFORMATSQL, env.getRequiredProperty(HIBERNATEFORMATSQL));
//    return properties;
//  }
}
