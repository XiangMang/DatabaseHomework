package com.dao_.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class JDBCUtilsByDruid {
    private static DataSource dataSource;

    // 在静态代码块完成 datasource 初始化
    static {
        Properties properties = new Properties();
        try {
            properties.load(Files.newInputStream(Paths.get("src\\druid.properties")));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 编写 getConnection 方法
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // 关闭连接
    public static void close(ResultSet set, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (set != null) {
                set.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
