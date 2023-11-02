package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class Calculate{
    @WebMethod
    public int calculateTax(int income) {
        if (income <= 5000) {
            return 0;
        } else if (income <= 10000) {
            return (income - 5000) * 10 / 100;
        } else if (income <= 20000) {
            return 5000 * 10 / 100 + (income - 10000) * 20 / 100;
        } else {
            return 5000 * 10 / 100 + 10000 * 20 / 100 + (income - 20000) * 30 / 100;
        }
    }
    public static void main(String[] argv) {
        Object implementor = new Calculate();
        String address = "http://localhost:8081/calculateTax";
        Endpoint.publish(address, implementor);
        System.out.println("WebService发布成功");
    }
}
