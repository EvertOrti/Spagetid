package ee.khk.ikt;

public class Main {

    public static void main(String[] args) {
	// Võtame Oop kokku:
//        1)põhi roog: spagetid + tomatipasta - kindla hinnaga olemas ka lisandid - ntx. vorstid, hakkliha, seened
//                jne. lisa raha eest saab lisandeid juurde võtta. arvuta ja näita milline hind tuleb kokku
//                2) Laienda põhiklass nii, et oleks võimalik tellida: tervislik roog, salat ja oliivid
//                3) Laienda põhiklass nii

   Spagetid basicSpaghetti = new Spagetid("Bucatini", "Tomato", 4.99 );
       basicSpaghetti.setAddition1("mushrooms");
       basicSpaghetti.setAdditionPrice(1.50);
        System.out.println(basicSpaghetti.customizeSpaghetti());
   }

}
