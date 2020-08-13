package pattern.creational.factory_method;

public class OracleDBConnector extends DBConnector{

	@Override
	public void connection(ConnectionInfo connectionInfo) {
		//오라클 DB 접속 구현 메서드
		System.out.println("설정 값을 받아서  오라클 커넥터를 만듦");
	}

}
