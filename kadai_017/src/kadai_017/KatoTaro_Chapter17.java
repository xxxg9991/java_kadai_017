package kadai_017;
    public class KatoTaro_Chapter17 extends Kato_Chapter17 {
        public KatoTaro_Chapter17(String familyName, String givenName, String addrees) {
            //各子クラスのコンストラクタで super() を使用して親クラスのコンストラクタを呼び出している。その際、givenName を固定の値で設定している。そのため、setGivenName() メソッドは不要
            super(familyName, "太郎", addrees);
        }
        //自己紹介のメソッド→親クラス内の抽象メソッドを子クラスで実装→ここでオーバーライド
        public void eachIntroduce () {
            System.out.println("私はJavaが得意です");
        }
    }

