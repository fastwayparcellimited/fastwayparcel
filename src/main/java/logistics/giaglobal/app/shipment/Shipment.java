package logistics.giaglobal.app.shipment;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import logistics.giaglobal.app.country.Country;
import logistics.giaglobal.app.shipmentstage.ShipmentStage;
import logistics.giaglobal.app.shipmentstatus.ShipmentStatus;

@Entity
public class Shipment {

	@Id
	@Column(length = 128)
	private String shipmentId;
	@OneToOne
	private ShipmentStatus shipmentStatus;
	@OneToMany
	private List<ShipmentStage> shipmentStages;
	private String shipmentDate;
	private String deliveryDate;
	private String shipmentMode;
	private String shipmentPackage;
	private String referenceCode;
	private String weight;
	private String serviceType;
	private String senderName;
	@OneToOne
	private Country senderAddress;
	@OneToOne
	private Country shipmentDestination;
	private String receiverName;
	private String receiverAddress;
	private String receiverPhone;
	private String receiverEmail;
	private String senderPhone;
	private String senderEmail;

	public String getShipmentId() {
		return shipmentId;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public ShipmentStatus getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(ShipmentStatus shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public List<ShipmentStage> getShipmentStages() {
		return shipmentStages;
	}

	public void setShipmentStages(List<ShipmentStage> shipmentStages) {
		this.shipmentStages = shipmentStages;
	}

	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getShipmentMode() {
		return shipmentMode;
	}

	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}

	public String getShipmentPackage() {
		return shipmentPackage;
	}

	public void setShipmentPackage(String shipmentPackage) {
		this.shipmentPackage = shipmentPackage;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public Country getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(Country senderAddress) {
		this.senderAddress = senderAddress;
	}

	public Country getShipmentDestination() {
		return shipmentDestination;
	}

	public void setShipmentDestination(Country shipmentDestination) {
		this.shipmentDestination = shipmentDestination;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getSenderPhone() {
		return senderPhone;
	}

	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

}
