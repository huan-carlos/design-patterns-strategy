package RetornoBoleto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Boleto {
    private int id;
    private String codBanco;
    private LocalDate dataVencimento;
    private LocalDateTime dataPagamento;
    private String cpfCliente;
    private double valor;
    private double multa;
    private double juros;
    private String agencia;
    private String contaBancaria;
}
