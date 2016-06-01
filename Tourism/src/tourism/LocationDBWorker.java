package tourism;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class LocationDBWorker{
    private final String URL = "jdbc:mysql://localhost:3306/tourism";
    private final String userName = "root";
    private final String password = "sergiy2412";

    //RETRIEVE DATA
    public DefaultTableModel getDataLocation() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID Location");
        defaultTableModel.addColumn("Location Name");
        defaultTableModel.addColumn("Location Adress");
        //SQL STATEMENT
        String sql = "SELECT * FROM locations";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            //LOOP THRU GETTING ALL VALUES
            while (resultSet.next()) {
                //GET VALUES
                String idLocation = resultSet.getString("idLocations");
                String locationName = resultSet.getString("locationName");
                String locationAdress = resultSet.getString("locationAdress");
                defaultTableModel.addRow(new String[]{idLocation, locationName, locationAdress});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }   }