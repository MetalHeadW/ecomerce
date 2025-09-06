package com.poo.rock.controller;

import com.poo.rock.dto.ProductDto;
import com.poo.rock.model.ProductModel;
import com.poo.rock.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    ProductRepository produtoRepository;

    @PostMapping
    public ResponseEntity<ProductModel> CriarProduto(@Valid @RequestBody ProductDto productDto) {
         var productModel = new ProductModel();

        BeanUtils.copyProperties(productDto, productModel);
         return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(productModel));
    }
    @GetMapping
    public ResponseEntity<List<ProductModel>> ListarProdutos() {
        return ResponseEntity.status(
                HttpStatus.OK).body(produtoRepository.findAll());

    }
}
