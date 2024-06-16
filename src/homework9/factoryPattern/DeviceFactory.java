package homework9.factoryPattern;

public class DeviceFactory {

    Device createNewDevice(DeviceType deviceType) {
        switch (deviceType) {
            case LAPTOP -> {
                return new Laptop();
            }

            case MOBILE_PHONE -> {
                return new MobilePhone();
            }
        }

        return null;
    }
}
