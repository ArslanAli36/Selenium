package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.PageFactory;

public class LNE_signup{


    WebDriver driver;
    
    // 1st page
    
//  @FindBy(xpath="/html/body/div/div[2]/div/div[1]/div/div/div[3]/ul/li[2]") //error not working
    @FindBy(id="Calque_1")
    WebElement user_icon;

    @FindBy(id="clientType-tab-connexion")
    WebElement login_tab;
    
    
    @FindBy(id="clientType-tab-creation-compte")
    WebElement signup_tab;    
    
    @FindBy(xpath="/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/div/div/form/div[1]/div[1]/input")
    WebElement user_email;

    @FindBy(name="email_confirmation")
    WebElement email_confirm;
    
    @FindBy(xpath="/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/div/div/form/div[2]/div[1]/div/div/input")
    WebElement user_password;
    
    @FindBy(name="password_confirmation")
    WebElement password_confirm;
    
    @FindBy(xpath ="/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/div/div/form/div[2]/div[3]/button")
    WebElement signup;

    // 2nd page
    
    @FindBy(id ="MME")
//  @FindBy(css ="input#MME.form-check-input") 
    WebElement gender_female;
    

    @FindBy(id ="M")
 // @FindBy(css ="input#M.form-check-input")
    WebElement gender_male;
    
    @FindBy(name ="last_name")
    WebElement last_name;
    
    @FindBy(name ="first_name")
    WebElement first_name;
    
    @FindBy(name ="date")
    WebElement date_of_birth;
    
    @FindBy(name ="customer_activity_id")
    WebElement field_of_activity;
    
    @FindBy(name ="customer_postion_id")
    WebElement function;
    
    @FindBy(name ="customer_main_activities_id")
    WebElement main_activity;
    
    @FindBy(name ="100")
    WebElement beauty_ad;
    
    @FindBy(name ="101")
    WebElement congress_workshops;
    
    @FindBy(name ="102")
    WebElement training;
    
    @FindBy(name ="103")
    WebElement new_aesthetics;
    
    @FindBy(name ="105")
    WebElement offers;
    
    @FindBy(name ="104")
    WebElement beauty_spa;
    
    @FindBy( css ="")
    WebElement assets;
    
    @FindBy(id ="27")
    WebElement bio;
    
    @FindBy(id ="17")
    WebElement corps;
    
    @FindBy(id ="22")
    WebElement management;
    
    @FindBy(id ="36")
    WebElement man;
    
    @FindBy(id ="37")
    WebElement brand;
    
    @FindBy(css ="")
    WebElement job;
    
    @FindBy(id ="38")
    WebElement nails;
    
    @FindBy(id ="14")
    WebElement health_medicine;
    
    @FindBy(id ="15")
    WebElement technologies;
    
    @FindBy(id ="41")
    WebElement testimonials;
    
    @FindBy(id ="39")
    WebElement trends;
    
    @FindBy(id ="40")
    WebElement face;
      
    @FindBy(xpath ="/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/div/div/form/div/div[3]/button")
    WebElement chase_button;
    
   // 3rd page
    
    @FindBy(name ="delivery.societe")
    WebElement delivery_checkbox;
    
    @FindBy(name ="delivery.company_name")
    WebElement d_company_name;
    
    @FindBy(name ="delivery.company_tva")
    WebElement d_company_tva;
    
    @FindBy(name ="delivery.last_name")
    WebElement d_last_name;
    
    @FindBy(name ="delivery.first_name")
    WebElement d_first_name;
    
    @FindBy(css= "" )
    WebElement d_mrs;
    
    @FindBy(css ="")
    WebElement d_mr;
    
    @FindBy(name ="delivery.address1")
    WebElement d_address_1;
    
    @FindBy(name ="delivery.address2")
    WebElement d_address_2;
    
    @FindBy(name ="delivery.postcode")
    WebElement d_postcode;
    
    @FindBy(name ="delivery.city")
    WebElement d_city;
    
    @FindBy(name ="delivery.country_id")
    WebElement d_country;
    
    @FindBy(name ="delivery.phoneCountry")
    WebElement d_phoneCountry;
    
    @FindBy(name ="delivery.phone")
    WebElement d_phone;
    
    @FindBy(name ="delivery.facturation")
    WebElement d_facturation;
    
    @FindBy(name ="billing.societe")
    WebElement billing_checkbox;
    
    @FindBy(name ="billing.company_name")
    WebElement b_company_name;
    
    @FindBy(name ="billing.company_tva")
    WebElement b_company_tva;
    
    
    @FindBy(name ="billing.last_name")
    WebElement b_last_name;
    
