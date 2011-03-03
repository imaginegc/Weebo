package vo;

import java.util.List;

public class UserInfo {
	public int userID;
	public String userName;
	//用户头像地址
	public String profileUrl;
	//用户头像缩放版地址
	public String thumbNailUrl;
	public List<UserInfo> followers;
	public List<UserInfo> followings;
}
