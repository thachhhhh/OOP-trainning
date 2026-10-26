public class CatalogueTestDrive {
    public static void main(String[] args) {
        Title[] catalogue = {
            new Film("Dune", 2021, 155),
            new Series("Bluey", 2018, 9, 7),
            new Documentary("Free Solo", 2018, 100, "climbing"),
            new ShortFilm("The Neighbors' Window", 2019, 20)
        };

        for (Title t : catalogue) {
            System.out.println(t);
        }

        int total = 0;
        for (Title t : catalogue) {
            total = total + t.runningTime();
        }

        System.out.println(catalogue.length + " titles, "
                + total + " min in total");
    }
}