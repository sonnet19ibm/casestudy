package Streams;

public class Flight {
	private int code;
	private String carrier;
	private String source;
	private String destination;
	
	public Flight() {
		
	}
	public Flight(int code,String carrier,String source,String destination) {
		this.code=code;
		this.carrier=carrier;
		this.source=source;
		this.destination=destination;
	}
	@Override
	public String toString() {
		return "Flight [code=" + code + ", carrier=" + carrier + ", source=" + source + ", destination=" + destination
				+ "]";
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int Code) {
		this.code = code;
	}
	public String getCarrier() {
		return carrier;
		
	}
	public void setCarrier(String carrier) {
		this.carrier=carrier;
	}


}
