package com.distribuida.trabajo.app01;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.kumuluz.ee.discovery.annotations.RegisterService;

@ApplicationPath("/")
@RegisterService
public class App01Application extends Application {

}
