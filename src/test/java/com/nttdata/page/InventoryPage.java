package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    //public static By productsTitle = By.cssSelector("span.title");
    public static By productsTitle = By.cssSelector("li#category-3");

    //public static By itemsCards = By.cssSelector("div.inventory_item");
    public static By itemsCards = By.cssSelector("section.featured-products h2.products-section-title");

   public static By CategoriaMenu = By.id("category-3");
   public static By  SubcategoriaMenu = By.xpath("//ul[@class='category-sub-menu']//a[normalize-space(text())='Men']");

    public static By  PrimerProducto = By.cssSelector("#js-product-list .js-product:first-of-type a.product-thumbnail");
    public static By CantidadProducto = By.id("quantity_wanted");
    public static By AgregarCarrito =By.cssSelector("button.btn.btn-primary.add-to-cart");


}
