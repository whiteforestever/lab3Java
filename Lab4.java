import Animate.Human;
import Animate.LivingCreatures;
import Animate.Shortie;
import Animate.Shortie.HeavyMax;
import Constants.Activities;
import Constants.Area;
import Constants.Clothes;
import Constants.Effort;
import Constants.Poses;
import Constants.Speed;
import Inanimate.Entity;
import Inanimate.Inanimate;
import Inanimate.Supplement;
import Place.Cave;
import Place.Place;
import Exceptions.*;

public class Lab4 {
    public static void main(String... args) throws VeryHeavy {
        
        Shortie jack = new Shortie("Jack");
        Shortie blade = new Shortie("Blade");
        Shortie roman = new Shortie("Roman");
        Shortie artur = new Shortie("Artur");
        Shortie fuchsia = new Shortie("Fuchsia");
        Shortie seledochka = new Shortie("Seledochka");
        Human znaika = new Human("Znaika");
        Human zvezdochkin = new Human("Professor Zvezdochkin");


        Inanimate experience = new Entity("experience");

        Cave bottomOfCave = new Cave(Area.BOTTOM);

        Cave ceilingOfCave = new Cave(Area.CEILING);

        Inanimate attempts = new Entity("attempts", "unsuccesful");

        Entity bodymovements = new Entity("bodymovements", "their");

        Supplement reactiveForces = new Supplement("reactive forces");
        Entity movement = new Entity("movement");

        Entity fact = new Entity("fact");
        Entity confusion = new Entity();

        Entity effect = new Entity("effect");
        Entity weightlessness = new Entity("weightlessness");

        Place initial = new Cave(Area.INITIAL);
        Place ultimate = new Cave(Area.ULTIMATE);
        Supplement device = new Supplement("device", "weightlessness");

        Place farCornersOfCave = new Cave(Area.FAR_CORNERS);

        Entity changes = new Entity("changes", "in gravity");
        Supplement scale = new Supplement("scale", "spring");

        Cave cave = new Cave(Area.SOMEWHERE);
        Supplement[] supplementsInCave = {device, scale, reactiveForces};
        cave.setSubjects(supplementsInCave);
        LivingCreatures[] livingCreaturesInCave = {jack, blade, roman, artur, znaika, zvezdochkin};
        cave.setLivingCreatures(livingCreaturesInCave);

        jack.setClothes(Clothes.HugeSpaceSuit);
        blade.setClothes(Clothes.HugeSpaceSuit);
        roman.setClothes(Clothes.HugeSpaceSuit);
        artur.setClothes(Clothes.HugeSpaceSuit);
        znaika.setClothes(Clothes.HugeSpaceSuit);
        zvezdochkin.setClothes(Clothes.HugeSpaceSuit);

        Supplement aluniteCrystal = new Supplement("alunite crystal", "the biggest");
        jack.activitySupplement(Activities.CHOOSE, aluniteCrystal);
        blade.activitySupplement(Activities.CHOOSE, aluniteCrystal);
        roman.activitySupplement(Activities.CHOOSE, aluniteCrystal);
        artur.activitySupplement(Activities.CHOOSE, aluniteCrystal);

        /**
         * проверка работы внутреннего non-static class
         */
        // Shortie.CurrentPlace placeArtur = artur.new CurrentPlace();
        // placeArtur.setFullInfoAboutPlace();
        // artur.getFullInfoAboutPlace();

        Supplement magnet = new Supplement("magnet", "the strongest");
        jack.activitySupplement(Activities.TAKE, magnet);
        blade.activitySupplement(Activities.TAKE, magnet);
        roman.activitySupplement(Activities.TAKE, magnet);
        artur.activitySupplement(Activities.TAKE, magnet);

        aluniteCrystal.moreDescriptionForSupplement("was taken to the moon in a rocket");
        magnet.moreDescriptionForSupplement("was taken to the moon in a rocket");

        device.setDescription("new");
        jack.activityToActivityWithSupplement(Activities.TRIED, Activities.DESIGN, device);
        blade.activityToActivityWithSupplement(Activities.TRIED, Activities.DESIGN, device);
        roman.activityToActivityWithSupplement(Activities.TRIED, Activities.DESIGN, device);
        artur.activityToActivityWithSupplement(Activities.TRIED, Activities.DESIGN, device);

        // создание внутреннего класса местоположения для коротышек
        Shortie.CurrentPlace currentPlaceJack = jack.new CurrentPlace("Cave", Area.SOMEWHERE);
        Shortie.CurrentPlace currentPlaceBlade = blade.new CurrentPlace("Cave", Area.SOMEWHERE);
        Shortie.CurrentPlace currentPlaceRoman = roman.new CurrentPlace("Cave", Area.SOMEWHERE);
        Shortie.CurrentPlace currentPlaceArtur = artur.new CurrentPlace("Cave", Area.SOMEWHERE);
        currentPlaceJack.setFullInfoAboutPlace();
        currentPlaceBlade.setFullInfoAboutPlace();
        currentPlaceRoman.setFullInfoAboutPlace();
        currentPlaceArtur.setFullInfoAboutPlace();
        jack.getFullInfoAboutPlace();
        blade.getFullInfoAboutPlace();
        roman.getFullInfoAboutPlace();
        artur.getFullInfoAboutPlace();

        // Inanimate experience = new Entity("experience");
        jack.activityWithInanimate(Activities.ATTENDED, experience);
        blade.activityWithInanimate(Activities.ATTENDED, experience);
        roman.activityWithInanimate(Activities.ATTENDED, experience);
        artur.activityWithInanimate(Activities.ATTENDED, experience);

        // Cave bottomOfCave = new Cave(Area.BOTTOM);
        jack.activityWithExactPlaceWithSpeed(Activities.SEPARATED, Speed.FAST, bottomOfCave);
        blade.activityWithExactPlaceWithSpeed(Activities.SEPARATED, Speed.FAST, bottomOfCave);
        roman.activityWithExactPlaceWithSpeed(Activities.SEPARATED, Speed.FAST, bottomOfCave);
        artur.activityWithExactPlaceWithSpeed(Activities.SEPARATED, Speed.FAST, bottomOfCave);

        jack.setSelfActivity(Activities.GOT_UP);
        blade.setSelfActivity(Activities.GOT_UP);
        roman.setSelfActivity(Activities.GOT_UP);
        artur.setSelfActivity(Activities.GOT_UP);
        System.out.println(jack.getName() + " " + jack.getSelfActivity());
        System.out.println(blade.getName() + " " +  blade.getSelfActivity());
        System.out.println(roman.getName() + " " +  roman.getSelfActivity());
        System.out.println(artur.getName() + " " +  artur.getSelfActivity());

        // Cave ceilingOfCave = new Cave(Area.CEILING);
        Activities swimming = Activities.SWIMMING;
        swimming.setPose(Poses.DIFFERENT);
        jack.activityWithExactPlace(Activities.SWIMMING, ceilingOfCave);
        blade.activityWithExactPlace(Activities.SWIMMING, ceilingOfCave);
        roman.activityWithExactPlace(Activities.SWIMMING, ceilingOfCave);
        artur.activityWithExactPlace(Activities.SWIMMING, ceilingOfCave);

        jack.activityToActivityWithDegreeOfEffort(Activities.TRIED, Activities.GO_DOWN, Effort.WITHALLMIGHT);
        blade.activityToActivityWithDegreeOfEffort(Activities.TRIED, Activities.GO_DOWN, Effort.WITHALLMIGHT);
        roman.activityToActivityWithDegreeOfEffort(Activities.TRIED, Activities.GO_DOWN, Effort.WITHALLMIGHT);
        artur.activityToActivityWithDegreeOfEffort(Activities.TRIED, Activities.GO_DOWN, Effort.WITHALLMIGHT);

        // Inanimate attempts = new Entity("attempts", "unsuccesful");
        System.out.println(attempts.getInanimate());

        System.out.println(jack.getName() + " " + jack.getClothes());
        System.out.println(blade.getName() + " " + blade.getClothes());
        System.out.println(roman.getName() + " " + roman.getClothes());
        System.out.println(artur.getName() + " " + artur.getClothes());

        // Entity bodymovements = new Entity("bodymovements", "their");
        jack.activityToActivityWithEntity(Activities.COULDNOT, Activities.CALCULATE, bodymovements);
        blade.activityToActivityWithEntity(Activities.COULDNOT, Activities.CALCULATE, bodymovements);
        roman.activityToActivityWithEntity(Activities.COULDNOT, Activities.CALCULATE, bodymovements);
        artur.activityToActivityWithEntity(Activities.COULDNOT, Activities.CALCULATE, bodymovements);

        // Supplement reactiveForces = new Supplement("reactive forces");
        jack.addSupplement(reactiveForces);
        blade.addSupplement(reactiveForces);
        roman.addSupplement(reactiveForces);
        artur.addSupplement(reactiveForces);
        // Entity movement = new Entity("movement");
        jack.activityUsingSupplementForEntity(Activities.USE, jack.reachSupplement(reactiveForces), movement);
        blade.activityUsingSupplementForEntity(Activities.USE, blade.reachSupplement(reactiveForces), movement);
        roman.activityUsingSupplementForEntity(Activities.USE, roman.reachSupplement(reactiveForces), movement);
        artur.activityUsingSupplementForEntity(Activities.USE, artur.reachSupplement(reactiveForces), movement);

        // Entity fact = new Entity("fact");
        // Entity confusion = new Entity();
        confusion.setName("confusion");
        confusion.setDescription("general");
        Activities exposed = Activities.EXPOSED;
        exposed.setSubject(confusion);
        fact.setActivities(exposed);
        fact.getEntityWithActivity();

        // Entity effect = new Entity("effect");
        // Entity weightlessness = new Entity("weightlessness");
        effect.setObject(weightlessness);
        znaika.activityOfEntity(Activities.DONTAFFECTED, effect);
        zvezdochkin.activityOfEntity(Activities.DONTAFFECTED, effect);

        znaika.activityToActivityWithDegreeOfEffort(Activities.CONTINUED, Activities.WORK, Effort.NONSTRESSED);
        zvezdochkin.activityToActivityWithDegreeOfEffort(Activities.CONTINUED, Activities.WORK, Effort.NONSTRESSED);

        // Place initial = new Cave(Area.INITIAL);
        // Place ultimate = new Cave(Area.ULTIMATE);
        Activities transferredZnaika = Activities.TRANSFERRED;
        Activities transferredZvezdochkin = Activities.TRANSFERRED;
        transferredZnaika.setFrom(initial);
        transferredZvezdochkin.setTo(ultimate);
        // Supplement device = new Supplement("device", "weightlessness");
        device.setDescription("weightlessness");
        znaika.addSupplement(device);
        zvezdochkin.addSupplement(device);
        transferredZnaika.setObject(znaika.reachSupplement(device));
        transferredZvezdochkin.setObject(znaika.reachSupplement(device));
        znaika.setSelfActivity(transferredZnaika);
        zvezdochkin.setSelfActivity(transferredZvezdochkin);
        System.out.println(znaika.getName() + " " + znaika.getSelfActivity());
        System.out.println(zvezdochkin.getName() + " " + zvezdochkin.getSelfActivity());

        // Place farCornersOfCave = new Cave(Area.FAR_CORNERS);
        znaika.activityWithExactPlace(Activities.DEPARTED, farCornersOfCave);
        zvezdochkin.activityWithExactPlace(Activities.DEPARTED, farCornersOfCave);

        // Entity changes = new Entity("changes", "in gravity");
        // Supplement scale = new Supplement("scale", "spring");
        znaika.addSupplement(scale);
        zvezdochkin.addSupplement(scale);
        znaika.activityOnEntityWithSupplement(Activities.CHECKED, changes, znaika.reachSupplement(scale));
        zvezdochkin.activityOnEntityWithSupplement(Activities.CHECKED, changes, zvezdochkin.reachSupplement(scale));

        Activities ask = Activities.ASK;
        ask.setAbout("zero-gravity inactivity");

        jack.activityToAnimate(ask, znaika);
        jack.activityToAnimate(ask, zvezdochkin);
        blade.activityToAnimate(ask, znaika);
        blade.activityToAnimate(ask, zvezdochkin);
        roman.activityToAnimate(ask, znaika);
        roman.activityToAnimate(ask, zvezdochkin);
        artur.activityToAnimate(ask, znaika);
        artur.activityToAnimate(ask, zvezdochkin);

        znaika.setSelfActivity(Activities.LAUGH);
        zvezdochkin.setSelfActivity(Activities.LAUGH);
        znaika.seeSelfActivity();
        zvezdochkin.seeSelfActivity();

        znaika.activityToActivity(Activities.PRETENDED, Activities.DONTHEAR);
        zvezdochkin.activityToActivity(Activities.PRETENDED, Activities.DONTHEAR);

        znaika.setSelfActivity(Activities.CONFESS);
        zvezdochkin.setSelfActivity(Activities.CONFESS);
        znaika.seeSelfActivity();
        zvezdochkin.seeSelfActivity();

        aluniteCrystal.setDescription("saving weight");
        znaika.activitySupplement(Activities.DISCOVER, aluniteCrystal);
        zvezdochkin.activitySupplement(Activities.DISCOVER, aluniteCrystal);
    }
}