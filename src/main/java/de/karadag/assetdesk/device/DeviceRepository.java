package de.karadag.assetdesk.device;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public  interface DeviceRepository  extends JpaRepository<Device,Long> {

   List<Device> findByStatus(DeviceStatus deviceStatus);
   boolean existsByInventoryNumber(String inventoryNumber);

}
