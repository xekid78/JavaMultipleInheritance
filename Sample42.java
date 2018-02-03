/**
 *
 * @author xekid78
 *
 */
public class Sample42 {

	public static void main(String[] args) {
		Calc4 calc = new Calc4();
        calc.method("足し算");
        calc.add();
        calc.method("掛け算");
        calc.mul();

	}

}

interface Add3 {
	public int A = 7;
	public int B = 8;

	void method(String str);
    void add();
}

interface Multiply2 {
	public int A = 4;
	public int B = 5;

	void method(String str);
    void mul();
}

class Calc4 implements Add3, Multiply2{
    public void method(String str) {
        System.out.println(str + "をします");
    }

    public void add() {
    	System.out.println(Add3.A + " + " + Add3.B + " は " + (Add3.A + Add3.B) + " です。");
    }

    public void mul() {
    	System.out.println(Multiply2.A + " x " + Multiply2.B + " は " + (Multiply2.A * Multiply2.B) + " です。");
    }
}