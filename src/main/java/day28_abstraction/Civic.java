package day28_abstraction;

public class Civic implements Engine, Ac , Hood{
// Bir class i bir interface in child i yapmak icin implements kullaniriz
    //    region Konstanten
    //    endregion

    //    region Attribute
    //    endregion

    //    regionKonstruktor
    //    endregion

    //    regionMethoden
            @Override
            public void eco() {
                System.out.println("Uses eco engine");
            }

            @Override
            public void gas() {
                System.out.println("Uses gas");
            }

            @Override
            public void tsi() {
                System.out.println("Uses tsi engine");
            }

            @Override
            public void digital() {
                System.out.println("Uses digital AC");
            }

            @Override
            public void climate() {
                System.out.println("Uses climate in AC");
            }

            @Override
            public void steel() {
                System.out.println("Uses hood");
            }
//    endregion

}
