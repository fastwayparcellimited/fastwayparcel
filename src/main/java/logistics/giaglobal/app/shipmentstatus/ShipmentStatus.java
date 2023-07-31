package logistics.giaglobal.app.shipmentstatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShipmentStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipmentStatusId;
	private String shipmentStatus;
	
	public int getShipmentStatusId() {
		return shipmentStatusId;
	}
	public void setShipmentStatusId(int shipmentStatusId) {
		this.shipmentStatusId = shipmentStatusId;
	}
	public String getShipmentStatus() {
		return shipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}
	
	

}
