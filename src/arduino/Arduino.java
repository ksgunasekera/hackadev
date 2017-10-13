/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduino;
import com.fazecast.jSerialComm.*;
import java.util.Scanner;

/**
 *
 * @author Gunasekera
 */
public class Arduino {
    public static int portIndex;
    public static SerialPort chosenPort;
    private SerialPort ports[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SerialPort ports[]=SerialPort.getCommPorts();
       for(SerialPort port:ports){
         System.out.println(port.getDescriptivePortName());
        }
       new GUI(ports).setVisible(true);
       Scanner s=new Scanner(System.in);
        //GUI g=new GUI();
        //g.tomba();
    }

    /**
     * @return the ports
     */
    public SerialPort[] getPorts() {
        return ports;
    }

    /**
     * @param ports the ports to set
     */
    public void setPorts(SerialPort[] ports) {
        this.ports = ports;
    }
    
}
