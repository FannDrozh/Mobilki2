package com.example.lab2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
        try {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connectionClass();
            if(connect !=null)
            {
                String qu = " select * from Country";
                Statement statement = connect.createStatement();
                ResultSet resultSet = statement.executeQuery(qu);
            }
        }
    }
}
