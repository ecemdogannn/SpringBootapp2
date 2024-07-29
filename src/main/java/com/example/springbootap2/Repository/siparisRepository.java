package com.example.springbootap2.Repository;

import com.example.springbootap2.Entity.siparis;
import org.springframework.data.jpa.repository.JpaRepository;


// siparisRepository arayüzü JpaRepository arayüzünden türetilmiştir.
// JpaRepository arayüzü, Spring Data JPA tarafından sağlanan bir temel arayüzdür.
// veritabanı işlemleri için bir dizi kullanışlı metod sunar.
// CRUD işlemlerini otomatik olarak sağlar. bu sayede kod oldukça kısalır.
// iki tür parametresi alır.(varlık ve varlık sınıfının id alan türü )
// siparis = entity (bu proje içinde)

     public interface siparisRepository extends JpaRepository<siparis, Integer> {

    }

