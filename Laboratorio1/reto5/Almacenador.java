package reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Almacenador{
    private HashSet<Integer> hashSet = new HashSet<>();
    private TreeSet<Integer> treeSet = new TreeSet<>();

    public void almacenarHashSet(int numero){ hashSet.add(numero);}
    public void almacenarTreeSet(int numero){ treeSet.add(numero);}
    
    public Set<Integer> filtrarHashSet() {return hashSet.stream().filter(n -> n % 3 != 0).collect(Collectors.toSet());}
    public Set<Integer> filtrarTreeSet() {return treeSet.stream().filter(n -> n % 5 != 0).collect(Collectors.toSet());}

    public void mostrarArena(){
        Set<Integer> hashFiltrado = filtrarHashSet();
        Set<Integer> treeFiltrado = filtrarTreeSet();

        Stream.concat(hashFiltrado.stream(), treeFiltrado.stream())
              .distinct()
              .sorted()
              .forEach(n -> System.out.println("Número en arena: " + n));
    }
}
