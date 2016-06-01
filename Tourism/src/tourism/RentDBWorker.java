package tourism;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class RentDBWorker{
    private final String URL = "jdbc:mysql://localhost:3306/tourism";
    private final String userName = "root";
    private final String password = "sergiy2412";

    //RETRIEVE DATA
    public DefaultTableModel getDataService() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID Auto Service");
        defaultTableModel.addColumn("Service Name");
        defaultTableModel.addColumn("Location");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("Work Time");

        //SQL STATEMENT
        String sql = "SELECT * FROM auto_serv";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            //LOOP THRU GETTING ALL VALUES
            while (resultSet.next()) {
                //GET VALUES
                String idauto_serv = resultSet.getString("idauto_serv");
                String name_serv = resultSet.getString("name_serv");
                String location_auto_serv = resultSet.getString("location_auto_serv");
                String email = resultSet.getString("email");
                String time_work_auto_serv = resultSet.getString("time_work_auto_serv");

                defaultTableModel.addRow(new String[]{idauto_serv, name_serv, location_auto_serv, email, time_work_auto_serv});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }   }