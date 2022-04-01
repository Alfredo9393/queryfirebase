package com.mx.totalplay.tradeinformation.services.impl;

import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import com.google.api.core.ApiFuture;
import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Component;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.DocumentReference;
import com.mx.totalplay.tradeinformation.FirebaseMethods;
import com.mx.totalplay.tradeinformation.services.InformationServices;

@Component
public class InformationServiceImpl implements InformationServices, FirebaseMethods {

    @Override
    public Object get_information(String trade_identifier) throws ExecutionException, InterruptedException {

        Map<String, Object> address_object = new HashMap<>();
        Map<String, Object> result_object = new HashMap<>();

        DocumentReference reference_object = get_trade(trade_identifier);
        ApiFuture<DocumentSnapshot> future_object = reference_object.get();
        DocumentSnapshot document_object = future_object.get();

        String field_name = new JSONObject(document_object.getData()).getString("name");
        JSONObject field_address = new JSONObject(document_object.getData()).getJSONObject("address");

        address_object.put("formattedAddress", field_address.getString("formattedAddress"));
        address_object.put("postalCode", field_address.getString("postalCode"));
        address_object.put("streetname", field_address.getString("streetname"));
        address_object.put("streetnumber", field_address.getString("streetnumber"));
        address_object.put("town", field_address.getString("town"));

        result_object.put("name", field_name);
        result_object.put("address", address_object);

        return result_object;

    }
}
