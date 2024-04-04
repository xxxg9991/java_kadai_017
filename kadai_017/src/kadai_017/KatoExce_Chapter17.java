package kadai_017;
public class KatoExce_Chapter17 {
    public static void main(String[] args) {
        //子クラス太郎の抽象メソッドの実行コード
        KatoTaro_Chapter17 taro = new KatoTaro_Chapter17("加藤", "太郎", "東京都");
        taro.eachIntroduce();

        //以下、一郎
        KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17("加藤", "一郎", "大阪府");
        Ichiro.eachIntroduce();

        //以下花子
        KatoHanako_Chapter17 Hanako = new KatoHanako_Chapter17("加藤", "花子", "名古屋市");
        Hanako.eachIntroduce();
    }
}
