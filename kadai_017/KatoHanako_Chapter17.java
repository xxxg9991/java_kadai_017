package kadai_017;

// 加藤花子を表すクラス
public class KatoHanako_Chapter17 extends Kato_Chapter17 {
    public KatoHanako_Chapter17() {
        setGivenName(); // 引数なしで呼び出し
    }

    // 名を表すフィールドの値をセットするメソッド
    public void setGivenName() {
        givenName = "花子";
    }

    // 個別紹介をするメソッドの実装
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}

