package com.hbsoft.opc.informationmodel;
import opc.sdk.server.core.UAServerApplicationInstance;
public class InformationModel {
public void init(UAServerApplicationInstance server){
new Model0().init(server);
new Model0_auth().init(server);
new Model1().init(server);
new Model1_auth().init(server);
new Model2().init(server);
new Model2_auth().init(server);
}
}