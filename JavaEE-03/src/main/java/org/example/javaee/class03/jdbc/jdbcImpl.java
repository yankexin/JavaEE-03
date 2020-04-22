package org.example.javaee.class03.jdbc;

import org.example.javaee.class03.model.homework;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class jdbcImpl implements dao {
    private DataSource dataSource;

    /**
     * @param dataSource
     */
    public void setDataSource(final DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public  void addHomework(String title,String content){
        String queryCustomer = "insert into homework(id,title,content,time) values(?,?,?,?)";
        Connection connection =null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            shjdbc sh = new shjdbc();
            List<homework> list = sh.allHomework();
            String id = String.valueOf(list.size()+1);

            preparedStatement = connection.prepareStatement(queryCustomer);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2,title);
            preparedStatement.setString(3,content);
            Date date = new Date();
            preparedStatement.setTimestamp(4,new Timestamp(date.getTime()));
            preparedStatement.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            System.out.println(e);
            try {
                if(connection!=null){
                    connection.rollback();
                }
            } catch (SQLException e1) {
                System.out.println(e1);
            }
        }finally{
            try {
                if(connection!=null){
                    connection.rollback();
                }
            } catch (SQLException e2) {
                System.out.println(e2);
            }
        }
        System.out.println("Inserted into Homework Successfully");
    }

}

