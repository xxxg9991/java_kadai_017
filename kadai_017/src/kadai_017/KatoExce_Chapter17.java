package kadai_017;
public class KatoExce_Chapter17 {
    public static void main(String[] args) {
        KatoTaro_Chapter17 taro = new KatoTaro_Chapter17("加藤", "太郎", "東京都中野区") {
            @Override
            public void eachIntroduce() {
                super.eachIntroduce();
            }
        };
        taro.setGivenName("太郎");
        taro.eachIntroduce();

        KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17("加藤", "一郎", "東京都中野区") {
            @Override
            public void eachIntroduce() {
                super.eachIntroduce();
            }
        };
        ichiro.setGivenName("一郎");
        ichiro.eachIntroduce();

        KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17("加藤", "花子", "1東京都中野区") {
            @Override
            public void eachIntroduce() {
                super.eachIntroduce();
            }
        };
        hanako.setGivenName("花子");
        hanako.eachIntroduce();
        }
            }