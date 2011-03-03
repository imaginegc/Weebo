package vo;

import java.util.List;

public class MicroBlog {
	//用户信息
	public int userID;
	public  String userName;
	//用户图像为缩放版图片
	public String userPhoto;
	//发布日期
	public String publishTime;
	//微博内容(纯文字内容)
	public String cotent;
	//微博回复
	public List<Comment> comments;
	//原图片地址
	public String link;
	//缩放图片地址
	public String thumbNailLink;
	//链接(可能为多个)
	public String[] href;
	//微博ID
	public int blogID;
	//favor数量(可以使收藏数量或者喜欢数量)
	public int favorCount;
	//回复数量
	public int commentCount;
	//转发数量
	public int repostCount;
}
