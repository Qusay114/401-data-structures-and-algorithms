/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graph.Challenge;

import GraphBusinessTrip.BusinessTrip;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

//        Graph graph = new Graph();
//        graph.addVertex("Qusay");
//        graph.addVertex("Ali");
//        graph.addVertex("Hadi");
//        graph.addVertex("Jafar");
//
//        graph.addEdge("Qusay" , "Ali");
//        graph.addEdge("Qusay" , "Hadi");
//        graph.addEdge("Qusay" , "Jafar");

//        System.out.println(graph.toString());

//        System.out.println(graph.bft("Qusay").toString());
//        System.out.println(graph.dft("Qusay").toString());

//        System.out.println(graph.getNeighbors("Qusay"));

//        graph.addVertex("Amman") ;
//        graph.addVertex("Mafraq") ;
//        graph.addVertex("Zarqa");
//        graph.addVertex("Irbid");
//
//        graph.addWeightedEdge("Mafraq" , "Zarqa" , 10);
//        graph.addWeightedEdge("Mafraq" , "Amman" , 35);
//        graph.addWeightedEdge("Amman" , "Zarqa" , 15);
//        graph.addWeightedEdge("Mafraq" ,"Irbid" , 17);
//
////        System.out.println(graph.getWeightedGraph());
//
//        BusinessTrip businessTrip = new BusinessTrip();
//        List<String> cities = new ArrayList<>();
//        cities.add("Amman");
//        cities.add("Zarqa") ;
//        cities.add("Mafraq");
//        cities.add("Irbid");
//
//        System.out.println(businessTrip.tripCost(graph , cities));


        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A","D");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("B","C");
        graph.addEdge("C","G");
        graph.addEdge("D","F");
        graph.addEdge("D","H");
        graph.addEdge("D","E");
        graph.addEdge("F","H");

        System.out.println(graph.dft("A").toString());


    }

}
