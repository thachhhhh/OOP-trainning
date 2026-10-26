class Title {
    private String name;
    private int year;

    public Title(String name, int year) { //first error
        this.name = name;
        this.year = year;
    }

    public String getName() { return name; }
    public int runningTime() { return 0; }
    public String kind() { return "Title"; }
}

class Film extends Title {
    private int duration;

    Film(String name, int year, int duration) {
        super(name, year);
        this.duration = duration;
    }

    @Override
    public int runningTime() { return duration; }

    @Override
    public String kind() { return "Film"; }
}

class Series extends Title {
    private int episodes;
    private int minutesPerEpisode;

    Series(String name, int year, int episodes, int minutesPerEpisode) {
        super(name,year);
        this.episodes = episodes;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public int getEpisodes() { return episodes; }
    public int minutesPerEpisode(){return minutesPerEpisode; }
    @Override
    public int runningTime() { return episodes * minutesPerEpisode; }
    
}

public class Catalogue {
    public static void main(String[] args) {
        Title[] items = { new Film("Dune", 2021, 155),
                          new Series("Bluey", 2018, 9, 7) };

        for (Title t : items) {
            System.out.println(t.kind() + ": " + t.getName()
                + " - " + t.runningTime() + " min");
        }

        System.out.println(((Series)items[1]).getEpisodes() + " episodes");
        // because title doesnt have getEpisodes so u gotta choose the right reference which is series ((Series)items[1])
    }
}