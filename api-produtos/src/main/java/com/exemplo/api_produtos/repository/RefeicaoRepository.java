package com.exemplo.api_produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.api_produtos.model.Refeicao;

public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {
}
