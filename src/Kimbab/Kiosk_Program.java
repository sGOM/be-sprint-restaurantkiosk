package Kimbab;

import java.util.Scanner;

public class Kiosk_Program {

    Food[] menuArr = { new StandardKimbab(), new EggKimbab(), new ChungmuKimbab(), new Tteokbokki() };
    int     selectedMenu = 0;
    int     inputQty = 0;
    int     maxOrderQty = 99;
    int     minOrderQty = 1;

    public void input_print() {
        System.out.println(" [안녕] 안녕하세요. 김밥천국에 오신 것을 환영합니다. ");
        System.out.println("-".repeat(50));
    }

    public void print_menu_and_select() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" [안내] 원하시는 메뉴의 번호를 입력하여 주세요. ");
        while (true) {
            for (int i = 1; i <= menuArr.length; i++) {
                System.out.printf(" %d) ", i);
                menuArr[i - 1].printNameWithPrice();
            }
            System.out.println("");

            selectedMenu = get_int_input(1, menuArr.length, " [안내] 메뉴에 포함된 번호를 입력하여 주세요. \n");
            if (Integer.MIN_VALUE == selectedMenu)
                continue;
            break;
        }
        System.out.println("-".repeat(50));
    }

    public void get_qty_and_calc() {
        while(true) {
            System.out.println(" [안내] 선택하신 메뉴의 수량을 입력하여 주세요. ");
            System.out.println(String.format(" (※ 최대 주문 가능 수량 : %d) ", maxOrderQty));
            inputQty = get_int_input(minOrderQty, maxOrderQty,
                    String.format(" [경고] %d 이상 %d 이하를 입력하셔야 합니다. \n [경고] 수량 선택 화면으로 돌아갑니다. ", minOrderQty, maxOrderQty));
            if (Integer.MIN_VALUE == inputQty) {
                System.out.println("-".repeat(50));
                continue;
            }
            break;
        }
        System.out.println(String.format(" [안내] 주문하신 메뉴의 총 금액은 %d원 입니다. ", menuArr[selectedMenu - 1].getPrice() * inputQty));
    }

    public void output_print() {
        System.out.println(" [안내] 이용해 주셔서 감사합니다. ");
    }

    private int get_int_input(int min, int max, String warn) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.MIN_VALUE;

        System.out.printf(" 입력 : ");
        if (!sc.hasNextInt()){
            System.out.println(warn);
            sc.nextLine();
            return Integer.MIN_VALUE;
        }
        input = sc.nextInt();
        if (input < min || max < input) {
            System.out.println(warn);
            sc.nextLine();
            return Integer.MIN_VALUE;
        }
        return input;
    }
}
