package com.mx.totalplay.tradeinformation.services;

import java.util.concurrent.ExecutionException;

public interface InformationServices {

    Object get_information(String trade_identifier) throws ExecutionException, InterruptedException;

}
