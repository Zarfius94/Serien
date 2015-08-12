package database;

public interface IQueryHelper {

	/**
	 * Generates a valid query from the given parameters
	 * @param columns Selection of the wanted columns.
	 * @param tables tables that should be included in the query.
	 * @param conditions Conditions to the query.
	 * @return a valid query as String to be send to the database to execute.
	 */
	String generateQuery(String[] columns, String[] tables, String[] conditions);
}
