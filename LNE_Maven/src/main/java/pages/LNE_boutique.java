package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LNE_boutique{


    WebDriver driver;

    @FindBy(xpath ="/html/body/div/div[2]/div/div[2]/div[1]/nav/div/div/div[5]/a")

    WebElement boutique;
    
    @FindBy(xpath ="//*[@id=\"basic-navbar-nav\"]/div/div[5]/div/div/div/div/div[2]/div/div[1]/div/ul/li[1]")

    WebElement dvds_cds;

    @FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/div[5]/div/div/div/div/div[2]/div/div[1]/div/ul/li[2]/a")

    WebElement books;    

    @FindBy(id="Category")

    WebElement category;
    
    @FindBy(id="theme")

    WebElement theme;
    
    @FindBy(id="filterBy")

    WebElement sortBy;
  
    @FindBy(xpath="/html/body/div/div[2]/main/div/section[2]/div/div/div[1]/div[2]/ul/li/div[5]/div[2]/a")

    WebElement add_cart;
    
    @FindBy(xpath="/html/body/div/div[2]/main/div/section[2]/div/div/div[1]/div[2]/ul/li[2]/div[3]/div[2]/a")

    WebElement extract;
    
    @FindBy(id="productType-14")

    WebElement product_type;
    
    @FindBy(id="productType-4")

    WebElement product_type_2;
    
    @FindBy(xpath="/html/body/div/div[2]/main/div/section[2]/div/div/div[1]/div[2]/ul/li/div[2]/div[1]/h3/a")

    WebElement item_name;
    
    
    public LNE_boutique(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }


    public void selectBoutique(){

        boutique.click();
    }
    
    public void selectDvds(){

        dvds_cds.click();
    }


    public void selectBooks(){

        books.click();

    }

    public void selectCategory(WebDriver driver, String strCategory){

    	Select select_category= new Select(category);
        
    	select_category.selectByValue(strCategory);
    	

    }
    
    public void selectTheme(WebDriver driver, String strTheme){

        Select select_theme= new Select(theme);
        
    	select_theme.selectByValue(strTheme);

    }
    
    public void sortBy(WebDriver driver, String strSort){

        Select sort_by= new Select(sortBy);
        
        sort_by.selectByValue(strSort);

    }
    
    public void selectFormat(WebDriver driver, String strType){

       Select prod_type= new Select(product_type);
        
       prod_type.selectByValue(strType);

    }
    
    public void selectCart(){

        add_cart.click();

    }
    
    public void extract(){

        extract.click();

    }
    
    public String itemName(){

        return item_name.getText();

    }
    
    
    
    
    
    
    
}








