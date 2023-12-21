package be.ehb.petshopboys.controller;

import be.ehb.petshopboys.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    private final ProductDAO productDAO;

    @Autowired
    public IndexController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    /*
    @ModelAttribute("")
    public Iterable<Product> findAll() {
        return productDAO.findAll();
    }


    @GetMapping(value = {"/categories"})
    public String showCategories(ModelMap map) {
        return "categories";
    }

    @GetMapping(value = {"/products"})
    public String showProducts(ModelMap map) {
        return "products";
    }

    @GetMapping(value = {"/cart"})
    public String showCart(ModelMap map) {
        return "cart";
    }

    *
     */



}
