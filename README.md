# JavaMultipleInheritance
インターフェースの多重継承

## 処理
インタフェースを多重継承して足し算と掛け算の処理を行います。

## コード
```
public class Multiinheri {

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
```

## 出力結果  
```
足し算をします
7 + 8 は 15 です。
掛け算をします
4 x 5 は 20 です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
