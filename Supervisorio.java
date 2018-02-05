package Serial;

public class Supervisorio {

    public static void main(String[] args) throws InterruptedException {
        SerialRxTx serial = new SerialRxTx();
        Sistema_interno system = new Sistema_interno();
        if(serial.iniciaSerial()){
            while("##47".equals(serial.getProtocolo().getSenha()) == false){
                system.pega_aula(serial.getProtocolo().getSenha());
                Thread.sleep(600);
            }
        }
        try {
            serial.close();
        } catch (Exception e){
            System.out.println("Erro ao liberar porta " + serial.getSerialportname());
        }
    }
}
