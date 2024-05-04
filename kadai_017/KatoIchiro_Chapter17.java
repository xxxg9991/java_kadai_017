package kadai_017;

// 加藤一郎を表すクラス
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
    public KatoIchiro_Chapter17() {
        setGivenName(); // 引数なしで呼び出し
    }

    // 名を表すフィールドの値をセットするメソッド
    public void setGivenName() {
        givenName = "一郎";
    }

    // 個別紹介をするメソッドの実装
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
