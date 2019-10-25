/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Model.Parqueamento;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import static metodos.StringToDate.converter;

/**
 *
 * @author FST
 */
public class Testes {

    public static double parqueamento(String dataTabela, String horaTabela, double preco) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        //Manipulacao de datas, datas presentes dataHoje e a data presente e a dataPark e a data de lavantamento
        //dataHoje e a data do sistema
        Date dataHoje = new Date();

        //dataUtil e a data do sistema formatada para dd-MM-yyyy
       // String dataUtil = dataFormat.format(dataHoje);
        String horaUtil = timeFormat.format(dataHoje);

        //Aqui ele pega apenas os dias de cada data tanto do sistema com da tabela
        int diaSistema = dataHoje.getDay();
        int diaTabela = Integer.parseInt(dataTabela.substring(0, 1));

        //Aqui ele pega a hora sem minutos nem segundos da tabela e do sistema
        int horaTable = converter(horaTabela);
        int horaSystem = converter(horaUtil);

        //periodo de estadia e valor do correspondente ao parqueamento
        int periodo = 0;
        double valorTotal = 0;

        // Controlando datas e hora para obter o valor total correspondente ao parqueamento
        if ((diaSistema == diaTabela) && (horaTable > horaSystem)) {
            periodo = horaTable - horaSystem;
            valorTotal = periodo * preco;

            //podes colocar para gravar na base de dados o periodo e o valor correspondente
            //System.out.println(periodo);
            return valorTotal;
        } else if ((diaSistema > diaTabela)) {
            horaTable = 24 - horaTable;
            periodo = horaTable + horaSystem;
            valorTotal = periodo * preco;

            //podes colocar para gravar na base de dados o periodo e o valor correspondente
            return valorTotal;
        } 
//        else if (diaSistema < diaTabela) {
//            System.out.println("A data introduzida e incorrecta!");
//        }
        return 0;
    }

    public static void main(String[] args) {
        String data = "22-10-2019";
        String hora = "12:02:02";
        parqueamento(data, hora, 150);
    }

}
