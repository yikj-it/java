public final class SampleImmu {

    // immutableなクラスの例
    // サブクラスを作成できず、コンストラクタで初期化した後はフィールドを更新することができない。

    private final String name;
    public SampleImmu(String name){
        this.name = name;
    }

    public void greet(){
        System.out.println("hello," + "world");
    }

}
