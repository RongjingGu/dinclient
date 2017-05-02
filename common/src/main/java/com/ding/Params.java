package com.ding;


import com.sweetw.idata.commons.data.ListQueryCondition;
import com.sweetw.idata.commons.data.QueryCondition;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Params {

	private List<String> userids;

	private List<String> partyids;



	public  String arraysToForm(){
		StringBuffer sb = new StringBuffer();
		Field[] fields = this.getClass().getDeclaredFields();  
		  for (Field field : fields) {// --for() begin  
			  Class fc = field.getType();             
             if(fc.isAssignableFrom(List.class)){
            	// System.out.println(field.getName());
            	 String fieldName = field.getName();
            	 List list =  (List) invokeMethod(this,field.getName());
            	 for(int i = 0 ;i <list.size(); i++){
            		 sb.append(fieldName+"["+i+"]="+list.get(i)+"&");
            	 }
              }
		  }
		return sb.toString();
	}
	
	public Object invokeMethod(Object owner,String fieldName){
	  String methodName = fieldName.substring(0, 1).toUpperCase()+ fieldName.substring(1);

	  Class clz = owner.getClass();
	  
      Method method = null;
      try 
      {
          method = clz.getMethod("get" + methodName);
      } 
      catch (SecurityException e) 
      {
          //e.printStackTrace();
      } 
      catch (NoSuchMethodException e) 
      {
          // e.printStackTrace();
          return "";
      }

      //invoke getMethod
      try
      {
          return method.invoke(owner);
      } 
      catch (Exception e)
      {
          return "";
      }
	}

	public List<String> getUserids() {
		return userids;
	}

	public void setUserids(List<String> userids) {
		this.userids = userids;
	}

	public List<String> getPartyids() {
		return partyids;
	}

	public void setPartyids(List<String> partyids) {
		this.partyids = partyids;
	}
}
