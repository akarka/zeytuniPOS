package com.kadir.zeytuniPOS.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GecmisFiyatCreateDTO {
    private Integer urunId;
    private BigDecimal satisFiyati;
    private LocalDateTime tarih;

    public Integer getUrunId() {
        return urunId;
    }

    public void setUrunId(Integer urunId) {
        this.urunId = urunId;
    }

    public BigDecimal getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(BigDecimal satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public LocalDateTime getTarih() {
        return tarih;
    }

    public void setTarih(LocalDateTime tarih) {
        this.tarih = tarih;
    }
}
