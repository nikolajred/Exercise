package Static_Vars;

public class StaticVars {
    int a;
    static int b = 5;
    public void unstaticMethod(){
        System.out.println("i'm unstatic method");
    }
    public static void staticMethod(){
        System.out.println("i'm static method");
    }
    public static int returnMethod(int a){
        int c = a*2;
        return c;
    }
}
