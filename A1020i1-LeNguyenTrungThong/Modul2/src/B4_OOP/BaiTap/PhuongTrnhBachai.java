package B4_OOP.BaiTap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PhuongTrnhBachai {
    private double a, b, c;

    private PhuongTrnhBachai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return (b*b)-4*a*c;
    }

    public double a(){
        return a;
    }

    public double b(){
        return b;
    }

    public double c(){
        return c;
    }

    public void n1(){

    }

    public static void main(String[] args) {
        PhuongTrnhBachai pt = new PhuongTrnhBachai(1,3,1);
        pt.n1();
    }
}
