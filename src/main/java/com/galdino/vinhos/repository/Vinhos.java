package com.galdino.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galdino.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {

}
