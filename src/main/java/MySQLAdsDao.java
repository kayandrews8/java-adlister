import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import javax.swing.plaf.nimbus.State;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getPassword(),
                    config.getUsername()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while(resultSet.next()){
                Ad as = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("user_id"),
                        resultSet.getString("description"),
                        resultSet.getString("title")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        String title = ad.getTitle();
        String description = ad.getDescription();
        String query = "INSERT INTO ads (user_id, title, description) VALUES (1, '" + title + "', '" + description + "')";

        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            long key = resultSet.getLong(1);
            System.out.println("The key for this insert is: " + key);
            return key;
        } catch (SQLException e) {
            throw new RuntimeException("could not connect to database", e);
        }
    }
}


