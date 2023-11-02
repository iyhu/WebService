/**
 * CalculateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class CalculateServiceLocator extends org.apache.axis.client.Service implements mypackage.CalculateService {

    public CalculateServiceLocator() {
    }


    public CalculateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculatePort
    private java.lang.String CalculatePort_address = "http://localhost:8081/calculateTax";

    public java.lang.String getCalculatePortAddress() {
        return CalculatePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculatePortWSDDServiceName = "CalculatePort";

    public java.lang.String getCalculatePortWSDDServiceName() {
        return CalculatePortWSDDServiceName;
    }

    public void setCalculatePortWSDDServiceName(java.lang.String name) {
        CalculatePortWSDDServiceName = name;
    }

    public mypackage.Calculate getCalculatePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculatePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculatePort(endpoint);
    }

    public mypackage.Calculate getCalculatePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.CalculatePortBindingStub _stub = new mypackage.CalculatePortBindingStub(portAddress, this);
            _stub.setPortName(getCalculatePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculatePortEndpointAddress(java.lang.String address) {
        CalculatePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.Calculate.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.CalculatePortBindingStub _stub = new mypackage.CalculatePortBindingStub(new java.net.URL(CalculatePort_address), this);
                _stub.setPortName(getCalculatePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculatePort".equals(inputPortName)) {
            return getCalculatePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example/", "CalculateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example/", "CalculatePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculatePort".equals(portName)) {
            setCalculatePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
