public class Display {

    private String frameRate;

    private DisplayMode mode;

    public DisplayMode getMode() {
        return mode;
    }

    public String getFrameRate() {
        return frameRate;
    }

    public Display(DisplayMode mode) {
        this.mode = mode;
    }

    public void showInfo(String info) {
        switch (mode) {
            case LOW_QUALITY:
                System.out.println("Низкое качество: " + info);
                break;
            case MEDIUM_QUALITY:
                System.out.println("Среднее качество: " + info);
                break;
            case HIGH_QUALITY:
                System.out.println("Высокое качество: " + info);
                break;
            default:
                System.out.println("Неизвестный уроыень качества отображения! ");

        }
    }
}
