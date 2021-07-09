package refactoring.if_then_else_9.replaceByPolymorphism.refactored;

public abstract class EmployeeType {
	public final static int ENGINEER = 0;
	public final static int SALESMAN = 1;
	public final static int MANAGER = 2;
	
	static EmployeeType newType(int type) {
		switch(type) {
		case ENGINEER:
			return  new Engineer();
		case MANAGER:
			return  new Manager();
		case SALESMAN:
			return  new Salesman();
		default:
			throw new IllegalArgumentException("不正な従業員タイプ");
		}
	}
	
	abstract int getTypeCode();
	abstract long payAmount(Employee emp);
}
