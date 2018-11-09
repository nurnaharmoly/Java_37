
package com.coderbd.jdbc.connection;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = MySqlDbConnection.getConnection();
    }
}
