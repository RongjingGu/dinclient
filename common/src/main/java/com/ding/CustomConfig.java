package com.ding;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类说明:得到配置文件中的内容
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
}
