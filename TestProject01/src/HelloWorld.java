
public class HelloWorld {

	public static void main(String[] args) {
		// Hello World! の出力
		
		//03_Java
		System.out.println("Hello World!");
		System.out.println("こんにちは！！");
		//文字列の場合は、ダブルクオテーションで囲む
		System.out.println("例外が");
		System.out.println("発生しました。");
		//行の途中で改行するとエラーになるが、2行に分けて書くと改行して表示される
		System.out.println("例外が\r\n発生しました。");
		//改行コード（Windowsなら¥r¥n）を入力すると、そこで改行して表示される
		
		//04_Java
		String name = "高橋";
		System.out.println(name);
		//変数nameに「高橋」を代入し、実行結果には、「高橋」
		String str1 = "鈴木";
		System.out.println(str1);
		String str2 = "Tanaka";
		System.out.println(str2);
		String tel = "090-1234-5678";
		System.out.println(tel);
		//数字とハイフンがあるので文字列として処理する
		char char1 = 'A';
		System.out.println(char1);
		//文字1つは、「文字列」でなく「文字」なので、Stringではなく、charで処理する。
		//また、charの場合は、代入する値を、必ずシングルクオテーションで囲まなければいけません。
		int num1 = 12345;
		System.out.println(num1);
		//数字は、intで処理をする
		boolean boo= true;
		System.out.println(boo);
		//真偽値は、booleanで処理をする
		int a = 3+3;
		System.out.println(a);
		String b= "3+3";
		System.out.println(b);
		//文字列型（String）で定義した場合、値は" "（ダブルクォーテーション）で囲みます。
		//囲まない場合、エラーになります。
		String abc= "山田";
		System.out.println(abc +"さん");
		//abcに代入した「山田」と「さん」を連結できる。
		
		//05_Java
		int c = 3 + 3;
		System.out.println(c);
		int a1 = 4 + 3;
		System.out.println(a1);
		int a2 = -8 -3;
		System.out.println(a2);
		var a3= -5* 3;
		System.out.println(a3);
		var a4= 4 / 2;
		System.out.println(a4);
		int d = 0 / 4;
		System.out.println(d);
		//0を割ると0が出力されるが、0で割るとエラーになる。
		int e = 10 / 3;
		System.out.println(e);
		//割り算「/」を行う場合、整数型であれば小数点以下は切り捨てになります。
		float f = (float)10 / 3;
		System.out.println(f);
		//割り算「/」で小数点以下を求めたい場合、浮動小数点型を使用します。
		int g = 7 % 3;
		System.out.println(g);
		//％は、割り算の余りを表示する
		int h = 6 % 3;
		System.out.println(h);
		//あまりは0
		
		//06_Java
	}

}
