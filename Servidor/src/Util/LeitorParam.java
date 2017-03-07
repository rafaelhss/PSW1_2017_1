package Util;

import com.sun.org.apache.bcel.internal.generic.RET;

public class LeitorParam {

	public static String leParametro(String recurso, int n){
		
		String p = recurso.substring(recurso.indexOf("?") + 1);
		String[] params = p.split("&");
		
		return params[n].split("=")[1];
	}
}
