public final class SmartPhone extends HomePhone {

    public SmartPhone(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void installApp(String appName, String version) {
        System.out.println("Установка приложения " + appName + "версии:" + version);
        System.out.println("Приложение " + appName + "успешно установлено!");
    }

    public void launchApp(String appName) {
        System.out.println("Запуск приложения " + appName + "...");
        System.out.println("Приложение " + appName + "запущено!");
    }
}
