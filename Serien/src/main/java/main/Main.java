package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.IDatabaseConnector;
import database.SQLite.SQLiteDatabaseConnector;
import database.SQLite.SQLiteQueryHelper;

public class Main {

	public static void main(String[] args) {
		IDatabaseConnector dbc = SQLiteDatabaseConnector.getInstance();
		Connection con = dbc.getConnection("Serien.db");
		Statement s = null;
		try {
			s = con.createStatement();

			int b = s.executeUpdate(SQLiteQueryHelper.createTest);
			System.out.println(b);
			System.out.println("Press Enter to continue");
			System.in.read();
			s.executeUpdate("DROP TABLE test");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			if (s != null) {
				try {
					s.executeUpdate("DROP TABLE test");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			System.exit(0);
		}

	}

}
