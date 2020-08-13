package pattern.creational.factory_method;

public abstract class DBConnector {

	public DBConnector() {
		/** 입의의 위치에서 설정한 값을 읽어 온다고 가정*/
		connection(new  ConnectionInfo());
	}

	public abstract void connection(ConnectionInfo connectionInfo);
}
