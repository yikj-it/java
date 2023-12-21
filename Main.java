import java.util.Optional;

class Main {
  public static void main(String[] args) {

    SampleImmu sampleImmu = new SampleImmu("ind");
    sampleImmu.greet();
    String a = "asdf";
    String b = a.replaceAll("a", "bc");
    System.out.println(b);

    // Thread t = new Thread(
    //     new Runnable() {
    //         @Override
    //         public void run(){
    //             System.out.println("sub");
    //         }
    //     }
    // );
    // t.start();
    // System.out.println("main");
  }
}

class ExtendsThread extends Thread{
    @Override
    public void run(){
        System.out.println("a");
    }
}

class Sample {
    public static void main(String[] args){
        Thread t = new ExtendsThread();
        t.start();

        System.out.println("main");
    }
}

class OldTest {
    public static void main(String[] args){
        Optional<String> result = getFromArray(new String[]{"A","B",null},3);
        if(result.isEmpty()) {
            System.out.println("empty");
            return;
        }
        System.out.println(result.get());
    }

    private static<T> Optional<T> getFromArray(T[] array, int index) {
        if(array == null){
            return Optional.empty();
        }
        try{
            return Optional.ofNullable(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }
}


