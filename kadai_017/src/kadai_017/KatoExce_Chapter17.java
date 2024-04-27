package kadai_017;
public class KatoExce_Chapter17 {
    public static void main(String[] args) {
        KatoTaro_Chapter17  taro    = new KatoTaro_Chapter17();
        KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
        KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();

        System.out.println("加藤太郎の紹介");
        taro.exceIntroduce();
        System.out.println();

        System.out.println("加藤一郎の紹介");
        ichiro.exceIntroduce();
        System.out.println();

        System.out.println("加藤花子の紹介");
        hanako.exceIntroduce();
    }
}
