package org.ensembl.healthcheck.configuration;

import uk.co.flamingpenguin.jewel.cli.Option;

/**
 * Interface for specifying the connection details and database name to
 * which the results of healthchecks will be written, if the reporterType
 * is "database".
 * 
 * @author michael
 *
 */
public interface ConfigureHealthcheckDatabase {

		// The database where the results of healthchecks are written to, if
		// the ReporterType is set to database
		//
		@Option(
			longName    = "output.database",
			description = "The name of the database where the results of the "
				+ "healthchecks are written to, if the database reporter is "
				+ "used."
		)
		String getOutputDatabase();
		boolean isOutputDatabase();

		@Option(
			longName    = "output.host",
			description = "The name of the database where the results of the "
				+ "healthchecks are written to, if the database reporter is "
				+ "used."
		)
		String getOutputHost();
		boolean isOutputHost();
		
		@Option(
			longName    = "output.port",
			description = "The port of the database where the results of the "
				+ "healthchecks are written to, if the database reporter is "
				+ "used."
		)
		String getOutputPort();
		boolean isOutputPort();
		
		@Option(
			longName    = "output.user",
			description = "The user name for the database where the results "
				+ "of the healthchecks are written to, if the database reporter "
				+ "is used."
		)
		String getOutputUser();
		boolean isOutputUser();
		
		@Option(
			longName    = "output.password",
			description = "The password for the database where the results "
				+ "of the healthchecks are written to, if the database "
				+ "reporter is used."
		)
		String getOutputPassword();
		boolean isOutputPassword();
		
		@Option(
			longName    = "output.driver",
			description = "The driver for the database where the results "
				+ "of the healthchecks are written to, if the database "
				+ "reporter is used."
		)
		String getOutputDriver();
		boolean isOutputDriver();
		
		@Option(
			longName    = "output.release",
			description = "Gets written into the session table for describing"
				+ " the test session, if the database reporter is used."
		)
		String getOutputRelease();
		boolean isOutputRelease();	

		@Option(
			longName    = "output.schemafile",
			description = "If output.database does not exist, it will be "
				+ "created automatically. This file should have the SQL "
				+ "commands to create the schema. Please remember that hashes "
				+ "(#) are not allowed to start comments in SQL. Use two "
				+ "dashes \"--\" at the beginning of a line instead. If the "
				+ "configuratble testrunner can't find this file from the "
				+ "current working directory, it will search for it in the "
				+ "classpath."
		)
		String getOutputSchemafile();
		boolean isOutputSchemafile();	
}
