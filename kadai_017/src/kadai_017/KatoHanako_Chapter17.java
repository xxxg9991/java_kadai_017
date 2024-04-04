package kadai_017;
public class KatoHanako_Chapter17 extends Kato_Chapter17 {
    //引き継ぎたいフィールドを設定→super（小インスタンスが親インスタンスにアクセスるための予約語）
    public KatoHanako_Chapter17(String familyName, String givenName, String address) {
        super(familyName, "花子", address);
    }
    //オーバーライド→抽象メソッド（eachIntroduce）を具体的に実装
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
