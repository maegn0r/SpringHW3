package ru.gb.hello.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.hello.entity.Product;
import ru.gb.hello.service.ProductService;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showSimpleForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "create-product";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
        public String processForm(Product product) {
            if(product.getId() == null) {
                productService.addProduct(product);
            } else {
                productService.editProduct(product);
            }
            return "redirect:/product/all";
        }
        @RequestMapping(path = "/all", method = RequestMethod.GET)
        public String getAllProducts (Model model){
        model.addAttribute("products",productService.findAll());
        return "product-list";
        }


//   @RequestMapping
//   public String printProduct(Model model){
//       model.addAttribute(productService.);
//        return "product";
//   }

    @ModelAttribute("info")
    public String info(){
        return "Additional information";
    }
}
