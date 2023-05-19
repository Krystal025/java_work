package test.dto;

public class FriendsDto {
	
	private int num;
	private String name;
	private int height;
	private boolean major;
	
	public FriendsDto() {}

	public FriendsDto(int num, String name, int height, boolean major) {
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

	public boolean isMajor() {
		return major;
	}

	public void setMajor(boolean major) {
		this.major = major;
	}
	
	
	
}
