package weebo;

import java.util.List;

import vo.*;

public interface WeeboExecute {
	//type属性用于区分buzz和sina
	public String type = "";
	
	//getHomePost获取用户首页的微博, num 属性指定返回多少条微博
	public List<MicroBlog> getHomePost(int num);
	
	//getUserPost获取指定用户的微博, num 属性指定返回多少条微博
	public List<MicroBlog> getUserPost(int num, int userID);
	
	//getPublicPost获取当前公共主页微博, num 属性指定返回多少条微博
	public List<MicroBlog> getPublicPost(int num);

	//post方法发送一条微薄，userID标识用户ID，content标识内容
	public void post(int userID, String content);
	
	//post其他类型的微博，如post带图片的微博暂不统一接口
	
	//getUserInfo方法获取用户信息
	public UserInfo getUserInfo(int userID);
	
	//getFollowers方法获取用户的follower
	public List<UserInfo> getFollowers(int userID);
	
	public List<UserInfo> getFollowings(int userID);
	
	//getComments方法获取指定blog的回复
	public List<Comment> getComments(int blogID);
}	