    @FindBy(name ="billing.first_name")
    WebElement b_first_name;
    
    @FindBy(id ="html body div#__next div main div.jsx-4132666336.login div.jsx-4132666336.container div.jsx-4132666336.clientType div.tab-content div#clientType-tabpane-new.fade.tab-pane.active.show div.jsx-4132666336.step3 div.jsx-4132666336.registerBox10.addresses form.jsx-4132666336 div.jsx-4132666336.row div.jsx-2878636999.col-md-6 div.jsx-2878636999.profileFields div.jsx-2878636999.genderCheck div.mb-4.input-group div.form-check.form-check-inline input#billing.form-check-input")
    WebElement b_mrs;
    
    @FindBy(id ="html body div#__next div main div.jsx-4132666336.login div.jsx-4132666336.container div.jsx-4132666336.clientType div.tab-content div#clientType-tabpane-new.fade.tab-pane.active.show div.jsx-4132666336.step3 div.jsx-4132666336.registerBox10.addresses form.jsx-4132666336 div.jsx-4132666336.row div.jsx-2878636999.col-md-6 div.jsx-2878636999.profileFields div.jsx-2878636999.genderCheck div.mb-4.input-group div.form-check.form-check-inline input#billing.form-check-input")
    WebElement b_mr;
    
    @FindBy(name ="billing.address1")
    WebElement b_address_1;
    
    @FindBy(name ="billing.address2")
    WebElement b_address_2;
    
    @FindBy(name ="billing.postcode")
    WebElement b_postcode;
    
    @FindBy(name ="billing.city")
    WebElement b_city;
    
    @FindBy(name ="billing.country_id")
    WebElement b_country;
    
    @FindBy(name ="billing.phoneCountry")
    WebElement b_phoneCountry;
    
    @FindBy(name ="billing.phone")
    WebElement b_phone;
    
    @FindBy(id ="recevoir")
    WebElement recevoir;
    
    @FindBy(id ="compte")
    WebElement compte;
    
    @FindBy(xpath ="/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/div/div/form/div/div[4]/button")
   
    WebElement validate;
    
