package GraphBusinessTrip;

import Graph.Challenge.Graph;
import Graph.Challenge.Vertex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessTrip {

    public Integer tripCost(Graph graph , List<String> cites){
        Integer cost = 0 ;
        for (int i = 0 ; i < cites.size()-1 ; i++){
            Vertex<String> source = new Vertex<>(cites.get(i));
            Vertex<String> dest = new Vertex<>(cites.get(i+1));
            if (graph.getWeightedAdjVertices().get(source).get(dest) != null)
                 cost += graph.getWeightedAdjVertices().get(source).get(dest) ;
        }

        return cost ;


    }
}
