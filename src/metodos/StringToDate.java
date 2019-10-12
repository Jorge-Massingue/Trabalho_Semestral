/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author FST
 */
public class StringToDate {

    public static LocalDate converterLocal(String date) {
        String[] dataSeparada = date.split("-");
        LocalDate hoje = LocalDate.of(Integer.parseInt(dataSeparada[0]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[2]));
        return hoje;
    }

    public static String converterData(Date data) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dataFormat.format(data);

    }

    public static Date converterString(String data) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return dataFormat.parse(data);

        } catch (Exception e) {
        }
        return null;

    }

}
