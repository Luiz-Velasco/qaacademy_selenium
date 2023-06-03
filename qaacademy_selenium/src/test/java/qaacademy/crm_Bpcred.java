package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crm_Bpcred {

    String botaoInformeCpf = "//*[@id='txtCPF']";
    String botaoSenha = "//*[@id='txtSenha']";
    String botaoEntrar = "//*[@id='btnOk']";
    String botaoBusca = "//*[@id='ctl00_ContentPlaceHolder1_txtContrato']";
    String botaoOk = "//*[@id='ctl00_ContentPlaceHolder1_btnOK']";

    @Test
    public void crmBpcred()throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://bpcred.bellinatiperez.com.br/login.aspx?ReturnUrl=%2f");
        driver.manage().window().maximize();

        driver.findElement(By.xpath(botaoInformeCpf)).click();;
        Thread.sleep(1000);
        driver.findElement(By.xpath(botaoInformeCpf)).sendKeys("42693653827");
        Thread.sleep(1000);
 
 
        driver.findElement(By.xpath(botaoSenha)).click();
        driver.findElement(By.xpath(botaoSenha)).sendKeys("Itbroker@2026");
        Thread.sleep(1000);
        driver.findElement(By.xpath(botaoEntrar)).click();

        driver.findElement(By.xpath(botaoBusca)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(botaoBusca)).sendKeys("CARLOS LEANDRO SILVA CARLOS");
        driver.findElement(By.xpath(botaoOk)).click();
        Thread.sleep(1000);

        driver.get("https://bpcred.bellinatiperez.com.br/");
        Thread.sleep(1000);

        driver.findElement(By.xpath(botaoBusca)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(botaoBusca)).sendKeys("94149500606");
        Thread.sleep(1000);
        driver.findElement(By.xpath(botaoOk)).click();
        Thread.sleep(1000);

        driver.get("https://bpcred.bellinatiperez.com.br/");
        Thread.sleep(1000);

        driver.findElement(By.xpath(botaoBusca)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(botaoBusca)).sendKeys("000000194648697");
        Thread.sleep(1000);
        driver.findElement(By.xpath(botaoOk)).click();






    }
    
}
