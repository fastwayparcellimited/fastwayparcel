package logistics.giaglobal.app.shipmentstage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShipmentStage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipmentStageId;
	private String shipmentStage;
	
	public int getShipmentStageId() {
		return shipmentStageId;
	}
	public void setShipmentStageId(int shipmentStageId) {
		this.shipmentStageId = shipmentStageId;
	}
	public String getShipmentStage() {
		return shipmentStage;
	}
	public void setShipmentStage(String shipmentStage) {
		this.shipmentStage = shipmentStage;
	}
	
	
}
