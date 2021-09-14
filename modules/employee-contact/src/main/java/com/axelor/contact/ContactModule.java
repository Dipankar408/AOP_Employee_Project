package com.axelor.contact;

import com.axelor.app.AxelorModule;
import com.axelor.contact.db.repo.ContactRepository;
import com.axelor.contact.repo.ContactRepos;

public class ContactModule extends AxelorModule{
	
	@Override
	public void configure() {
		bind(ContactRepository.class).to(ContactRepos.class);
	}
}
