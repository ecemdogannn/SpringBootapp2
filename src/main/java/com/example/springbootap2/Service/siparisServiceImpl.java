package com.example.springbootap2.Service;

import com.example.springbootap2.Entity.siparis;
import com.example.springbootap2.Repository.siparisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Bu anotasyon, sınıfın bir Spring Bean olduğunu ve servis katmanında bulunacağını belirtir.
// Ayrıca veri erişim ile sunum katmanları arasında köprü görevi görür.
@Service
public class siparisServiceImpl implements siparisService {
    private siparisRepository SiparişRepository;

    @Autowired
    public siparisServiceImpl(siparisRepository thesiparisRepository) {
        SiparişRepository = thesiparisRepository;
    }


    @Override
    public List<siparis> findAll() {
        return SiparişRepository.findAll();
    }




    @Override
    public siparis save(siparis theSiparis) {
        return SiparişRepository.save( theSiparis);
    }

    //optional Null değerlerin daha güvenli bir şekilde yönetir.
    @Override
    public siparis findById(int theId) {

        siparis theSiparis = null;
        Optional<siparis> byId = SiparişRepository.findById(theId);

        if (byId.isPresent()) {
            theSiparis = byId.get();
        }
        else{
            throw new RuntimeException("belirlenen ıd' de sipariş bulunamadı - " + theId);
        }
        return theSiparis;
    }




    @Override
    public void deletebyId(int theId) {
        SiparişRepository.deleteById(theId);
    }
}
