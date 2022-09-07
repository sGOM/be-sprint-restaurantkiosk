import Kimbab.Kiosk_Program;

public class Main {
    public static void main(String[] args) {
        Kiosk_Program kp = new Kiosk_Program();
        kp.input_print();
        kp.print_menu_and_select();
        kp.get_qty_and_calc();
        kp.output_print();
    }
}
