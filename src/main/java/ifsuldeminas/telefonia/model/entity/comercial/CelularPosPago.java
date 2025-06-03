package ifsuldeminas.telefonia.model.entity.comercial;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CelularPosPago")
public class CelularPosPago extends Celular{
    private int diaDeVencimento;
}
