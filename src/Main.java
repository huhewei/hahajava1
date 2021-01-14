import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void save(String productName,int productPrice){
        System.out.println("=======我是添加产品的方法=======");
    }

    @Test
    public void testSave(){
        save("小米手机",123);

    }
}
