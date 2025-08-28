package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class youtube_pom {

	WebDriver driver;

    By video_search = By.id("search");
    By search_button = By.id("search-icon-legacy");  
      By first_link = By.xpath("//ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string\r\n"); // working
 //   By second_link = By.xpath("//ytd-video-renderer[2]/div[1]/div/div[1]/div/h3/a/yt-formatted-string\r\n"); // working
    
 //   By first_link = By.cssSelector("a[id='video-title']"); // working
 //   By second_link = By.cssSelector("a[id='video-title'][title='Lahore the Heart of Pakistan']"); // working
    
 //   By second_link = By.xpath("//*[@id='video-title' and @title='Lahore the Heart of Pakistan']");// working
    
 //   By play_pause = By.cssSelector("button[title='Play (k)']"); // working
 //   By next = By.cssSelector("a[title='Next (SHIFT+n)']"); // working
 //   By sound = By.cssSelector("button[title='Mute (m)']"); // working
    By autoplay = By.cssSelector("button[aria-label='Autoplay is off'][style-title='Autoplay is off']"); // not working
 //   By subtitles = By.cssSelector("button[title='Subtitles/closed captions (c)']"); // working
 //   By settings = By.cssSelector("button[aria-label='Settings'][aria-haspopup='true']"); // working
 //   By mini_player = By.cssSelector("button[title='Miniplayer (i)']"); // working
 //   By theatre_mode = By.cssSelector("button[title='Theater mode (t)']"); // working
 //   By full_screen = By.cssSelector("button[title='Full screen (f)']"); // working
    
    public youtube_pom(WebDriver driver){

        this.driver = driver;

    }
    
      public void video_search(String video_name){

    	          driver.findElement(video_search).sendKeys(video_name);
    	          driver.findElement(search_button).click();
    	          driver.findElement(first_link).click();
    	    //      driver.findElement(second_link).click();
    	    }
   

    public void flash_player(){

    //    driver.findElement(play_pause).click();
    //    driver.findElement(next).click();
    //    driver.findElement(sound).click();
        driver.findElement(autoplay).click();
    //    driver.findElement(subtitles).click();
    //    driver.findElement(settings).click();
    //    driver.findElement(mini_player).click();
    //    driver.findElement(theatre_mode).click();
    //    driver.findElement(full_screen).click();
    }
    
    public String get_Title(){

    	return driver.getTitle();

    }
}
