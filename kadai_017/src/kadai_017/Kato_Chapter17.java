package kadai_017;//メソッドを定義するためのクラス
public abstract class Kato_Chapter17 {
    //フィールド設定
    public String familyName;
    public String givenName;
    public String address;
    //コンストラクタ・初期化
    public Kato_Chapter17(String familyName, String givenName, String address) {
        this.familyName = familyName;
        this.givenName  = givenName;
        this.address    = address;
    }
    //親クラス持つメソッド
    //①共通の紹介
    public void commonIntroduce () {
        System.out.println("名前は" + familyName);
    }
    public abstract void eachIntroduce (); //ここは修飾子abstractを使うので抽象メソッドを定義
    //各紹介の出力メソッドを実行
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
    //setGivenNameオーバーライドメソッド
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
