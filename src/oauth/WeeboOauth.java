/*WeeboOauth 是sinaOauth和BuzzOauth的父类
*/
package oauth;

public class WeeboOauth {
	public static String CONSUMER_KEY;
	public static String CONSUMER_SECRET;
	private static WeeboOauth wo;
	
	public WeeboOauth(){	
	}
	
	public static WeeboOauth getInstance(){
		if(wo == null)
			return new WeeboOauth();
		return wo;
	}
	
	public static void Oauth(){
		
	}
}
