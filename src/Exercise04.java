
public class Exercise04 {

	public static void main(String[] args) {
//		練習４ 
//		あらかじめ用意されたクイズ・なぞなぞを順番に出題するゲームを作成せよ。
//		問題とその答えは以下のようなイメージの2次元配列で管理する。
//		（内側の配列では、1つ目の要素で問題を、2つ目の要素で答えを管理）
//		問題は最低5問とし、内容・数は自由とする。また今後問題数や内容が変更となった場合に
//		プログラムの変更ができるだけ少なくて済むように工夫すること。
//
//		プレイヤーからの回答は、キーボード入力で受け付け、答えと一致しているかを判定し、
//		一致してれば「正解です！」、そうでなければ「残念。不正解です」と表示する。
//		また、すべての問題出題後、正解、不正解の数および正解率に応じた判定メッセージを表示する
//		こと。正解率に対応した判定メッセージの対応は下記のとおりとする。
//		正解率
//		表示するメッセージ
//		80％以上
//		すばらしい！クイズ博士ですね！！
//		60％以上
//		優秀ですね！
//		40％以上
//		普通の人です
//		20％以上
//		次は、頑張りましょう！
//		それ以外
//		クイズは苦手ですか？
		//変数宣言
		String[][] quiz = {
				{"上は大火事、下は大水、これなあに？","9匹のトラが乗っている乗り物は？","お茶はお茶でも、子供がよろこぶおちゃは？","食べると安心するケーキはなーんだ？","どんなに頼んでも、売ってくれない人のお仕事は？"},
				{"おふろ","とらっく","おもちゃ","ほっとけーき","うらないし"}
		};
		System.out.println("今から、クイズ・なぞなぞを5問出題します。");
		System.out.println("答えは全て\"ひらがな\"で答えてください。");


	}

}
