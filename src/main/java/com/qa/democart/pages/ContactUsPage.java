package com.qa.democart.pages;

import org.openqa.selenium.By;

public class ContactUsPage {
	public ContactUsPage() {
		System.out.println("ContactUsPage -- default const...");
	}
	
	private By inputName = By.id("input-name");
	private By emailId = By.id("input-email");
	
	public void getTitle() {
		System.out.println("ContactUsPage - title");
		System.out.println("page edited");
	}

}
