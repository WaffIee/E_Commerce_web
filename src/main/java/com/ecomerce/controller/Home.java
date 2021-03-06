package com.ecomerce.controller;

import com.ecomerce.dao.productDao;
import com.ecomerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by bajjouk wafaa on 16/5/2021.
 */

@Controller
public class Home {
    @Autowired
    private productDao productDao;


    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Product> products = productDao.GetAll();
        model.addAttribute("products", products);

        return "productList";
    }


    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException {

        Product product = productDao.GetProduct(productId);
        model.addAttribute(product);

        return "viewProduct";
    }
}
