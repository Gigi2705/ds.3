package com.exemplo.api_produtos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.exemplo.api_produtos.model.Refeicao;
import com.exemplo.api_produtos.repository.RefeicaoRepository;

@RestController
@RequestMapping("/refeicoes")
public class RefeicaoController {

    private final RefeicaoRepository repository;

    public RefeicaoController(RefeicaoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Refeicao criar(@RequestBody Refeicao refeicao) {
        return repository.save(refeicao);
    }
    
    @GetMapping
    public List<Refeicao> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Refeicao buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Refeicao atualizar(@PathVariable Long id, @RequestBody Refeicao novaRefeicao) {
        return repository.findById(id).map(refeicao -> {
            refeicao.setIdAlimento(novaRefeicao.getIdAlimento());
            refeicao.setHorario(novaRefeicao.getHorario());
            refeicao.setQuantidade(novaRefeicao.getQuantidade());
            return repository.save(refeicao);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