    public LNE_signup(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);  // This initElements method will create all WebElements

    }

    public void user_icon(){

    	user_icon.click();

      }  
    
    public void clickSignup(){

    	signup_tab.click();

      }  
    
    public void setEmail(String strEmail){  // Set user name in textbox

        user_email.sendKeys(strEmail);     
    }
  
    public void confirmEmail(String strEmail2){

        email_confirm.sendKeys(strEmail2);     
    }
   
    public void setPassword(String strPassword){  // Set password in password textbox

        user_password.sendKeys(strPassword);

    }

    public void confirmPassword(String strPassword2){

        password_confirm.sendKeys(strPassword2);

    }
    

    public void Signup(){

     signup.click();

    }

    public void signupToLNE(String strEmail,String strEmail2, String strPassword, String strPassword2){

       
        this.setEmail(strEmail);

        this.confirmEmail(strEmail2);
        
        this.setPassword(strPassword);
        
        this.confirmPassword(strPassword2);
        
        //Click Signup button

        this.Signup();           

    }
    
    // 2nd page
    
    public void select_gender(String strGender){

        if(strGender == "male")
        	
    	    gender_male.click();
        
        if(strGender == "female")
        
            gender_female.click();	
       }
    
    public void last_name(String strLast){
    
    	last_name.sendKeys(strLast);
    }
     
    public void first_name(String strFirst){
   
    	first_name.sendKeys(strFirst);
    }
    
    public void date_of_birth(String strDOB){
    
    	date_of_birth.sendKeys(strDOB);
    }
    
    public void field_activity(WebDriver driver, String strActivity){
    	
     Select field_activity= new Select(field_of_activity);
    
     field_activity.selectByVisibleText(strActivity);
    
    }
    
    public void select_function(WebDriver driver, String strFunction){
    	
    	Select select_function= new Select(function);
        
    	select_function.selectByVisibleText(strFunction);
    }
    
    public void main_activity(WebDriver driver, String strMain){
    	
    	Select select_main= new Select(main_activity);
        
    	select_main.selectByVisibleText(strMain);
    }
    
    public void receive_articles_offers(String strReceive){
         	
     if (strReceive == "100")	
     	beauty_ad.click();
     
     if (strReceive == "101")	
    	 congress_workshops.click();
     
     if (strReceive == "102")	
      	training.click();
     
     if (strReceive == "103")	
    	 new_aesthetics.click();
     
     if (strReceive == "105")	
      	offers.click();
     
     if (strReceive == "104")	
    	 beauty_spa.click();
   
    }
    
    public void my_interests(String strInterest){
     	
    if (strInterest == "1")
       assets.click();
    	   
    if (strInterest == "27")
    	bio.click();
    
    if (strInterest == "17")
        corps.click();
    
    if (strInterest == "22")
        management.click();
    
    if (strInterest == "36")
        man.click();
    
    if (strInterest == "37")
        brand.click();
    
    if (strInterest == "6")
        job.click();
    
    if (strInterest == "38")
        nails.click();
    
    if (strInterest == "14")
    	health_medicine.click();
    
    if (strInterest == "15")
        technologies.click();
    
    if (strInterest == "41")
        testimonials.click();
    
    if (strInterest == "39")
        trends.click();
    
    if (strInterest == "40")
        face.click();
     
    } 
    
    public void click_chase(){
        
    	chase_button.click();
    }
   
    
    // 3rd page
    
   
    public void delivery_checkbox(){
        
    	delivery_checkbox.click();
    }
    
   public void delivery_company_name(String strCompany){
        
    	d_company_name.sendKeys(strCompany);
    }
    
    public void delivery_company_tva(String strCompany){
        
    	d_company_tva.sendKeys(strCompany);
    }
    
    
    public void delivery_last_name(String strLastName){
        
    	d_last_name.sendKeys(strLastName);
    }
    
    public void delivery_first_name(String strFirstName){
        
    	d_first_name.sendKeys(strFirstName);
    }
    
    public void delivery_gender(String strGender){
        
      
     if(strGender == "female")
      d_mrs.click();
   
     if(strGender == "male")
	  d_mr.click();
   }
    
    public void delivery_address1(String strAddress1){
    
	  d_address_1.sendKeys(strAddress1);
   }   
    
    public void delivery_address2(String strAddress2){
    
	  d_address_2.sendKeys(strAddress2);
   }   
    
    public void delivery_code(String strCode){
        
      d_postcode.sendKeys(strCode);
   }  
    
    public void delivery_city(String strCity){
    
      d_city.sendKeys(strCity);
   }   
    
    public void delivery_country(WebDriver driver, String strCountry){ 
	    
 	   Select d_country_obj= new Select(d_country);
 	  
 	   d_country_obj.selectByVisibleText(strCountry);
 	   
    }
    
    public void delivery_country_code(WebDriver driver, String strCountry){  
 	    
 	   Select d_phoneCountry_obj= new Select(d_phoneCountry);
 	  
 	   d_phoneCountry_obj.selectByVisibleText(strCountry);
 	   
    }
    
    public void delivery_phone(String strPhone){
    
      d_phone.sendKeys(strPhone);
   }   
    
    
    public void click_delivery_fact(){
        
      d_facturation.click();
   }   
    
    public void billing_checkbox(){
        
	billing_checkbox.click();
   } 
   
    public void billing_company_name(String strCompany){
        
    	b_company_name.sendKeys(strCompany);
    }
    
    public void billing_company_tva(String strCompany){
        
    	b_company_tva.sendKeys(strCompany);
    }
    
    
   public void billing_last_name(String strLast){
    
	b_last_name.sendKeys(strLast);
   } 
    
   public void billing_first_name(String strFirst){
    
	b_first_name.sendKeys(strFirst);
   } 
    
   public void billing_gender(String strGender){
       
	      
	 if(strGender == "female")
	      b_mrs.click();
	   
	 if(strGender == "male")
		  b_mr.click();
	 
   }
   
   public void billing_address1(String strAddress1){
	    
	   b_address_1.sendKeys(strAddress1);
	  
   }
   
   public void billing_address2(String strAddress2){
	    
	   b_address_2.sendKeys(strAddress2);
	   
   }
   
   public void billing_code(String strCode){
	    
	  b_postcode.sendKeys(strCode);
	   
   }
   
   public void billing_city(String strCity){
	    
	   b_city.sendKeys(strCity);
	   
   }
   
      
   
   public void billing_country(WebDriver driver, String strCountry){ 
	    
	   Select b_country_obj= new Select(b_country);
	   
	   b_country_obj.selectByVisibleText(strCountry);
	   
   }
   
   public void billing_country_code(WebDriver driver, String strCountry){  
	    
	   Select b_phoneCountry_obj= new Select(b_phoneCountry);
	   
	   b_phoneCountry_obj.selectByVisibleText(strCountry);
	   
   }
   
   public void billing_phone(String strPhone){
	    
	   b_phone.sendKeys(strPhone);
	   
   }


   public void click_to_receive(){
	    
	   recevoir.click();
	   
   }

   public void click_account(){
	    
	   compte.click();
	   
   }

   public void click_vaildate(){
	    
	   validate.click();
	   
   }


}





















