package real.dto;

public class FriendsDto {
	
	private int num;
	private String name;
	private int height;
	private String major;
	
	public FriendsDto() {}

	public FriendsDto(int num, String name, int height, String major) {
		super();
		this.num = num;
		this.name = name;
		this.height = height;
		this.major = major;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
