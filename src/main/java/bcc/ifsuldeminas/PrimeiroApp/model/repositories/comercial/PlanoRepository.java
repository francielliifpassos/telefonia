package bcc.ifsuldeminas.PrimeiroApp.model.repositories.comercial;

import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
}
