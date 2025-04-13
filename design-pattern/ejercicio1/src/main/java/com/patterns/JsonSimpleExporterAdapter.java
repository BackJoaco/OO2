package com.patterns;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleExporterAdapter extends VoorheesExporter {
    @Override
    public String exportar(List<Socio> socios) {
        JSONArray jsonArray = new JSONArray();

        for (Socio socio : socios) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("legajo", socio.getLegajo());
            jsonObject.put("nombre", socio.getNombre());
            jsonObject.put("email", socio.getEmail());
            jsonArray.add(jsonObject);
        }

        return jsonArray.toJSONString();
    }
}   
