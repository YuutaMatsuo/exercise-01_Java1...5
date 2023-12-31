
public class Exercise03 {

	public static void main(String[] args) {
//		練習３
//		キーボードから入力された「人数」と「金額」より、1人当たりの支払額を算出する割り勘プログ
//		ラムを作成せよ。1人当たりの金額は、幹事分とその他で分けて出力すること。
//		幹事分：金額÷人数 の計算結果（小数点以下は切り捨て）
//		+ 1人当たりの金額計算時の、小数点以下切り捨てによる金額の不足分
//		その他：金額÷人数 の計算結果（小数点以下は切り捨て）
//		また、人数の入力時に2未満の数値が入力された場合は、エラーメッセージ「人数は2以上の整数
//		を入力してください。」を表示し、以降の処理を中止すること。
//
//		【前提条件】
//		・キーボードから受け付ける値は必ず整数が入力されるものとする。

		// 変数を宣言
		int count;
		int amount;
		int answer;
		int leader = 0;
		System.out.println("人数を入力：");
		count = new java.util.Scanner(System.in).nextInt();
		// 入力された値が２以上か確認
		if (count < 2) {
			System.out.println("人数は２以上の整数を入力してください");
			System.exit(0);
		}

		System.out.println("金額を入力：");
		amount = new java.util.Scanner(System.in).nextInt();
		answer = amount % count;
		if (answer != 0) {
			leader += 1;
		}
		answer = amount / count;
		leader += answer;
		System.out.println("人当たりの金額は" + answer + "円です。幹事は" + leader + "円です。");
	}

}
