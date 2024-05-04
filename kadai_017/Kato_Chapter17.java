package kadai_017;
 abstract public class Kato_Chapter17 {
     //フィールドセット
     public String familyName = "加藤";
     public String givenName;
     public String address = "東京都中野区〇×";

     //共通紹介メソッド
     public void commonIntroduce() {
         System.out.println("名前は" + familyName + givenName + "です");
         System.out.println("住所は" + address + "です");
     }

     //個別紹介をする抽象メソッド
     abstract public void eachIntroduce();

     //紹介を実行するメソッド
     public void execIntrosuce() {
         commonIntroduce();
         eachIntroduce();
     }

}

