package org.example.javaee.class03.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabasePool {
    private static HikariDataSource hikariDataSource ;

    public static HikariDataSource getHikariDataSource() {
        if (hikariDataSource != null) {
            return hikariDataSource;
        }
        synchronized (DatabasePool.class) {
            if (hikariDataSource == null) {
                HikariConfig hikariConfig = new HikariConfig();
                hikariConfig.setUsername("root");
                hikariConfig.setPassword("17301019");
                hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
                hikariConfig.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true");
                hikariDataSource = new HikariDataSource(hikariConfig);
                return hikariDataSource;
            }
        }
        return hikariDataSource;
    }
}



