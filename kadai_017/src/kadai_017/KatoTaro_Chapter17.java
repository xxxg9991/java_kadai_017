package kadai_017;
    class KatoTaro_Chapter17 extends Kato_Chapter17 {
        public KatoTaro_Chapter17() {
            super("加藤", "太郎", "東京都中野区");
        }

        //引数なしのsetGivenNameメソッド
        @Override
        public void setGivenName() {
            super.setGivenName("太郎");
        }

            //個別の紹介を出力するメソッドの実装
            @Override
            public void eachIntroduce() {
                System.out.println("私の名前は" + familyName + givenName + "です");
                System.out.println("住所は" + address + "です");
                System.out.println("私はJavaが得意です");
            }
        }


