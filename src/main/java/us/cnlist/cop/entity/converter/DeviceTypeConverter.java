package us.cnlist.cop.entity.converter;

import us.cnlist.cop.entity.DeviceType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class DeviceTypeConverter implements AttributeConverter<DeviceType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DeviceType attribute) {
        return attribute.getValue();
    }

    @Override
    public DeviceType convertToEntityAttribute(Integer dbData) {
        return DeviceType.find(dbData);
    }
}
