package com.axelor.contact.repo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.axelor.contact.db.Address;
import com.axelor.contact.db.Contact;
import com.axelor.contact.db.repo.ContactRepository;

public class ContactRepos extends ContactRepository{
	
	@Override
	public Map<String,Object> populate(Map<String,Object> json,Map<String,Object> context){
		if(!context.containsKey("json-enhance")) {
			System.out.println("end");
			return json;
		}
		
		try {
			Long id=(Long) json.get("id");
			Contact contact=find(id);
			Set<Address> emp=contact.getAddress();
			List<Address> list=new ArrayList();
			for(Address obj:emp)
			{
				list.add(obj);
			}
			
			json.put("addres", list);
		}catch(Exception e)
		{
			
		}
		
		return json;
	}

}
