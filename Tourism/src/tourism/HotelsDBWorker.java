package tourism;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class HotelsDBWorker{
    private final String URL = "jdbc:mysql://localhost:3306/tourism";
    private final String userName = "root";
    private final String password = "sergiy2412";

    //RETRIEVE DATA
    public DefaultTableModel getDataHotel() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID Hotel");
        defaultTableModel.addColumn("Hotel Name");
        defaultTableModel.addColumn("Number of Stars");
        defaultTableModel.addColumn("Adress");
        defaultTableModel.addColumn("Number of Rooms");
        defaultTableModel.addColumn("Phone Number");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("Location");
        defaultTableModel.addColumn("Cheaper Price");
        //SQL STATEMENT
        String sql = "SELECT * FROM hotel";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            //LOOP THRU GETTING ALL VALUES
            while (resultSet.next()) {
                //GET VALUES
                String idHotel = resultSet.getString("idhotel");
                String name_hotel = resultSet.getString("name_hotel");
                String stars = resultSet.getString("stars");
                String adress = resultSet.getString("adress");
                String rooms = resultSet.getString("rooms");
                String phone_number = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String location = resultSet.getString("location");
                String min_price = resultSet.getString("min_price");
                defaultTableModel.addRow(new String[]{idHotel, name_hotel, stars, adress, rooms, phone_number, email, location, min_price});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }   }