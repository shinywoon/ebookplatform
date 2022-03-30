package com.example.EbookEc.Service;

import com.example.EbookEc.Repository.EbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookService {

    @Autowired
    EbookRepository ebookRepository;
}
