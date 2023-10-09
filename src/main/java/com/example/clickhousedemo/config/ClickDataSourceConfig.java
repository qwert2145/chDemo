package com.example.clickhousedemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author :ZhangYi
 * @date :2022/4/25 20:25
 * @description:
 */
@Configuration
@MapperScan(value = "com.example.clickhousedemo.dao.click",sqlSessionFactoryRef = "clickSqlSessionFactory")
public class ClickDataSourceConfig {
    @Bean(name="clickHouseDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.click")
    public DataSource clickHouseDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "clickSqlSessionFactory")
    public SqlSessionFactory clickHouseSqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
        factory.setDataSource(clickHouseDataSource());
        factory.setTypeAliasesPackage("com.example.clickhousedemo.entity.clickhouse");
        ResourcePatternResolver resourcePatternResolver=new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resourcePatternResolver.getResources("classpath:mapper/clickhouse/*.xml"));
        factory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return factory.getObject();
    }
}
