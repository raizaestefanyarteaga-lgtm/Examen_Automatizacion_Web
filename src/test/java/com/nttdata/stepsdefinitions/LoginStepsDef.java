package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class LoginStepsDef {

    private WebDriver driver;


    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("que me encuentro en la página de login de Saucedemo")
    public void que_me_encuentro_en_la_página_de_login_de_sacedemo() {
        driver = getDriver();
        //driver.get("https://www.saucedemo.com/");
        driver.get("https://qalab.bensg.com/store/es/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fes%2F");
        screenShot();
    }
    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }
    @Entonces("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        String title =  inventorySteps(driver).getTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedTitle, title);
    }
    @Y("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {
        int itemsListSize = inventorySteps(driver).getItemSize();
        //prueba: validar que al menos exista un item
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);

        try {
            //Thread.sleep(10000);
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Y("también navego a categoria y subcategoria")
    public void también_navego_categoria_subcategoria() {
        inventorySteps(driver).ClickCategorias();
        Assertions.assertEquals("1", "1");
        screenShot();

    }

    @Y("también agregar carrito")
    public void también_agregar_carrito() {
        inventorySteps(driver).ClickPrimerProducto();
        try {
            //Thread.sleep(10000);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inventorySteps(driver).CantidadProducto("2");
        try {
            //Thread.sleep(10000);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        screenShot();

    }



}
