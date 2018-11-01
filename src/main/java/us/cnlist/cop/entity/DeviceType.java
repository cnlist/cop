package us.cnlist.cop.entity;

public enum DeviceType {
    UNKNOWN(-1, "Неизвестное устройство"),
    POWER_METER(1, "Счетчик электроэнергии"),
    WATER_METER(2, "Счетчик воды");

    private final int value;
    private final String description;

    DeviceType(int v, String russianDescription) {
        this.value = v;
        this.description = russianDescription;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static DeviceType find(int v) {
        for (DeviceType type : values()) {
            if (type.getValue() == v) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
