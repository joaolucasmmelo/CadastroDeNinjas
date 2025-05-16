package java10x.cadastrosdeninjas.Ninjas;

import java.util.ArrayList;
import jakarta.persistence.*;
import java10x.cadastrosdeninjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // Many Ninjas to One Mission
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key / Chave estrangeira
    private MissoesModel missoes;

}
