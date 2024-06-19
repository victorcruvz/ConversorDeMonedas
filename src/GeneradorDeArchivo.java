import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class GeneradorDeArchivo {
    public void guardarJson(Divisa divisa, String divisaAConvertir, double entrada, double resultado) throws IOException {
        //LocalDateTime datetime = LocalDateTime.now();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Date objDate = new Date();
        String strDateFormat = "dd-MMM-yyyy-hh-mm-ss";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);

        FileWriter escritura = new FileWriter(divisa.base_code()+"_"+objSDF.format(objDate)+".json");
        //escritura.write(gson.toJson(divisa));
        escritura.write(gson.toJson(entrada+" "+divisa.base_code()
        +" Convert to "+resultado+" "+divisaAConvertir));
        escritura.close();
    }
}
