package module_6.question_05;

// Q5: What will be the output?
public class Test5{
    public void Test5(){
        System.out.println("Constructor1");
    }
    public Test5(){
        System.out.println("Constructor2");
    }
    public static void main(String[] args) {
        Test5 t5 = new Test5();
    }
}