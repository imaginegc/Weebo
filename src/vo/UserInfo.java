package vo;

import java.util.List;

public class UserInfo {
	public int userID;
	public String userName;
	//�û�ͷ���ַ
	public String profileUrl;
	//�û�ͷ�����Ű��ַ
	public String thumbNailUrl;
	public List<UserInfo> followers;
	public List<UserInfo> followings;
}
