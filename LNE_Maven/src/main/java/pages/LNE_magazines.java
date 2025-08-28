package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LNE_magazines{

    WebDriver driver;

    @FindBy(xpath ="/html/body/div/div[2]/div/div[2]/div[1]/nav/div/div/div[3]/a")

    WebElement magazines_menu;
     
    @FindBy(xpath ="//*[@id=\"basic-navbar-nav\"]/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/ul/li[1]/a")

    WebElement published_magazines;

    @FindBy(xpath ="//*[@id=\"basic-navbar-nav\"]/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/ul/li[2]/a")

    WebElement subscribe;    

    @FindBy(id= "uncontrolled-tab-example-tab-les-nouvelles-esthetiques")

    WebElement new_aesthetics;

    @FindBy(id = "uncontrolled-tab-example-tab-spa-de-beaute")

    WebElement beauty_spa;
    
    @FindBy(id = "exampleForm.SelectCustom")  ///

    WebElement filter_by;

    
    @FindBy(xpath = "//*[@id=\"uncontrolled-tab-example-tabpane-1\"]/ul[1]/li[1]/div[1]/a")

    WebElement first_magazine;
    
    @FindBy(xpath = "//*[@id=\"uncontrolled-tab-example-tabpane-les-nouvelles-esthetiques\"]/ul[1]/li[1]/div[5]/div/div[1]/span")

    WebElement view_magazine;
    
    @FindBy(xpath = "//*[@id=\"uncontrolled-tab-example-tabpane-1\"]/ul[1]/li[1]/div[5]/div/div[2]/div")

    WebElement magazine_format;
    
    
    @FindBy(xpath = "//*[@id=\"product-typt\"]")

    WebElement format_button;
    
    @FindBy(xpath = "/html/body/div/div[2]/main/div/section/div/div[1]/div/div/div[1]/ul[1]/li[1]/div[5]/div/div[2]/div/div/a[1]")

    WebElement papier;
    
    @FindBy(xpath = "/html/body/div/div[2]/main/div/section/div/div[1]/div/div/div[1]/ul[1]/li[1]/div[5]/div/div[2]/div/div/a[2]")

    WebElement digital;
     
    @FindBy(xpath = "/html/body/div/div[2]/main/div/section/div/div[1]/div/div/div[1]/ul[1]/li[1]/div[5]/div/div[3]/div/a")

    WebElement add_to_cart;
       
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/button")

    WebElement continue_shopping;
    
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/span")

    WebElement see_basket;
    
    // https://lne21-git-master-nse.vercel.app/checkout?step=viewCart
    
    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div[2]/div[1]/div[1]/div/div/div[2]/div/div/ul/li/div/div[2]/div[1]/div[2]/button")

    WebElement delete_item;
    
    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div[2]/div[1]/div[1]/div/div/div[2]/div/div/ul/li/div/div[2]/div[2]/div[1]/input")

    WebElement quantity;
    
    @FindBy( xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/input")

    WebElement promo_code;
    
    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/button")

    WebElement promo_apply;
    
    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div[2]/div[2]/div[4]/button")

    WebElement validate_basket; 
    
    
    public LNE_magazines(WebDriver driver){

        this.driver = driver;

        // This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    
    public void selectMagazines(){

        magazines_menu.click();     
    }
    
    
    
    public void select_published_magazines(){

        published_magazines.click();     
    }
   
    

    public void selectSubscribe(){

     subscribe.click();

    }

    public void selectTab(String strType){

    	
    	if(strType == "The New Aesthetics")
    	new_aesthetics.click();
    	
    	if(strType == "Beauty Spa")
    	beauty_spa.click();

    	    }  

    public void selectYear(WebDriver driver, String strYear){

    	Select year_obj= new Select(filter_by);
   	  
  	    year_obj.selectByVisibleText(strYear);
        	
    }  

    
    public void view_magazine(){
         
    	view_magazine.click();

    } 
    
    public void selectFormat(WebDriver driver, String strFormat ){

    //	Select format_obj= new Select(magazine_format);
     	  
    //	format_obj.selectByVisibleText(strFormat);
    	
    	format_button.click();
    	
    	if(strFormat == "Papier" || strFormat == "Paper" )
        
    		papier.click();
        	
        if(strFormat == "Digital")
        
        	digital.click();
    	 
    } 
    	   
    
    public void add_to_cart(){ 

    	      add_to_cart.click();

    } 

    public void continue_shopping(){ 

    	continue_shopping.click();

    } 
    
    public void see_basket(){ 

    	see_basket.click();

    } 
    
    public void delete_cart_item(){ 

    	delete_item.click();

    }
    
    public void change_quantity(String strQuantity){ 

    	quantity.sendKeys(strQuantity);

    }
    
    public void promo_code(String strCode){ 

    //	promo_code.clear();
    	promo_code.sendKeys(Keys.BACK_SPACE);
    	promo_code.sendKeys(strCode);

    }
  
    public void promo_apply(){ 

    	promo_apply.click();

    }
    
    public void validate_basket(){ 

    	validate_basket.click();

    }
    
    
}














