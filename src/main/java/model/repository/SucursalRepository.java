package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.domain.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
    List<Sucursal> findByPaisSucursal(String pais);

    List<Sucursal> findByNomSucursalContaining(String nombre);

    List<Sucursal> findByTipusSucursal(String tipo);

    List<Sucursal> findByPaisSucursalAndTipusSucursal(String pais, String tipo);
}