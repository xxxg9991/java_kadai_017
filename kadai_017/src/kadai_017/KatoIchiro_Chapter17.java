package kadai_017;
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
    //引き継ぎたいフィールドを設定→super（小インスタンスが親インスタンスにアクセスるための予約語）
    public KatoIchiro_Chapter17(String familyName, String givenName, String address) {
        super(familyName, "一郎", address);
    }
    //オーバーライド→抽象メソッド（eachIntroduce）を具体的に実装
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物は林檎です");
    }
}
