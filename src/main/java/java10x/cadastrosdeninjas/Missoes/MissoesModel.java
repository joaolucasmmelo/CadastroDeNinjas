package java10x.cadastrosdeninjas.Missoes;

import jakarta.persistence.*;
import java10x.cadastrosdeninjas.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    @OneToMany
    @JoinColumn(name = "ninja_id")
    private List<NinjaModel> ninja;

}
