package mdoel;

public class Home
{
	private int addNo;
	private String loc;
	private String style;
	private String paint;
	private String bhk;
	private String floor;
	private int rent;
	public int getAddNo() {
		return addNo;
	}
	public void setAddNo(int addNo) {
		this.addNo = addNo;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getPaint() {
		return paint;
	}
	public void setPaint(String paint) {
		this.paint = paint;
	}
	public String getBhk() {
		return bhk;
	}
	public void setBhk(String bhk) {
		this.bhk = bhk;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public home(int addNo, String loc, String style, String paint, String bhk, String floor, int rent) {
		super();
		this.addNo = addNo;
		this.loc = loc;
		this.style = style;
		this.paint = paint;
		this.bhk = bhk;
		this.floor = floor;
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "home [addNo=" + addNo + ", loc=" + loc + ", style=" + style + ", paint=" + paint + ", bhk=" + bhk
				+ ", floor=" + floor + ", rent=" + rent + "]";
	}
	
}
