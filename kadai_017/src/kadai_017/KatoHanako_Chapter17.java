package kadai_017;
class KatoHanako_Chapter17 extends Kato_Chapter17 {
    public KatoHanako_Chapter17() {
        super("加藤", "花子", "東京都中野区〇×");
    }


    //引数なしのsetGivenNameメソッド
    @Override
    public void setGivenName() {
        this.givenName = "花子";
    }
    //個別の紹介を出力するメソッドの実装
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
