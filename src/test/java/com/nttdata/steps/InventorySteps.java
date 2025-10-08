package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){

        /*
        if(this.driver.findElement(LoginPage.mensajeError).getText().equals("Error de autenticación.")){
            return "ERROR";
        }else{
            return "OK";
        }

         */
        return this.driver.findElement(InventoryPage.productsTitle).getText();

    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }
    /**
     * Hacer click en el CATEGORIAS
     */
    public void ClickCategorias(){
        this.driver.findElement(InventoryPage.CategoriaMenu).click();

        this.driver.findElement(InventoryPage.SubcategoriaMenu).click();
    }
    public void ClickPrimerProducto(){
        this.driver.findElement(InventoryPage.PrimerProducto).click();
    }
    public void CantidadProducto(String cantidad){

        this.driver.findElement(InventoryPage.CantidadProducto).clear();

        this.driver.findElement(InventoryPage.CantidadProducto).sendKeys(Keys.CONTROL + "a");
        this.driver.findElement(InventoryPage.CantidadProducto).sendKeys(Keys.DELETE);

        this.driver.findElement(InventoryPage.CantidadProducto).sendKeys(cantidad);
        this.driver.findElement(InventoryPage.AgregarCarrito).click();
    }
}
