package vo;

import java.util.List;

public class MicroBlog {
	//�û���Ϣ
	public int userID;
	public  String userName;
	//�û�ͼ��Ϊ���Ű�ͼƬ
	public String userPhoto;
	//��������
	public String publishTime;
	//΢������(����������)
	public String cotent;
	//΢���ظ�
	public List<Comment> comments;
	//ԭͼƬ��ַ
	public String link;
	//����ͼƬ��ַ
	public String thumbNailLink;
	//����(����Ϊ���)
	public String[] href;
	//΢��ID
	public int blogID;
	//favor����(����ʹ�ղ���������ϲ������)
	public int favorCount;
	//�ظ�����
	public int commentCount;
	//ת������
	public int repostCount;
}
