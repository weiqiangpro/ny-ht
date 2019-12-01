package qt.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回的类
 * 
 * @author lfy
 * 
 */
public class logincheck {
	//状态码   100-成功    200-失败
	private int code;
	//提示信息
	private String msg;

	//用户要返回给浏览器的数据
	private Map<String, Object> extend = new HashMap<String, Object>();

	public static logincheck success(){
		logincheck result = new logincheck();
		result.setCode(100);
		try {
			result.setMsg(new String("处理成功".getBytes(),"utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static logincheck fail(){
		logincheck result = new logincheck();
		result.setCode(200);
		try {
			result.setMsg(new String("处理失败".getBytes(),"utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public logincheck add(String key, Object value){
		this.getExtend().put(key, value);
		return this;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
}
