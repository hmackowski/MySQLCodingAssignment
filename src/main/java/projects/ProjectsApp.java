package projects;

/**
 * @author Promineo
 */
import projects.dao.DbConnection;

public class ProjectsApp {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		DbConnection.getConnection();

	}

}
