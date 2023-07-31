package logistics.giaglobal.app.shipmentstatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logistics.giaglobal.app.shipment.ShipmentRepository;

@Service
public class ShipmentStatusService {
	@Autowired
	private ShipmentStatusRepository shipmentStatusRepository;
	
	
	public List<ShipmentStatus> addShipmentStatuses(List<ShipmentStatus> shipmentStatuses) {
		return (List<ShipmentStatus>) shipmentStatusRepository.saveAll(shipmentStatuses);
	}
	
	public List<ShipmentStatus> getShipmentStatuses() {
		return (List<ShipmentStatus>) shipmentStatusRepository.findAll();
	}
}
