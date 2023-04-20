import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciarControlePonto {
    List<Funcionario> funcionarioList = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        GerenciarControlePonto gcp = new GerenciarControlePonto();
        Gerente g1 = new Gerente();
        Operador op1 = new Operador();
        Secretaria s1 = new Secretaria();
        g1.setNome("Marcos");
        g1.setDocumento("332233");
        g1.setIdFunc(1);
        g1.setSenha("password");
        g1.setLogin("gerenteboladao");
        g1.setEmail("marco.1992@gmil.com");
        op1.setNome("Leandro");
        op1.setIdFunc(2);
        op1.setDocumento("123456");
        op1.setEmail("Leandro.1990@gmail.com");
        op1.setValorHora(14.99);
        s1.setTelefone("1938038398");
        s1.setRamal("8398");
        s1.setNome("Carla");
        s1.setIdFunc(3);
        s1.setDocumento("654321");
        s1.setEmail("carla.1995@gmail.com");
        RegistroPonto rp1 = new RegistroPonto();
        rp1.setFunc(g1);
        rp1.setDataRegistro(LocalDate.now());
        rp1.setHoraEntrada(LocalDateTime.now());
        rp1.apresentarRegistroPonto();
        Thread.sleep(1000);
        RegistroPonto rp2 = new RegistroPonto();
        rp2.setFunc(op1);
        rp2.setDataRegistro(LocalDate.now());
        rp2.setHoraEntrada(LocalDateTime.now());
        rp2.apresentarRegistroPonto();
        Thread.sleep(1000);
        RegistroPonto rp3 = new RegistroPonto();
        rp3.setFunc(s1);
        rp3.setDataRegistro(LocalDate.now());
        rp3.setHoraEntrada(LocalDateTime.now());
        rp3.apresentarRegistroPonto();
        Thread.sleep(1000);
        rp1.setHoraSaida(LocalDateTime.now());
        rp1.apresentarRegistroPonto();
        Thread.sleep(1000);
        rp2.setHoraSaida(LocalDateTime.now());
        rp2.apresentarRegistroPonto();
        Thread.sleep(1000);
        rp3.setHoraSaida(LocalDateTime.now());
        rp3.apresentarRegistroPonto();

    }
}