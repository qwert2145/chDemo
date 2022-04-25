package com.example.clickhousedemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author :ZhangYi
 * @date :2022/4/25 20:24
 * @description:
 */
@Configuration
@MapperScan(value = "com.example.clickhousedemo.dao.mysql",sqlSessionFactoryRef = "mysqlSqlSessionFactory")
public class MysqlDataSourceConfig {

    @Bean(name = "mysqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mysql")
    public DataSource mysqlDataSource()throws ClassNotFoundException{
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mysqlSqlSessionFactory")
    public SqlSessionFactory mysqlSqlSessionFactoryBean()throws Exception{
        SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
        factory.setDataSource(mysqlDataSource());
        factory.setTypeAliasesPackage("com.example.clickhousedemo.entity.mysql");
        ResourcePatternResolver resourcePatternResolver=new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resourcePatternResolver.getResources("classpath:mapper/mysql/*.xml"));
        factory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return factory.getObject();
    }
}
