package models;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Autenticarse {

    String username;
    String password;
    public static List<Autenticarse> setData(DataTable dataTable){

        List<Autenticarse> dates = new ArrayList<>();
        List<Map<String,String>> mapInfo = dataTable.asMaps();

        for (Map<String,String> map:mapInfo){
            dates.add(new ObjectMapper().convertValue(map, Autenticarse.class));
        }
        return dates;
    }
}
