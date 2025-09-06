package com.poo.rock.repository;
import com.poo.rock.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {
    Optional<FuncionarioModel> findByCdFuncionario(int cdFuncionario);
    Optional<FuncionarioModel> findByNmFuncionario(String nnFuncionario);
    Optional<FuncionarioModel> findAllByCdFuncionario(int cFuncionario);

}