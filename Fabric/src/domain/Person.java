package domain;

import factory.DAOFactory;

public class Person {

	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOFactory dao = new DAOFactory();
		dao.setSource(EInstance.DB);
		System.out.println(DAOFactory.inst.getName());
		dao.setSource(EInstance.XML);
		System.out.println(DAOFactory.inst.getName());
		DAOFactory.inst.setName("Konrad");
		System.out.println(DAOFactory.inst.getName());
		dao.setSource(EInstance.DB);
		System.out.println(DAOFactory.inst.getName());
	}

}
