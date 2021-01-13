public class Lab3{
    public static void main(String... args){
        
        Shorties shorties = new Shorties();
        ServiceWords by = (ServiceWords) Enum.valueOf(ServiceWords.class, "BY");
        Experience experience = new Experience("experience", "this");
        ServiceWords from = Enum.valueOf(ServiceWords.class, "FROM");
        Cave cave = new Cave();
        ServiceWords and = Enum.valueOf(ServiceWords.class, "AND");
        ServiceWords under = Enum.valueOf(ServiceWords.class, "UNDER");
        ServiceWords but = Enum.valueOf(ServiceWords.class, "BUT");
        Attempts attempts = new Attempts("attempts", "their");
        BodyMovements bodyMovements = new BodyMovements("bodymovements", "their");
        ReactiveForces reactiveForces = new ReactiveForces("reactive forces", "to move in space");
        Confusion confusion = new Confusion("confusion", "general");
        Fact fact = new Fact("fact", "That");
        ServiceWords that = Enum.valueOf(ServiceWords.class, "THAT");
        Znaika znaika = new Znaika();
        znaika.setName("Znaika");
        ProfessorZvezdochkin professorZvezdochkin = new ProfessorZvezdochkin();
        professorZvezdochkin.setName("Professor Zvezdochkin");
        Effect effect = new Effect("effect", "weightlessness");
        Device device = new Device("device", "weightlessness");
        Helping helping = new Helping("helping", "a spring scale");
        Change change = new Change("changes", "gravity forces", "in different places");
        

        System.out.print(shorties.getName() + " ");
        System.out.print(shorties.did("attended") + " ");
        System.out.print(by.getServiceWord() + " ");
        System.out.print(experience.getPhrase() + ", ");
        System.out.print(shorties.statusDid("separated", "at the same time") + " ");
        System.out.print(from.getServiceWord() + " ");
        System.out.print(cave.getBottom() + " of the " + cave.getClass().getName().toLowerCase() + " ");
        System.out.print(and.getServiceWord() + " ");
        System.out.print(shorties.did("got up") + ". ");
        System.out.print(shorties.statusDid("swimming", "In a wide variety of poses") + " ");
        System.out.print(under.getServiceWord() + " ");
        System.out.print(cave.getCeiling() + " of the " + cave.getClass().getName().toLowerCase() + ", ");
        shorties.setName("they");
        System.out.print(shorties.getName() + " ");
        System.out.print(shorties.statusDid("tried", "strongly") + " ");
        System.out.print(but.getServiceWord() + " ");
        System.out.print(attempts.getPhrase() + " ");
        System.out.print(attempts.statusDid("were", "little success") + ". ");
        System.out.print(shorties.did("Wearing") + " ");
        System.out.print(shorties.getClothes() + ", ");
        System.out.print(shorties.getName() + " ");
        System.out.print(shorties.did("can't") + " ");
        System.out.print(shorties.statusDid("calculate", "accurately") + " ");
        System.out.print(bodyMovements.getPhrase() + " ");
        System.out.print(and.getServiceWord() + " ");
        System.out.print(shorties.did("to use") + " ");
        System.out.print(reactiveForces.getPhrase() + ". ");
        System.out.print(fact.getPhrase() + " ");
        System.out.print(fact.did("caused") + " ");
        System.out.print(confusion.getPhrase() + ", ");
        System.out.print(that.getServiceWord() + " ");
        System.out.print(znaika.getName() + " ");
        System.out.print(and.getServiceWord() + " ");
        System.out.print(professorZvezdochkin.getName() + " ");
        System.out.print(shorties.statusDid("haven't undergone", "for some reason") + " ");
        System.out.print(effect.getPhrase() + " ");
        System.out.print(and.getServiceWord() + " ");
        System.out.print(shorties.statusDid("to continue", "as if nothing had happened") + " ");
        System.out.print(shorties.did("work of ") + cave.getBottom() + " ");
        System.out.print(shorties.getName() + " ");
        System.out.print(shorties.statusDid("transferred", "from place to place") + " ");
        System.out.print(device.getPhrase() + ", ");
        System.out.print(shorties.did("retreated") + " ");
        System.out.print(from.getServiceWord() + " him" + " ");
        System.out.print(cave.getFarCorners() + " of the " + cave.getClass().getName().toLowerCase() + ", ");
        System.out.print(shorties.did("checking") + " ");
        System.out.print(by.getServiceWord() + " ");
        System.out.print(helping.getPhrase() + " ");
        System.out.print(change.getPhrase() + ".");

    }
}