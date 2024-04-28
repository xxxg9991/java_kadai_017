package kadai_017;
class KatoIchiro_Chapter17 extends Kato_Chapter17 {
    public KatoIchiro_Chapter17() {
        super("加藤", "一郎", "東京都中野区〇×");
    }

    //引数なしのsetGivenNameメソッド
    @Override
    public void setGivenName() {
        givenName = "一郎";
    }

    //個別の紹介を出力するメソッドの実装
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
