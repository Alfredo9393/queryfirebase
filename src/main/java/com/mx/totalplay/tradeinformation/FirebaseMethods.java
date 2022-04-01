package com.mx.totalplay.tradeinformation;

import com.google.cloud.firestore.DocumentReference;
import com.mx.totalplay.tradeinformation.firebase.FirebaseInitializer;

public interface FirebaseMethods {

    FirebaseInitializer firebase_object = new FirebaseInitializer();

    default DocumentReference get_trade(String trade_identifier) {

        assert false;
        return firebase_object.getFirestore()
                .collection("comercios_dev")
                .document(trade_identifier);
    }
}
