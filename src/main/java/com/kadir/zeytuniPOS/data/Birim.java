package com.kadir.zeytuniPOS.data;

import jakarta.persistence.*;

@Entity
@Table(name = "Birimler")
public class Birim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BirimID")
    private Integer birimId;

    public Integer getBirimId() {
        return birimId;
    }

    public void setBirimId(Integer birimId) {
        this.birimId = birimId;
    }

    @Column(name = "BirimAdi", nullable = false, length = 50, unique = true)
    private String birimAdi;

    public String getBirimAdi() {
        return birimAdi;
    }

    public void setBirimAdi(String birimAdi) {
        this.birimAdi = birimAdi;
    }

}
