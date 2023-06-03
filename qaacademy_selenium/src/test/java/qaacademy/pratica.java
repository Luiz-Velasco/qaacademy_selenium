package qaacademy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratica {

    /**
     * @throws InterruptedException
     */
    @Test
    public void testeNavegador() throws InterruptedException{

        String coockie = "/html/body/div[2]/div/div/div[1]/button[1]";
        String cursoPresencial = "//*[@id='comp-k7g9c7sd1label']";
        String registrarInteresse = "//*[@id='comp-l7qnlauu']/a";
        String nome = "//*[@id='input_comp-k37gdip8']";
        String email = "//*[@id='input_comp-k37gdiq1']";
        String telefone = "//*[@id='input_comp-k37gdipq']";
        String Endereco = "//*[@id='input_comp-k37gdiqj']";
        String assunto = "//*[@id='input_comp-k37gdiqy']";
        String mensagem = "//*[@id='textarea_comp-k37gdirc']";
        String enviarMensagem = "//*[@id='comp-k37gdiro']/button";
        String fecharVerificacao = "//*[@id='CAPTCHA_DIALOG_ROOT_COMP']";

        WebDriver drive = new ChromeDriver();
        drive.get("https://www.qaacademy.com.br/");
        Thread.sleep(3000);

        drive.findElement(By.xpath(coockie)).click();
        Thread.sleep(1000);

        drive.findElement(By.xpath(cursoPresencial)).click();
        Thread.sleep(2000);

        drive.findElement(By.xpath(registrarInteresse)).click();
        Thread.sleep(1000);

        drive.findElement(By.xpath(nome)).click();
        Thread.sleep(2000);
        drive.findElement(By.xpath(nome)).sendKeys("Luiz Velasco");
        Thread.sleep(2000);

        drive.findElement(By.xpath(email)).click();
        drive.findElement(By.xpath(email)).sendKeys("luiz.velasco@qaacademy.com.br");
        Thread.sleep(2000);

        drive.findElement(By.xpath(telefone)).click();
        drive.findElement(By.xpath(telefone)).sendKeys("11 964470098");
        Thread.sleep(2000);

        drive.findElement(By.xpath(Endereco)).click();
        drive.findElement(By.xpath(Endereco)).sendKeys("Rua Bom Jesus 1018");
        Thread.sleep(2000);

        drive.findElement(By.xpath(assunto)).click();
        drive.findElement(By.xpath(assunto)).sendKeys("Curso de QA");
        Thread.sleep(2000);

        drive.findElement(By.xpath(mensagem)).click();
        drive.findElement(By.xpath(mensagem)).sendKeys("Quero fazer o curso de QA");
        Thread.sleep(2000);
        
        drive.findElement(By.xpath(enviarMensagem)).click();
        Thread.sleep(2000);
      //  drive.findElement(By.xpath(fecharVerificacao)).click();
      drive.quit();




    }
    

}
