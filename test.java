package Java;

public class test {

public int product(){
        int a =4, b=5, c=6;
        int result = a * b * c;
        return result;
    }

    public static void main(String[] args) {
        test obj = new test();
        System.out.println(obj.product());
    }
    
}
