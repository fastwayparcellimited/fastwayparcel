package logistics.giaglobal.app.shipment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logistics.giaglobal.app.shipmentstage.ShipmentStage;
import logistics.giaglobal.app.shipmentstage.ShipmentStageRepository;

@Service
public class ShipmentService {
	
	@Autowired
	private ShipmentRepository shipmentRepository;
	
	@Autowired
	private ShipmentStageRepository shipmentStageRepository;
	
	public Shipment addShipment(Shipment shipment) {
		List<ShipmentStage> shipmentStages = (List<ShipmentStage>) shipmentStageRepository.saveAll(shipment.getShipmentStages());
		shipment.setShipmentStages(shipmentStages);
		return shipmentRepository.save(shipment);
	}
	
	public Optional<Shipment> getShipment(String shipmentId) {
		return shipmentRepository.findById(shipmentId);
	}
	
	public List<Shipment> getShipments() {
		return (List<Shipment>) shipmentRepository.findAll();
	}
	
//	public List<Shipment> getShipmentByShipmentStage(String shipmentStage) {
//		return shipmentRepository.findByShipmentStageShipmentStage(shipmentStage);
//	}
	
	public void deleteShipment(String shipmentId) {
		shipmentRepository.deleteById(shipmentId);
	}

}
