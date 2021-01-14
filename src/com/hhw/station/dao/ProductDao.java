package com.hhw.station.dao;

import java.sql.*;

public class ProductDao {

    public void save(String productName,int productPrice){
        System.out.println("=======我是添加产品的方法=======");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql:localhost:3306/station_demo","root","root");

            String sql="";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();



            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String product_name = resultSet.getString("product_name");

            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}