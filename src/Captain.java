public class Captain {
    private Captain() {}

    private static class HelperCaptain {
        private static Captain uniqueInstance = new Captain();
    }

    public static Captain getCaptain() {
        return HelperCaptain.uniqueInstance;
    }
}
