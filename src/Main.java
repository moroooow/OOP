import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        {
            List<Mammals> srcCollection = new ArrayList<>();
            srcCollection.add(new Manul("Vova"));
            srcCollection.add(new Lynx("Stas"));
            srcCollection.add(new CommonHedgehog("Leha"));

            List<Hedgehogs> collectionOfHedgehogs = new ArrayList<>();
            List<Predators> collectionOfPredators = new ArrayList<>();
            List<Felines> collectionOfFelines = new ArrayList<>();
            segregate(srcCollection, collectionOfHedgehogs, collectionOfFelines, collectionOfPredators);
            printAnimals(collectionOfHedgehogs);
            printAnimals(collectionOfFelines);
            printAnimals(collectionOfPredators);
        }

        {
            List<Predators> srcCollection = new ArrayList<>();
            srcCollection.add(new Lynx("lynx1"));
            srcCollection.add(new Lynx("lynx2"));
            srcCollection.add(new Lynx("lynx3"));
            srcCollection.add(new Manul("manul1"));
            srcCollection.add(new Manul("manul2"));

            List<Chordates> collectionOfChordates=new ArrayList<>();
            List<Manul> collectionOfManuls=new ArrayList<>();
            List<Felines> collectionOfFelines=new ArrayList<>();
            segregate(srcCollection,collectionOfChordates,collectionOfManuls,collectionOfFelines);
            printAnimals(collectionOfChordates);
            printAnimals(collectionOfManuls);
            printAnimals(collectionOfFelines);
        }

        {
            List<Hedgehogs> srcCollection = new ArrayList<>();
            srcCollection.add(new CommonHedgehog("Hedgehog1"));
            srcCollection.add(new CommonHedgehog("Hedgehog2"));
            srcCollection.add(new CommonHedgehog("Hedgehog3"));

            List<Insectivores> collectionOfInsectivores = new ArrayList<>();
            List<Predators> collectionOfPredators1 = new ArrayList<>();
            List<Predators> collectionOfPredators2 = new ArrayList<>();


            segregate(srcCollection,collectionOfInsectivores,collectionOfPredators1,collectionOfPredators2);
            printAnimals(collectionOfInsectivores);
            printAnimals(collectionOfPredators1);
            printAnimals(collectionOfPredators2);
        }
    }

    private static void printAnimals(final List<? extends Chordates> collection)
    {
        if(collection.isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        for(Chordates animal : collection)
        {
            System.out.print(animal.getName()+" ");
        }
        System.out.println();
    }

    private static void segregate(List<? extends Chordates> srcCollection, List<? super CommonHedgehog> collection1,
                                  List<? super Manul>collection2, List<? super Lynx> collection3) {
        for (Chordates animal: srcCollection)
        {
            if(animal instanceof CommonHedgehog)
            {
                collection1.add((CommonHedgehog) animal);
            }
            if (animal instanceof Manul)
            {
                collection2.add((Manul) animal);
            }

            if (animal instanceof Lynx)
            {
                collection3.add((Lynx) animal);
            }
        }
    }
}