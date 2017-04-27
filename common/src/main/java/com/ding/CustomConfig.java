package com.ding;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类说明:修改医生解绑、带关键字查询病例、短信验证码
 */
@Component
public class CustomConfig {
	 @Value("${CorpID}")
	 public String corpId;
	 public String getCorpId(){return corpId;}
	 
	 @Value("${CorpSecret}")
	 public String corpSecret;
	 public String getCorpSecret(){
		 return corpSecret;
	 }
	 
	 @Value("${SSOsecret}")
	 public String ssoSecret;
	 public String getSsoSecret(){
		 return ssoSecret;
	 }
	 
	 @Value("${AgentID}")
	 public String agentId;
	 public String getAgentId(){
		 return this.agentId;
	 }
	 
//	 @Value("${shortmessage.account}")
//	 public String shortMessageAccount;
//	 public String getShortmessageAccount(){
//		 return shortMessageAccount;
//	 }
//
//	 @Value("${shortmessage.key}")
//	 public String shortMessageKey;
//	 public String getShortmessageKey(){
//		 return shortMessageKey;
//	 }
//
//	 @Value("${shortmessage.channel}")
//	 public String shortMessageChannel;
//	 public String getShortmessageChannel(){
//		 return shortMessageChannel;
//	 }
//
//	 @Value("${shortmessage.url}")
//	 public String shortMessageUrl;
//	 public String getShortmessageUrl(){
//		 return shortMessageUrl;
//	 }
//
//	 @Value("${shortmessage.signature}")
//	 public String shortMessageSignature;
//	 public String getShortmessageSignature(){
//		 return shortMessageSignature;
//	 }
}
