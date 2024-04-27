package kadai_017;
    class KatoTaro_Chapter17 extends Kato_Chapter17 {
        public KatoTaro_Chapter17() {
            super("加藤", "太郎", "東京都中野区");
        }
        //名を表すフィールドセットのメソッド
        public void setGivenName(String name) {
            givenName = name;
        }
        //個別の紹介を出力するメソッドの実装
        public void eachIntroduce() {
            System.out.println("私はJavaが得意です");
        }
    }


