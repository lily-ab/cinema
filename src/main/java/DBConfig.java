import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.sql.Driver;
import java.util.Properties;

@Configuration
@ComponentScan
@PropertySource("classPath:application.properties")
public class DBConfig {
    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName(Driver.class.getName());
        dataSource.setPassword("");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/cinemadb");
        return dataSource;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean emFactory=new LocalContainerEntityManagerFactoryBean();
        emFactory.setDataSource(dataSource());
        emFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        Properties jpaProp=new Properties();
        jpaProp.setProperty("hibernate,dialect","org.hibernate.dialect.MySQLDialect");
        jpaProp.setProperty("hibernate.hbm2ddl.auto","create-drop");
        emFactory.setJpaProperties(jpaProp);
        emFactory.setPackagesToScan("entities");
        return emFactory;
    }
    @Bean
    JpaTransactionManager transactionManager(){
        JpaTransactionManager transactionManager=new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }
}
