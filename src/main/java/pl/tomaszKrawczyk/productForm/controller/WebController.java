package pl.tomaszKrawczyk.productForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.tomaszKrawczyk.productForm.Model.ProductForm;

import javax.validation.Valid;

/**
 * Created by Tomek Krawczyk on 14.04.2018.
 */



    @Controller
    public class WebController  {





        @GetMapping("/")
        public String showForm(ProductForm productForm) {
            return "form";
        }

        @PostMapping("/")
        public String checkProductInfo(@Valid ProductForm productForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

            if (bindingResult.hasErrors()) {
                return "form";
            }

            redirectAttributes.addFlashAttribute("product", productForm);
            return "redirect:/results";



        }

    @GetMapping("/results")
    public String getResults(){
        return "results";
    }
    }



