public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern Demo");
        System.out.println("Trying to make a captain for our team");
        Captain c1 = Captain.getCaptain();
        System.out.println("New Captain " + c1 + " selected for our team");
        Captain c2 = Captain.getCaptain();
        System.out.println("Trying to make another Captain for your team c2 " + c2);
        if(c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        } else {
            System.out.println("c1 and c2 aren't same instance");
        }
    }
}