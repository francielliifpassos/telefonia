package ifsuldeminas.telefonia.model.comercial;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CelularPrePago")
public class CelularPrePago extends Celular {
    private int diaDeVencimento;
}
