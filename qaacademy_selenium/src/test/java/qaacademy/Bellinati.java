package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bellinati {


    String botaoInformeCpf = "//*[@id='PH_txtCPF']";
    String botaoSenha = "//*[@id='PH_txtSenha']";
    String botaoEntrar = "//*[@id='PH_btnLogin']";
    String botaoRelatorio = "//*[@id='ctl00_Menu_35']/nobr";
    String boleto = "//*[@id='frmGeral']/span[2]/div[2]";
    String cpfBoleto = "//*[@id='PH_txtCPF']";
    String senhaBoleto = "//*[@id='PH_txtSenha']";
    String botaoEntrarBoleto = "//*[@id='PH_btnLogin']";
    String botaoResumoRelatorio = "";
    String recovery = "//*[@id='PH_ddlBanco']/option[33]";
    String botaoBanco = "//*[@id='PH_ddlBanco']";
    String checkboxAnalitico = "//*[@id='PH_chkAnalitico']";
    String botaoSelecionar = "//*[@id='PH_btnSelecionar']";
    String contratoAleatorio = "//*[@id='PH_gvRel']/tbody/tr[76]/td[11]/a";
    String incluirNumero = "//*[@id='PH_txtTelefone']";
    String incluirDescricao = "//*[@id='PH_txtDescricaoTelefone']";
    String incluirTipo = "//*[@id='PH_ddlTipoTelefone']";
    String incluirCelular = "//*[@id='PH_ddlTipoTelefone']/option[4]";
    String botaoIncluirTelefone = "//*[@id='PH_btnCadFone']";
    String botaoOkSpan = "//*[@id='alert1684782193594_content']/div/div[2]/a/span/span";
    String abaEndereco = "//*[@id='ctl00_PH_rtsInformacoesContrato']/div/ul/li[2]/a/span/span/span";
    String abaAvalistas = "//*[@id='ctl00_PH_rtsInformacoesContrato']/div/ul/li[3]/a/span/span/span";
    String abaInformacoes = "//*[@id='ctl00_PH_rtsInformacoesContrato']/div/ul/li[4]/a/span/span/span";
    String abaAcompanhamentoJudicial = "//*[@id='ctl00_PH_rtsInformacoesContrato']/div/ul/li[5]/a/span/span/span";
    String abaTelefone = "//*[@id='ctl00_PH_rtsInformacoesContrato']/div/ul/li[1]/a/span/span/span";




  
    int tempoEspera = 2000;

    /**
     * @throws InterruptedException
     * 
     */
    @Test
    public void testeAberturaNavegador() throws InterruptedException{
        WebDriver drive = new ChromeDriver();
        drive.get("https://bpcob.bellinatiperez.com.br/");
        drive.manage().window().maximize();
        

 
       drive.findElement(By.xpath(botaoInformeCpf)).click();;
       Thread.sleep(1000);
       drive.findElement(By.xpath(botaoInformeCpf)).sendKeys("42693653827");
       Thread.sleep(1000);


       drive.findElement(By.xpath(botaoSenha)).click();
       drive.findElement(By.xpath(botaoSenha)).sendKeys("Itbroker@2026");
       Thread.sleep(1000);

       drive.findElement(By.xpath(botaoEntrar)).click();
       drive.findElement(By.xpath(botaoRelatorio)).click();
       drive.findElement(By.xpath(botaoRelatorio)).click();
       drive.get("https://relatorios-bpcob.bellinatiperez.com.br/RelContrato.aspx");

       drive.findElement(By.xpath(cpfBoleto)).click();;
       Thread.sleep(1000);
       drive.findElement(By.xpath(cpfBoleto)).sendKeys("42693653827");
       Thread.sleep(1000);
       drive.findElement(By.xpath(senhaBoleto)).click();
       drive.findElement(By.xpath(senhaBoleto)).sendKeys("Itbroker@2026");
       Thread.sleep(1000);

       drive.findElement(By.xpath(botaoEntrar)).click();
       Thread.sleep(2000);
       drive.findElement(By.xpath(botaoBanco)).click();
       Thread.sleep(1000);

       drive.findElement(By.xpath(recovery)).click();
       Thread.sleep(2000);
       drive.findElement(By.xpath(checkboxAnalitico)).click();
       Thread.sleep(2000);
       drive.findElement(By.xpath(botaoSelecionar)).click();
       Thread.sleep(1000);
       drive.findElement(By.xpath(contratoAleatorio)).click();
       Thread.sleep(1000);

       // teste de abas
       JavascriptExecutor js = (JavascriptExecutor) drive;
       js.executeScript("window.scrollBy(0,350)", "");
       drive.findElement(By.xpath(abaEndereco)).click();
       Thread.sleep(1000);
       drive.findElement(By.xpath(abaAvalistas)).click();
       Thread.sleep(1000);
       drive.findElement(By.xpath(abaInformacoes)).click();
       Thread.sleep(1000);
       drive.findElement(By.xpath(abaAcompanhamentoJudicial)).click();
       Thread.sleep(1000);
       drive.findElement(By.xpath(abaTelefone)).click();
       Thread.sleep(1000);
     //  js.executeScript("window.scrollBy(0,100)", "");
       Thread.sleep(1000);
       
        // final teste de abas


       drive.findElement(By.xpath(incluirNumero)).click();
       drive.findElement(By.xpath(incluirNumero)).sendKeys("(28) 999676656");

       drive.findElement(By.xpath(incluirDescricao)).click();
       drive.findElement(By.xpath(incluirDescricao)).sendKeys("Teste QA");

       drive.findElement(By.xpath(incluirTipo)).click();
       Thread.sleep(1000);
       drive.findElement(By.xpath(incluirCelular)).click();
       //drive.findElement(By.xpath(botaoIncluirTelefone)).click();
       Thread.sleep(1000);
      // drive.findElement(By.xpath(botaoOkSpan)).click();









 


      // drive.findElement(By.xpath(boleto)).click();




        
       


    }
}
