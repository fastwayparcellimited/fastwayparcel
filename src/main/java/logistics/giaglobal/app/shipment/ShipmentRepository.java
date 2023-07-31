package logistics.giaglobal.app.shipment;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import logistics.giaglobal.app.shipmentstage.ShipmentStage;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, String> {
//	public List<Shipment> findByShipmentStageShipmentStage(String shipmentStage);
}
