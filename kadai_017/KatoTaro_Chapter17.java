package kadai_017;

// 加藤一郎を表すクラス
public class KatoTaro_Chapter17 extends Kato_Chapter17 {
    public KatoTaro_Chapter17() {
        setGivenName(); // 引数なしで呼び出し
    }

    // 名を表すフィールドの値をセットするメソッド
    public void setGivenName() {
        givenName = "太郎";
    }

    // 個別紹介をするメソッドの実装
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}


