package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validar_campos {

    String name = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    String lastName = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    String address = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    String email = "//*[@id='eid']/input";
    String telefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";
    String sexo = "//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input";
    String hobbies = "//*[@id='checkbox2']";
    String languages = "//*[@id='msdd']";
    String skills = "Skills";
    String api = "//*[@id='Skills']/option[6]";
    String selectContry = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"; 
    String contry = "//*[@id='select2-country-results']/li[5]";
    String ano = "//*[@id='yearbox']";
    String dataAno = "//*[@id='yearbox']/option[79]";
    String  mes = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select";
    String escolherMes = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select";
    
    



    /**
     * @throws InterruptedException
     */
    @Test
    public void preencherCampos() throws InterruptedException{
        WebDriver campo = new ChromeDriver();
        campo.get("https://demo.automationtesting.in/Register.html");

        campo.findElement(By.xpath(name)).click();
        campo.findElement(By.xpath(name)).sendKeys("Luiz");

        campo.findElement(By.xpath(lastName)).click();
        campo.findElement(By.xpath(lastName)).sendKeys("Velasco");

        campo.findElement(By.xpath(address)).click();
        campo.findElement(By.xpath(address)).sendKeys("Validação de campos para exercícios");

        campo.findElement(By.xpath(email)).click();
        campo.findElement(By.xpath(email)).sendKeys("luiz.velasco@gmail.com");

        campo.findElement(By.xpath(telefone)).click();
        campo.findElement(By.xpath(telefone)).sendKeys("11 96487-8956");

        campo.findElement(By.xpath(sexo)).click();
        campo.findElement(By.xpath(hobbies)).click();

       JavascriptExecutor js = (JavascriptExecutor) campo;
       js.executeScript("window.scrollBy(0,400)", "");

        campo.findElement(By.id(skills)).click();
        campo.findElement(By.xpath(api)).click();

        campo.findElement(By.xpath(telefone)).click(); 

        Thread.sleep(1000);
        campo.findElement(By.xpath(selectContry)).click();
        Thread.sleep(1000);
        campo.findElement(By.xpath(contry)).click();

        campo.findElement(By.xpath(telefone)).click();

        campo.findElement(By.xpath(ano)).click();
        campo.findElement(By.xpath(dataAno)).click();

        campo.findElement(By.xpath(ano)).click();
        campo.findElement(By.xpath(dataAno)).click();






       // campo.findElement(By.xpath(telefone)).click(); 





        //campo.findElement(By.xpath(languages)).sendKeys("Espanhol");



        












    }
}
