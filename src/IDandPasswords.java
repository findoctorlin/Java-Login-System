import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Apple","SteveJobs"); //put()方法存储键值对
		logininfo.put("Tesla","ElonMars");
		logininfo.put("Amazon","JeffBezos");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
