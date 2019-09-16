
public class QAEngineer extends Employee {
private int sighInBonus;

public QAEngineer (String aName, int aSalary, String aCompany, int aSighInBonus) {
	super(aName, aSalary, aCompany);
	sighInBonus = aSighInBonus;
}

public int getSighInBonus() {
	return sighInBonus;
}
	

}
