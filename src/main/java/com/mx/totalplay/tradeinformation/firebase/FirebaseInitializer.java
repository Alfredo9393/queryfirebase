package com.mx.totalplay.tradeinformation.firebase;

import java.io.IOException;
import javax.annotation.PostConstruct;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.cloud.firestore.Firestore;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.beans.factory.annotation.Value;


@Service
public class FirebaseInitializer {

    @Value("classpath:fintech-delivery-dev-firebase-adminsdk-pl8qi-695e1a9bc4.json")
    private Resource resource;

    @PostConstruct
    private void fireStoreInit() throws IOException {
        FirebaseOptions options_object = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(resource.getInputStream()))
                .setProjectId("fintech-delivery-dev")
                .setDatabaseUrl("https://fintech-delivery-dev.firebaseio.com")
                .build();

        if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options_object);
        }
    }

    public Firestore getFirestore() {
        return FirestoreClient.getFirestore();
    }

}
