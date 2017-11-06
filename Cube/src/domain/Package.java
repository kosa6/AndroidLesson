package domain;

import java.util.Scanner;

public class Package {
	public TypeOfPackage Type;
	public String description;
	public int countOfMoves;
	public String addDate;
	public int number;
	private int priorty;
	public void setPriorty() {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if(i<1 || i>5) {
			System.out.println("Priorty can be number between 1 to 5");
		}
		else {
			priorty = i;
		}
		scan.close();
	}
	Package(TypeOfPackage Type,String description,int countOfMoves,String addData,int number, int priorty, String addDate)
	{
		this.Type=Type;
		this.description=description;
		this.countOfMoves=countOfMoves;
		this.addDate=addDate;
		this.number=number;
		this.priorty=priorty;
	}
}

