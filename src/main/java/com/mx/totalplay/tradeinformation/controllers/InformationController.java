package com.mx.totalplay.tradeinformation.controllers;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.mx.totalplay.tradeinformation.model.ImagesModel;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.concurrent.ExecutionException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mx.totalplay.tradeinformation.services.impl.InformationServiceImpl;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class InformationController extends InformationServiceImpl {


    @RequestMapping(value="/imagesfirebase",method= RequestMethod.POST)
    public Object imagesfirebase(@RequestBody ImagesModel body) throws ExecutionException, InterruptedException {
    	Object obj= getEmptyValue();
        if(body.getIdcommerce().equals("D1332_1")){
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_2")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_3")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_4")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_5")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_6")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        System.out.println("result "+obj);
        return obj;
    }

    @RequestMapping(value="/storequery",method= RequestMethod.POST)
    public Object storequery(@RequestBody ImagesModel body) throws ExecutionException, InterruptedException {
        Object obj= getEmptyValue();
        if(body.getIdcommerce().equals("D1332_1")){
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_2")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_3")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_4")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_5")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        if(body.getIdcommerce().equals("D1332_6")){
//            toSleep(1);
            obj=getDataDummy(body.getIdcommerce());
        }
        System.out.println("result "+obj);
        return obj;
    }
    
    public Object getDataDummy(String param){
        Map<String, Object> address_object = new HashMap<>();
        Map<String, Object> result_object = new HashMap<>();

        address_object.put("formattedAddress", param);
        address_object.put("postalCode", param);
        address_object.put("streetname", param);
        address_object.put("streetnumber",param);
        address_object.put("town", param);

        result_object.put("name", param);
        result_object.put("address", address_object);
        
        return result_object;
    }
    
    public Object getEmptyValue() {
    	Map<String, Object> result_object = new HashMap<>();
    	result_object.put("value", "empty");
    	return result_object;
    }
    
    public static void toSleep(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
        
    
}
