package models;

public class Package {
	
	int trackingID;
	private String originHub;
	private String destinationAddress;
	private String recipientName;
	private double height;
	private double width;
	private double weight;
	private double length;
	
	public Package(int trackingID, String originHub, String destinationAddress,
			String recipientName, double width, double height, double length, double weight) {
		this.trackingID = trackingID;
		this.originHub = originHub;
		this.destinationAddress = destinationAddress;
		this.recipientName = recipientName;
		this.width = width;
		this.height = height;
		this.length = length;
		this.weight = weight;
	}
	
	public String getOriginHub() {
		return originHub;
	}
	public void setOriginHub(String originHub) {
		this.originHub = originHub;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public int getPackageID() {
		return trackingID;
	}
	public void setPackageID(int packageID) {
		this.trackingID = packageID;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getTrackingID() {
		return trackingID;
	}
	public void setTrackingID(int trackingID) {
		this.trackingID = trackingID;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
}
