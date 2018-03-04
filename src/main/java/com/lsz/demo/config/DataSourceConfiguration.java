package com.lsz.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * 连接数据库 连接池
 */
@Configuration
// 扫描mapper文件
@MapperScan("com.lsz.demo.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.jdbcUserName}")
    private String jdbcUserName;
    @Value("${jdbc.jdbcDriverClass}")
    private String driverClass;
    @Value("${jdbc.jdbcUrl}")
    private String jdbcUrl;
    @Value("${jdbc.jdbcPassword}")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createComboPooledDataSource() throws PropertyVetoException {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driverClass);
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        comboPooledDataSource.setUser(jdbcUserName);
        comboPooledDataSource.setPassword(jdbcPassword);
        // 连接关闭时不提交事务
        comboPooledDataSource.setAutoCommitOnClose(false);

        return comboPooledDataSource;
    }
}
