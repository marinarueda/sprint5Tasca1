package cat.itacademy.barcelonactiva.ruedaizquierdo.marina.s05.t01.n01.S05T01N01RuedaIzquierdoMarina.model.services;

import cat.itacademy.barcelonactiva.ruedaizquierdo.marina.s05.t01.n01.S05T01N01RuedaIzquierdoMarina.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.ruedaizquierdo.marina.s05.t01.n01.S05T01N01RuedaIzquierdoMarina.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.ruedaizquierdo.marina.s05.t01.n01.S05T01N01RuedaIzquierdoMarina.model.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class SucursalService {
    private final SucursalRepository sucursalRepository;


    @Autowired
    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    public void deleteSucursal(Integer id) {
        sucursalRepository.deleteById(id);
    }

    public void updateSucursal(SucursalDTO sucursalDTO) {
        Optional<Sucursal> optionalSucursal = sucursalRepository.findById(sucursalDTO.getPk_SucursalID());
        if (optionalSucursal.isPresent()) {
            Sucursal sucursal = optionalSucursal.get();
            sucursal.setNomSucursal(sucursalDTO.getNomSucursal());
            sucursal.setPaisSucursal(sucursalDTO.getPaisSucursal());
            sucursal.setTipusSucursal(sucursalDTO.getTipusSucursal());
            sucursalRepository.save(sucursal);
        }
    }

    public SucursalDTO getOne(Integer id) {
        Optional<Sucursal> optionalSucursal = sucursalRepository.findById(id);
        if (optionalSucursal.isPresent()) {
            Sucursal sucursal = optionalSucursal.get();
            return new SucursalDTO(sucursal.getPk_SucursalID(), sucursal.getNomSucursal(), sucursal.getPaisSucursal(), sucursal.getTipusSucursal());
        } else {
            System.out.println("La Sucursal no existe");
            return null;
        }
    }

    public List<Sucursal> getAllSucursals() {
        return sucursalRepository.findAll();
    }



    public void saveSucursal(SucursalDTO sucursalDTO) {
        Sucursal sucursal = new Sucursal();
        sucursal.setNomSucursal(sucursalDTO.getNomSucursal());
        sucursal.setPaisSucursal(sucursalDTO.getPaisSucursal());
        sucursal.setTipusSucursal(sucursalDTO.getTipusSucursal());

        sucursalRepository.save(sucursal);
    }




}
