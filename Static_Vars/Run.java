package Static_Vars;

public class Run {
    public static void main(String[] args) {
        StaticVars stVar = new StaticVars();
        StaticVars stVar1 = new StaticVars();
        stVar.a = 5;
        System.out.println(stVar.a);
        stVar1.a = 10;
        System.out.println(stVar1.a);
        System.out.println(stVar.a);
        stVar.unstaticMethod();
        StaticVars.b = 10;
        System.out.println(StaticVars.b);
        StaticVars.staticMethod();
        stVar.b = 6;
        stVar1.b = 9;
        System.out.println(StaticVars.b);
        System.out.println(stVar.b);

    }
}
