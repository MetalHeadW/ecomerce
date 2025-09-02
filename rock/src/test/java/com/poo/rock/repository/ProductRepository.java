package com.poo.rock.repository;

import com.poo.rock.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
    Optional<ProductModel> findByCdProduto(int cdProduto);
    Optional<ProductModel> findByNmProduto(String nmProduto);
    Optional<ProductModel> findAllByCdProduto(int cdProduto);

    }

}
