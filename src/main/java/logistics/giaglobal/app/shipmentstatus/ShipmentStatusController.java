package logistics.giaglobal.app.shipmentstatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentStatusController {
	@Autowired
	private ShipmentStatusService shipmentStatusService;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/shipmentstatuses")
	public List<ShipmentStatus> addShipmentStatuses(@RequestBody List<ShipmentStatus> shipmentStatuses) {
		return shipmentStatusService.addShipmentStatuses(shipmentStatuses);
	}
	
	@CrossOrigin(maxAge = 3600)
	@RequestMapping("/shipmentstatuses")
	public List<ShipmentStatus> getShipmentStatuses() {
		return shipmentStatusService.getShipmentStatuses();
	}
}
