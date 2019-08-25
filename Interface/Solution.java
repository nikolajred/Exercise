package Interface;
class Solution implements CanFly {
    public void canFly() {
        System.out.println("canfly");
    }
    public void fly() {
        System.out.println("fly");
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.canFly();
        solution.fly();
    }
}
/*interface CanFly {
    public void canFly();
    public void fly();
}*/
