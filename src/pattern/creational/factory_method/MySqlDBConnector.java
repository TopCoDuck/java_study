package pattern.creational.factory_method;

public class MySqlDBConnector extends DBConnector{

	@Override
	public void connection(ConnectionInfo connectionInfo) {
		//Mysql 접속 구현 메서드
		System.out.println("설정 값을 받아서  Mysql 커넥터를 만듦");
	}

}
