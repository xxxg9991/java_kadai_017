package kadai_017;//メソッドを定義するためのクラス
public abstract class Kato_Chapter17 {
    //フィールド設定
    public String familyName;
    public String givenName;
    public String address;
    //フィールドをコンストラクタ
    public Kato_Chapter17(String familyName, String givenName, String address) {
        this.familyName = familyName;
        this.givenName  = givenName;
        this.address    = address;
    }

    //ここでメソッドを定義（作成）
    //１．共通の紹介メソッド
    public void commonIntroduce() {
        System.out.println("私の名前は" + familyName + givenName + "です");;
    }
    //個別の具体的な紹介の為の抽象メソッド（abstract=抽象メソッドになる）
    public abstract void eachIntroduce();
    //自己紹介実行メソッド（execIntroduce=実行するためのメソッド名）
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }//ブロック内に実行したいメソッドを入力することで実行可能となる
}

