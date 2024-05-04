package kadai_017;

public class KatoExec_Chapter17 {
    public static void main(String[] args) {
        // 加藤太郎の紹介
        KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
       System.out.println("加藤太郎の紹介");
       taro.setGivenName();
       taro.execIntrosuce();

        // 加藤一郎の紹介
        KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
        System.out.println("加藤一郎の紹介");
        ichiro.setGivenName();
        ichiro.execIntrosuce();

        // 加藤花子の紹介
        KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
        System.out.println("加藤花子の紹介");
        hanako.setGivenName();
        hanako.execIntrosuce();
    }
}
