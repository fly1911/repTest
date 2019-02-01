package snippet;

import java.util.Map;

import mm.utils.constant.WebCst;

import com.coe.ctcs.constant.ContextCst;
import com.coe.ctcs.rmi.kjy.KjyGrClient;
import com.coe.ctcs.util.Base64Ut;

public class EmsTest {
	public static void main(String[] args) {

		
		Map<String, String> valifyIdNumber = KjyGrClient.valifyIdNumber(
				"441621199312067027", "江健云");
		if (WebCst.SUCCESS.equals(valifyIdNumber.get(WebCst.MSG))) {
			String string = valifyIdNumber.get(ContextCst.DATA);
			Base64Ut.saveForJpg(string, "E:/testJava/jiang.jpg");
		}

	}


}
