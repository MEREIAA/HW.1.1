public class FeaturePhone extends HomePhone {

    public FeaturePhone(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void sendSMS(String phoneNumber, String massage) {
        System.out.println("Отправка  SMS на номер  " + phoneNumber + ": " + massage);
    }

    public void produce(int quantity) {
        System.out.println("Producing: " + quantity);
    }

    public String getInfo() {
        return "Model" + getModel() + "Facture" + getfacture();
    }
}
