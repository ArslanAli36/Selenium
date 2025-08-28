package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LNE_articles{

   // assets, organic, body, management, man, brands, job, nails, health_medicine, technology, testimonials, trends, face 

    WebDriver driver;

    @FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/div[2]/a")
    WebElement articles;
    
    @FindBy(xpath="/html/body/div/div[2]/div/div[2]/div[1]/nav/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/ul[1]/li")
    WebElement list;
    
    @FindBy(id="exampleForm.SelectCustom")
    WebElement theme;
    
    @FindBy(id="1")
    WebElement assets;

    @FindBy(id="27")
    WebElement organic;    

    @FindBy(id="17")
    WebElement body;

    @FindBy(id ="22")
    WebElement management;
    
    @FindBy(id="36")
    WebElement man;
    
    @FindBy(id="37")
    WebElement brands;
  
    @FindBy(id="6")
    WebElement job;

    @FindBy(id="38")
    WebElement nails;

    @FindBy(id="14")
    WebElement health_medicine;
    
    @FindBy(id="15")
    WebElement technology;
    
    @FindBy(id="41")
    WebElement testimonials;
    
    @FindBy(id="39")
    WebElement trends;
    
    @FindBy(id="40")
    WebElement face;
    
    @FindBy(xpath="//*[@id=\"exampleForm.SelectCustom\"]")
    WebElement theme_dropdown;
    

    public LNE_articles(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

      
    public void click_articles(){

        articles.click();
     }
    
    
    public void select_article(WebDriver driver, int strArticle){

        //  Select select_article= new Select(list);  /// Element should have been "select" but was "li"
        //  select_article.selectByIndex(strArticle);
    	
    	if(strArticle==1)
        assets.click();
    	
    	if(strArticle==27)
    		organic.click();
    	
    	if(strArticle==17)
            body.click();
    	
    	if(strArticle==22)
            management.click();
    	
    	if(strArticle==36)
            man.click();
    	
    	if(strArticle==37)
            brands.click();
    	
    	if(strArticle==6)
            job.click();
    	
    	if(strArticle==38)
            nails.click();
    	
    	if(strArticle==14)
            health_medicine.click();
    	
    	if(strArticle==15)
    		technology.click();
    	
    	if(strArticle==41)
            testimonials.click();
    	
    	if(strArticle==39)
    		trends.click();
    	
    	if(strArticle==40)
            face.click();
    	
    }
   
    public void select_theme(WebDriver driver, String strArticle){
    	
            Select select_theme = new Select(theme); 
            select_theme.selectByValue(strArticle);
    }
 

}























