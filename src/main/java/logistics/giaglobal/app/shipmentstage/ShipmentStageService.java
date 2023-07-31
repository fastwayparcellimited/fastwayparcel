package logistics.giaglobal.app.shipmentstage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logistics.giaglobal.app.shipment.ShipmentRepository;

@Service
public class ShipmentStageService {
	@Autowired
	private ShipmentStageRepository shipmentStageRepository;
	
	public List<ShipmentStage> addShipmentStages(List<ShipmentStage> shipmentStages) {
		return (List<ShipmentStage>) shipmentStageRepository.saveAll(shipmentStages);
	}
	
	public List<ShipmentStage> getShipmentStages() {
		return (List<ShipmentStage>) shipmentStageRepository.findAll();
	}
	
	public void deleteShipmentStage(int shipmentStageId) {
		shipmentStageRepository.deleteById(shipmentStageId);
	}
}
