package com.ecomindo.common.util;

public class RecaptchaUtil {
	//TODO: Fix Authentication
	private static String url;
	private static String secretKey;
	private static String siteKey;
	
	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		RecaptchaUtil.url = url;
	}

	public static String getSecretKey() {
		return secretKey;
	}
	
	public static void setSecretKey(String secretKey) {
		RecaptchaUtil.secretKey = secretKey;
	}
	
	public static String getSiteKey() {
		return siteKey;
	}
	
	public static void setSiteKey(String siteKey) {
		RecaptchaUtil.siteKey = siteKey;
	}	
}
