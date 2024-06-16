package homework9.factoryPattern;

public class DeviceTest {

    public static void main(String[] args) {
        DeviceFactory deviceFactory = new DeviceFactory();
        Device laptop = deviceFactory.createNewDevice(DeviceType.LAPTOP);
        Device mobilePhone = deviceFactory.createNewDevice(DeviceType.MOBILE_PHONE);

        laptop.readBook();
        laptop.listenMusic();
        laptop.watchVideo();

        mobilePhone.readBook();
        mobilePhone.listenMusic();
        mobilePhone.watchVideo();
    }
}
