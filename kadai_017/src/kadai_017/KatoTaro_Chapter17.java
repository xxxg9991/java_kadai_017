package kadai_017;
    public abstract class KatoTaro_Chapter17 extends Kato_Chapter17 {
        public KatoTaro_Chapter17(String familyName, String givenName, String address) {
            super(familyName, givenName, address);
        }
        // setGivenNameメソッドをオーバーライドして実装
        @Override
        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }

        //eachIntroduce();を実行するメソッド
        public void eachIntroduce() {
            System.out.println("私の名前は" + familyName + givenName + "です");
            System.out.println("住所は" + address + "です");
            System.out.println("Javaが得意です");
        }
    }

