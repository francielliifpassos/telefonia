package ifsuldeminas.telefonia.model.entity.comercial;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "CelularPrePago")
public class CelularPrePago extends Celular{
    private double saldo;
    @Temporal(TemporalType.DATE)
    private Date dataDeValidade;
}
