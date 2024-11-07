public class HomePhone {
    private String model;
    private String facture;

    public String getModel() {
        return model;
    }

    public String getfacture() {
        return facture;
    }

    public HomePhone(String model, String manufacturer) {
        this.model = model;
        this.facture = manufacturer;

    }

    public static void handlePhoneType(String phoneType) {
        if ("home".equalsIgnoreCase(phoneType)) {
            System.out.println("Обработка домашнего телефона: подключение через фиксированную линию ");
        } else if ("mobile".equalsIgnoreCase(phoneType)) {
            System.out.println("Обработка сотового телефона: отправка данных через мобильную сеть ");
        } else {
            System.out.println("Неизвестный тип телефона");
        }
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Звонок на номер: " + phoneNumber + "\nС телефона модели: " + this.model);
    }

    public final void sendMessage(String phoneNumber, String message) {
        System.out.println("Отправка сообщения на номер: " + phoneNumber + "\nСообщение: " + message);
    }
}
