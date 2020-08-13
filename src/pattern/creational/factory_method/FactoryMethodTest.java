package pattern.creational.factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactoryMethodTest {

	@Test
	void test() {
		DBConnector mySqlDBConnector = new MySqlDBConnector();
		
		DBConnector oracleDBConnector = new OracleDBConnector();
	}

}
