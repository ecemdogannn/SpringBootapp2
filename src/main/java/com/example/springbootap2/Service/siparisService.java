package com.example.springbootap2.Service;

import com.example.springbootap2.Entity.siparis;

import java.util.List;

public interface siparisService {
    List<siparis> findAll();
    siparis save (siparis theSiparis);
    siparis findById (int theId);
    void deletebyId (int theId);
}
