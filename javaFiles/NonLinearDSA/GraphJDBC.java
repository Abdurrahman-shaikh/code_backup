import java.sql.*;

public class GraphJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "azmi";
        String password = "Aza@#11221";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String Query = "SELECT * FROM Telephone_Consumer";
            Statement consumerStatement = connection.createStatement();
            ResultSet consumerResult = consumerStatement.executeQuery(Query);

            while (consumerResult.next()) {
                int consumerId = consumerResult.getInt("consumer_id");
                String consumerName = consumerResult.getString("consumer_name");
                String consumerAddress = consumerResult.getString("consumer_address");
                Timestamp dateOfIssue = consumerResult.getTimestamp("date_of_issue");
                String consumerMobNo = consumerResult.getString("consumer_mob_no");
                int status = consumerResult.getInt("status");

                System.out.println("Consumer ID: " + consumerId);
                System.out.println("Consumer Name: " + consumerName);
                System.out.println("Consumer Address: " + consumerAddress);
                System.out.println("Date of Issue: " + dateOfIssue);
                System.out.println("Consumer Mobile No: " + consumerMobNo);
                System.out.println("Status: " + status);
                System.out.println();
            }

            String callLogsQuery = "SELECT * FROM call_logs";
            Statement callLogsStatement = connection.createStatement();
            ResultSet callLogsResult = callLogsStatement.executeQuery(callLogsQuery);

            while (callLogsResult.next()) {
                int logId = callLogsResult.getInt("log_id");
                int consumerId = callLogsResult.getInt("consumer_id");
                int callerId = callLogsResult.getInt("caller_id");
                int receiverId = callLogsResult.getInt("receiver_id");
                Timestamp startTime = callLogsResult.getTimestamp("start_time");
                Timestamp endTime = callLogsResult.getTimestamp("end_time");

                System.out.println("Log ID: " + logId);
                System.out.println("Consumer ID: " + consumerId);
                System.out.println("Caller ID: " + callerId);
                System.out.println("Receiver ID: " + receiverId);
                System.out.println("Start Time: " + startTime);
                System.out.println("End Time: " + endTime);
                System.out.println();
            }

            consumerResult.close();
            consumerStatement.close();
            callLogsResult.close();
            callLogsStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
