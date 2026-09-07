package de.karadag.assetdesk.device;

import jakarta.persistence.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.io.Serial;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String inventoryNumber;
    @Column(nullable = false,length = 100)
    private String manufacturer;
    @Column(nullable = false,length = 100)
    private String model;
    @Column(nullable = false,length = 100)
    private String serialNumber;
    @Column(nullable = false,length = 20)
    @Enumerated(EnumType.STRING)
    private DeviceCategory category;
    @Column(nullable = false,length = 20)
    @Enumerated(EnumType.STRING)
    private DeviceStatus status;
    @Column(nullable = false,insertable = false)
    private java.time.Instant createdAt;


    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setCategory(DeviceCategory category) {
        this.category = category;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public DeviceCategory getCategory() {
        return category;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }


}
