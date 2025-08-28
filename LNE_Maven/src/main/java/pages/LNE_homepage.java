package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LNE_homepage {

    WebDriver driver;

    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[1]/ul/li[1]/a")

    WebElement search_icon;    

    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[1]/ul/li[2]/a")

    WebElement fb_icon;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[1]/ul/li[3]/a")

    WebElement instagram_icon;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[1]/ul/li[4]/a")

    WebElement yt_icon;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[3]/ul/li[1]/button")

    WebElement subscribe_button;
    
 //   @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[3]/ul/li[2]/a")

    @FindBy(css ="svg#Calque_1.loginIcon")
    
    WebElement user_icon;  
    
     
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[3]/ul/li[2]/div/div[1]/h3")

    WebElement user_name;
    
    
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[3]/ul/li[2]/div/div[2]/a")

    WebElement sign_out;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[3]/ul/li[3]/a")

    WebElement cart_icon; 
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[3]/ul/li[3]/div/div[2]/p/font/font")

    WebElement subtotal;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[1]/div/div/div[3]/ul/li[3]/div/div[3]/button")

    WebElement see_basket;
    
    // black strip
      
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[3]/div/p/a[1]")

    WebElement black_strip_link;
    
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div[3]/div/p/a[2]")

    WebElement close_black_strip;
    
    // Slider
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[1]/div/button[2]")

    WebElement right_button;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[1]/div/button[1]")

    WebElement left_button;
    
    @FindBy(xpath="")

    WebElement a;
    
    
    // News
   
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div[1]/div/ul/li[1]/h4/a")

    WebElement news_1;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div[1]/div/ul/li[2]/h4/a")

    WebElement news_2;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div[1]/div/ul/li[3]/h4/a")

    WebElement news_3;
    
    // A LA UNE
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div[2]/div/ul/li[1]/div/h3/a")

    WebElement heading_1;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div[2]/div/ul/li[2]/div/h3/a")

    WebElement heading_2;
    
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div[2]/div/ul/li[2]/div/div/a")

    WebElement eye_slash;
    
       
    // CONGRES
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[2]/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/a")

    WebElement congres_link;
    
    // LES+POPULAIRES
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[2]/div/div/div[2]/div[1]/ol/li[1]/h4/a")

    WebElement LES_1;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[2]/div/div/div[2]/div[1]/ol/li[2]/h4/a")

    WebElement LES_2;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[2]/div/div/div[2]/div[1]/ol/li[3]/h4/a")

    WebElement LES_3;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[2]/div/div/div[2]/div[2]/div/a")

    WebElement advert;
    
    @FindBy(xpath="//*[@id=\"AADIV51\"]/a")

    WebElement jE_black_button;
    
    // FORMATIONS
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[3]/div/ul/li[1]/div/a")

    WebElement formations_1;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[3]/div/ul/li[2]/div/a")

    WebElement formations_2;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[3]/div/ul/li[3]/div/a")

    WebElement formations_3;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[3]/div/ul/li[4]/div/a")

    WebElement formations_4;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[3]/div/div/a")

    WebElement formations_button;  
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[4]/div/div/div[1]/ul/li[1]/div[1]/button")

    WebElement video_1;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[4]/div/div/div[1]/ul/li[2]/div[1]/button")

    WebElement video_2; 
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[4]/div/div/div[1]/div[1]/a")

    WebElement les_videos_button;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[4]/div/div/div[1]/div[2]/div[1]/a")

    WebElement f_stats;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[4]/div/div/div[1]/div[2]/div[2]/a")

    WebElement in_stats;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[4]/div/div/div[1]/div[2]/div[3]/a")

    WebElement yt_stats;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[4]/div/div/div[1]/div[2]/div[4]/a")

    WebElement mag_stats;
    
    // last news
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/section[3]/div/div[3]/button")

    WebElement see_more_last_news;
    
    
    // the shop
    
    @FindBy(xpath="")

    WebElement la_boutique;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[5]/div/div[2]/a[1]")

    WebElement dvds_cds_button;
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/main/div/div[5]/div/div[2]/a[2]")

    WebElement books_button;
    
    
    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/footer/div/section/div/button")

    WebElement i_am_reg;
    
    
    
    public LNE_homepage(WebDriver driver){  // Constructor

        this.driver = driver;

        PageFactory.initElements(driver, this);  // This initElements method will create all WebElements

    }   

    
    public void search_header(){

    	search_icon.click();     
    }
    
    public void fb_header(){

    	fb_icon.click();     
    }
    
    public void instagram_header(){

    	instagram_icon.click();     
    }
    
    public void youtube_header(){

    	yt_icon.click();     
    }

    public void subscribe_header(){

    	subscribe_button.click();     
    }
    
    public void user_header(){

    	user_icon.click();     
    }
    
    
    public String get_user_name(){

    	return user_name.getText();     
    }
    
    public void sign_out(){

    	sign_out.click();     
    }
    
    public void cart_header(){

    	cart_icon.click();     
    }
    
    public void black_link(){

    	black_strip_link.click();     
    }
    
    public void close_strip(){

    	close_black_strip.click();     
    }
    
    public void move_right(){

    	right_button.click();     
    }
    
    public void move_left(){

    	left_button.click();     
    }
    
    
    
    
    public void selectVideos(){

 //       videos.click();     
    }
  
    public void selectLastNews(){

 //       last_news.click();     
    }
    
    public void selectLaBoutique(){

        la_boutique.click();     
    }
   
    









}












