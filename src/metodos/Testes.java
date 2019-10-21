/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author FST
 */
public class Testes {

    public void parqueamento(String dataTabela, Time horaSistema, Time horaTabela , Double valorHora) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");

        
        //Manipulacao de datas, datas presentes dataHoje e a data presente e a dataPark e a data de lavantamento
        //dataHoje e a data do sistema
        Date dataHoje = new Date();
        
        //dataUtil e a data do sistema formatada para dd-MM-yyyy
        String dataUtil = dataFormat.format(dataHoje);

        
        //Aqui ele pega apenas os dias de cada data tanto do sistema com da tabela
        int diaSistema = dataHoje.getDay();
        int diaTabela = Integer.parseInt(dataTabela.substring(0, 1));

        //Aqui ele pega a hora sem minutos nem segundos da tabela e do sistema
        int horaTable = horaTabela.getHours();
        int horaSystem = horaSistema.getHours();
        
        
        //periodo de estadia e valor do correspondente ao parqueamento
        int periodo = 0;
        double valorTotal = 0;
        
        
        // Controlando datas e hora para obter o valor total correspondente ao parqueamento
        if ((diaSistema == diaTabela) && (horaTable > horaSystem)) {
            periodo = horaTable - horaSystem;
            valorTotal = periodo*valorHora;
            
            //podes colocar para gravar na base de dados o periodo e o valor correspondente
            System.out.println(periodo);
            System.out.println(valorTotal);
        } 
        
        else if ((diaSistema < diaTabela)) {
            horaTable = 24 - horaTable;
            periodo = horaTable + horaSystem;
            valorTotal = periodo*valorHora; 
            
            //podes colocar para gravar na base de dados o periodo e o valor correspondente
            System.out.println(periodo);
            System.out.println(valorTotal);
        } 
        
        else if (diaSistema > diaTabela) {
            System.out.println("A data introduzida e incorrecta!");
        }
    }

    public static void main(String[] args) {

    }

}
