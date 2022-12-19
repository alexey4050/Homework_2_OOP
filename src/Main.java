public class Main {
    public static void main(String[] args) {
        Pool pool = new Pool();
        System.out.println("Животные в водоёме: ");
        pool.addWaterfowl(new Fish("Dory", 1, 0, "scales", "Egor"))
                .addWaterfowl(new Octopus("Gery", 0, 8, "derma", "Georgiy"))
                .addWaterfowl(new Pinguin("Lord", 1, 2, "plumage", "Denis" ));
        System.out.println(pool.toString() + "\n");
        System.out.println("С какой скоростью животные плавает:");
        for(Swimable i : pool.getSwimable()){
            System.out.print(i.swimSpeed() + " ");
        }
        System.out.println();
        System.out.println("Кто выйграл в заплыве(Who is Champion?): ");
        System.out.println(pool.getChampionSpeed());

        AlbumWaterfowls saveManagerAnimals = new AlbumWaterfowls();
        saveManagerAnimals.save(pool.getWaterfowls());

    }
}