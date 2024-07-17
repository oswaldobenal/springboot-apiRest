package com.juliandev.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliandev.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
