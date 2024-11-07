public class Main {
    public static void main(String[] args) {
        HomePhone homePhone = new HomePhone("Iphone 14 pro max", "Apple");
        FeaturePhone featurePhone = new FeaturePhone("Nokia 3310", "Nokia");
        SmartPhone smartPhone = new SmartPhone("Gigaset A116", "Gigaset A116");

        HomePhone.handlePhoneType("Home");
        HomePhone.handlePhoneType("Mobile");
        HomePhone.handlePhoneType("Office");

        System.out.println("Модель: " + homePhone.getModel());
        System.out.println("Производитель: " + homePhone.getfacture());

        Display display = new Display(DisplayMode.HIGH_QUALITY);
        display.showInfo("Фотография открыта!");

        homePhone.makeCall("+996550081886");
        homePhone.sendMessage("+996550081886", "Привет!" + " Ты сделал домашку которую задал Нургазы байке? Можешь скинуть я скопирую, а то мне очень лень?");

    }
}