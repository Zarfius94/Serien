package database;

import java.sql.Connection;

public interface IDatabaseConnector {

	/**
	 * Establishes a connection to the database that is specified by the given path.
	 * 
	 * @param path
	 *            Path to the file of the SQLite database file.
	 * @return if successful the connection to the database, else null
	 */
	public Connection getConnection(String path) ;

	/**
	 * Returns the last established connection. If the last attempt failed it returns null.
	 * 
	 * @return The last established connection, or null if the last try failed.
	 */
	public Connection getLastConnection();
}
