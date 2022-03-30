package com.example.EbookEc.Repository;

import com.example.EbookEc.Entity.Ebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EbookRepository extends JpaRepository<Ebook,Long> {

}
