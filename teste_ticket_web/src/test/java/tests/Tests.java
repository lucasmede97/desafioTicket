package tests;

import config.BaseTest;
import org.junit.Test;
import pages.Page;

public class Tests extends BaseTest {

    //Desafio para criar email (gmail) com automa√ß√£o
    @Test
    public void preenchendoDadosObrigat√≥riosParaCadastroDeEmail(){
        Page page = new Page(driver);
        page.preencherCamposCriarConta();
        page.preencherCamposWelcome();
        page.aceiteDeTermos();
        page.screenshot();

    }

}
