package example;

//import mypackage.ArrayOfString;
import mypackage.WeatherWSLocator;
import mypackage.WeatherWSSoap_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class TyjWeatherClient {

    public static void main(String[] args) throws ServiceException, RemoteException {
        System.out.println("********欢迎使用tyj天气查询系统********");
        System.out.println("请输入您要查询的地方：");
        Scanner sc = new Scanner(System.in);
        String location = sc.next();
        WeatherWSLocator wl = new WeatherWSLocator();
       WeatherWSSoap_PortType weatherWSSoap_portType =  wl.getWeatherWSSoap();
       String[]  body = weatherWSSoap_portType.getWeather(location,null);
       // ArrayOfString weather = weatherWSSoap_portType.getWeather("长沙",null);
        //ArrayOfString body = weatherWSSoap_portType.getWeather("上海",null);
        //System.out.println(body.getString());
        for(String w:body){
            System.out.println(w);
        }
    }

}
