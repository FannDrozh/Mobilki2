package com.example.lab2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListItem {

    Connection connect;
    String ConnectionResult ="";
    Boolean isSuucess = false;

    public List<Map<String,String>>getlist()
    {
        List<Map<String,String>> data = null;
        data = new ArrayList<Map<String,String>>();
        try
        {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connectionClass();
            if(connect !=null)
            {
                String qu = " select * from Country";
                Statement statement = connect.createStatement();
                ResultSet resultSet = statement.executeQuery(qu);
                while (resultSet.next())
                {
                    Map<String,String> dtname = new HashMap<String, String>();
                    dtname.put("ProductID", resultSet.getString("Product_ID"));
                    dtname.put("Country", resultSet.getString("Country"));
                    dtname.put("Population", resultSet.getString("Population"));
                    data.add(dtname);
                }
                ConnectionResult = "Success";
                isSuucess =true;
                connect.close();
            }
            else
            {
                ConnectionResult = "Failed";
            }
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return data;
    }
}
