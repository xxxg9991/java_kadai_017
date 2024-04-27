package kadai_017;//メソッドを定義するためのクラス
    abstract class Kato_Chapter17 {
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
        //①共通の紹介　commonIntroduceメソッド
        public void commonIntroduce () {
            System.out.println("名前は" + familyName + givenName + "です");
            System.out.println("住所は" + address + "です");
        }
       //個別の紹介を実行する抽象メソッド
        abstract public void eachIntroduce();

        //紹介を実行するメソッド
        public void exceIntroduce() {
            commonIntroduce();
            eachIntroduce();
    }
}

