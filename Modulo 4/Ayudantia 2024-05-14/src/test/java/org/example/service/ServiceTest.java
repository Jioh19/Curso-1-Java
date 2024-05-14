package org.example.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ServiceClienteTest.class, ServiceCuentaTest.class})
public class ServiceTest {
    public ServiceTest() {
    }
}
