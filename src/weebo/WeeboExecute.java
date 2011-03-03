package weebo;

import java.util.List;

import vo.*;

public interface WeeboExecute {
	//type������������buzz��sina
	public String type = "";
	
	//getHomePost��ȡ�û���ҳ��΢��, num ����ָ�����ض�����΢��
	public List<MicroBlog> getHomePost(int num);
	
	//getUserPost��ȡָ���û���΢��, num ����ָ�����ض�����΢��
	public List<MicroBlog> getUserPost(int num, int userID);
	
	//getPublicPost��ȡ��ǰ������ҳ΢��, num ����ָ�����ض�����΢��
	public List<MicroBlog> getPublicPost(int num);

	//post��������һ��΢����userID��ʶ�û�ID��content��ʶ����
	public void post(int userID, String content);
	
	//post�������͵�΢������post��ͼƬ��΢���ݲ�ͳһ�ӿ�
	
	//getUserInfo������ȡ�û���Ϣ
	public UserInfo getUserInfo(int userID);
	
	//getFollowers������ȡ�û���follower
	public List<UserInfo> getFollowers(int userID);
	
	public List<UserInfo> getFollowings(int userID);
	
	//getComments������ȡָ��blog�Ļظ�
	public List<Comment> getComments(int blogID);
}	
